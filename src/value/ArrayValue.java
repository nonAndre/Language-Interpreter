package value;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayValue extends ExpValue<List<?>> {
    private final List<ExpValue<?>> values;

    public ArrayValue(List<ExpValue<?>> values) {
        super(new ArrayList<>(values));
        this.values = new ArrayList<>(values);
    }

    public void set(int index, ExpValue<?> value) {
        if (index < values.size()) {
            values.set(index, value);
        } else if (index == values.size()) {
            values.add(value);
        } else {
            throw new IndexOutOfBoundsException("Cannot insert beyond next index.");
        }
    }

    public List<ExpValue<?>> getValues() {
        return values;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ArrayValue)) return false;
        ArrayValue other = (ArrayValue) obj;
        return values.equals(other.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
}
