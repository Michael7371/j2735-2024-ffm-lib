// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TrailerData {
 *     SSPindex_t doNotUse;
 *     PivotPointDescription_t connection;
 *     TrailerUnitDescriptionList_t units;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TrailerData {

    TrailerData() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("doNotUse"),
        PivotPointDescription.layout().withName("connection"),
        TrailerUnitDescriptionList.layout().withName("units"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TrailerData");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong doNotUse$LAYOUT = (OfLong)$LAYOUT.select(groupElement("doNotUse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SSPindex_t doNotUse
     * }
     */
    public static final OfLong doNotUse$layout() {
        return doNotUse$LAYOUT;
    }

    private static final long doNotUse$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SSPindex_t doNotUse
     * }
     */
    public static final long doNotUse$offset() {
        return doNotUse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SSPindex_t doNotUse
     * }
     */
    public static long doNotUse(MemorySegment struct) {
        return struct.get(doNotUse$LAYOUT, doNotUse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SSPindex_t doNotUse
     * }
     */
    public static void doNotUse(MemorySegment struct, long fieldValue) {
        struct.set(doNotUse$LAYOUT, doNotUse$OFFSET, fieldValue);
    }

    private static final GroupLayout connection$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("connection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PivotPointDescription_t connection
     * }
     */
    public static final GroupLayout connection$layout() {
        return connection$LAYOUT;
    }

    private static final long connection$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PivotPointDescription_t connection
     * }
     */
    public static final long connection$offset() {
        return connection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PivotPointDescription_t connection
     * }
     */
    public static MemorySegment connection(MemorySegment struct) {
        return struct.asSlice(connection$OFFSET, connection$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PivotPointDescription_t connection
     * }
     */
    public static void connection(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, connection$OFFSET, connection$LAYOUT.byteSize());
    }

    private static final GroupLayout units$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("units"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TrailerUnitDescriptionList_t units
     * }
     */
    public static final GroupLayout units$layout() {
        return units$LAYOUT;
    }

    private static final long units$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TrailerUnitDescriptionList_t units
     * }
     */
    public static final long units$offset() {
        return units$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TrailerUnitDescriptionList_t units
     * }
     */
    public static MemorySegment units(MemorySegment struct) {
        return struct.asSlice(units$OFFSET, units$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TrailerUnitDescriptionList_t units
     * }
     */
    public static void units(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, units$OFFSET, units$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 104;

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

