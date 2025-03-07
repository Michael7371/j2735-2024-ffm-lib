// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     int __count;
 *     union {
 *         unsigned int __wch;
 *         char __wchb[4];
 *     } __value;
 * }
 * }
 */
public class __mbstate_t {

    __mbstate_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("__count"),
        __value.layout().withName("__value")
    ).withName("$anon$13:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt __count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __count
     * }
     */
    public static final OfInt __count$layout() {
        return __count$LAYOUT;
    }

    private static final long __count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __count
     * }
     */
    public static final long __count$offset() {
        return __count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __count
     * }
     */
    public static int __count(MemorySegment struct) {
        return struct.get(__count$LAYOUT, __count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __count
     * }
     */
    public static void __count(MemorySegment struct, int fieldValue) {
        struct.set(__count$LAYOUT, __count$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * }
     * }
     */
    public static class __value {

        __value() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MessageFrame_h.C_INT.withName("__wch"),
            MemoryLayout.sequenceLayout(4, MessageFrame_h.C_CHAR).withName("__wchb")
        ).withName("$anon$16:3");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt __wch$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__wch"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned int __wch
         * }
         */
        public static final OfInt __wch$layout() {
            return __wch$LAYOUT;
        }

        private static final long __wch$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned int __wch
         * }
         */
        public static final long __wch$offset() {
            return __wch$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned int __wch
         * }
         */
        public static int __wch(MemorySegment union) {
            return union.get(__wch$LAYOUT, __wch$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned int __wch
         * }
         */
        public static void __wch(MemorySegment union, int fieldValue) {
            union.set(__wch$LAYOUT, __wch$OFFSET, fieldValue);
        }

        private static final SequenceLayout __wchb$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__wchb"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static final SequenceLayout __wchb$layout() {
            return __wchb$LAYOUT;
        }

        private static final long __wchb$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static final long __wchb$offset() {
            return __wchb$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static MemorySegment __wchb(MemorySegment union) {
            return union.asSlice(__wchb$OFFSET, __wchb$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static void __wchb(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, __wchb$OFFSET, __wchb$LAYOUT.byteSize());
        }

        private static long[] __wchb$DIMS = { 4 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static long[] __wchb$dimensions() {
            return __wchb$DIMS;
        }
        private static final VarHandle __wchb$ELEM_HANDLE = __wchb$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static byte __wchb(MemorySegment union, long index0) {
            return (byte)__wchb$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * char __wchb[4]
         * }
         */
        public static void __wchb(MemorySegment union, long index0, byte fieldValue) {
            __wchb$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout __value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("__value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * } __value
     * }
     */
    public static final GroupLayout __value$layout() {
        return __value$LAYOUT;
    }

    private static final long __value$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * } __value
     * }
     */
    public static final long __value$offset() {
        return __value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * } __value
     * }
     */
    public static MemorySegment __value(MemorySegment struct) {
        return struct.asSlice(__value$OFFSET, __value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     unsigned int __wch;
     *     char __wchb[4];
     * } __value
     * }
     */
    public static void __value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __value$OFFSET, __value$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

