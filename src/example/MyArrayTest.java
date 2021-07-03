package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    MyArray arr;

    @BeforeEach
    void setup() {
        arr = new MyArray(5);
    }

    @Test
    void 배열_기본_삽입() {
        arr.put(10);
        arr.put(20);
        arr.put(30);
        arr.put(40);
        arr.put(50);
        assertEquals(arr.get(0), 10);
    }

    @Test
    void 배열의_현재_인덱스를_초과하는_삽입시_현재인덱스로_강제_삽입() {
        arr.put(1, 10);
        assertEquals(arr.get(0), 10);
    }

    @Test
    void 배열의_길이를_초과하는_삽입_예외() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> arr.put(10, 100));
    }

    @Test
    void 배열의_중간에_삽입() {
        arr.put(10);
        arr.put(20);
        arr.put(30);
        arr.put(2, 25);

        assertEquals(arr.get(2), 25);
        assertEquals(arr.get(3), 30);
    }

    @Test
    void 배열_삭제() {
        arr.put(10);
        arr.put(20);
        arr.put(30);
        arr.put(40);
        arr.put(50);

        arr.delete(3);
        assertEquals(arr.get(3), 50);

        arr.delete(0);
        assertEquals(arr.get(0), 20);
    }
}