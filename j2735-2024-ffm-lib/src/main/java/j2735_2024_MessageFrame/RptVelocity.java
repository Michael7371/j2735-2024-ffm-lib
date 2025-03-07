// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RptVelocity {
 *     Speed_t speed;
 *     StdDev_t *speedStdDev;
 *     Heading_t *heading;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RptVelocity {

    RptVelocity() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("speed"),
        MessageFrame_h.C_POINTER.withName("speedStdDev"),
        MessageFrame_h.C_POINTER.withName("heading"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RptVelocity");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong speed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("speed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static final OfLong speed$layout() {
        return speed$LAYOUT;
    }

    private static final long speed$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static final long speed$offset() {
        return speed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static long speed(MemorySegment struct) {
        return struct.get(speed$LAYOUT, speed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Speed_t speed
     * }
     */
    public static void speed(MemorySegment struct, long fieldValue) {
        struct.set(speed$LAYOUT, speed$OFFSET, fieldValue);
    }

    private static final AddressLayout speedStdDev$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("speedStdDev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * StdDev_t *speedStdDev
     * }
     */
    public static final AddressLayout speedStdDev$layout() {
        return speedStdDev$LAYOUT;
    }

    private static final long speedStdDev$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * StdDev_t *speedStdDev
     * }
     */
    public static final long speedStdDev$offset() {
        return speedStdDev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * StdDev_t *speedStdDev
     * }
     */
    public static MemorySegment speedStdDev(MemorySegment struct) {
        return struct.get(speedStdDev$LAYOUT, speedStdDev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * StdDev_t *speedStdDev
     * }
     */
    public static void speedStdDev(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(speedStdDev$LAYOUT, speedStdDev$OFFSET, fieldValue);
    }

    private static final AddressLayout heading$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("heading"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Heading_t *heading
     * }
     */
    public static final AddressLayout heading$layout() {
        return heading$LAYOUT;
    }

    private static final long heading$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Heading_t *heading
     * }
     */
    public static final long heading$offset() {
        return heading$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Heading_t *heading
     * }
     */
    public static MemorySegment heading(MemorySegment struct) {
        return struct.get(heading$LAYOUT, heading$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Heading_t *heading
     * }
     */
    public static void heading(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(heading$LAYOUT, heading$OFFSET, fieldValue);
    }

    private static final GroupLayout _asn_ctx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_asn_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final GroupLayout _asn_ctx$layout() {
        return _asn_ctx$LAYOUT;
    }

    private static final long _asn_ctx$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final long _asn_ctx$offset() {
        return _asn_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static MemorySegment _asn_ctx(MemorySegment struct) {
        return struct.asSlice(_asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static void _asn_ctx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
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

