// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TrailerUnitDescJ2945Slash1B {
 *     VehicleWidth_t width;
 *     VehicleLength_t length;
 *     VehicleHeight_t *height;
 *     TrailerWeight_t *weight;
 *     PivotPointDescription_t frontPivot;
 *     struct PivotPointDescription *rearPivot;
 *     struct BumperHeights *bumpers;
 *     struct Axles *axles;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TrailerUnitDescJ2945Slash1B {

    TrailerUnitDescJ2945Slash1B() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("width"),
        MessageFrame_h.C_LONG.withName("length"),
        MessageFrame_h.C_POINTER.withName("height"),
        MessageFrame_h.C_POINTER.withName("weight"),
        PivotPointDescription.layout().withName("frontPivot"),
        MessageFrame_h.C_POINTER.withName("rearPivot"),
        MessageFrame_h.C_POINTER.withName("bumpers"),
        MessageFrame_h.C_POINTER.withName("axles"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TrailerUnitDescJ2945Slash1B");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong width$LAYOUT = (OfLong)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VehicleWidth_t width
     * }
     */
    public static final OfLong width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VehicleWidth_t width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VehicleWidth_t width
     * }
     */
    public static long width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VehicleWidth_t width
     * }
     */
    public static void width(MemorySegment struct, long fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfLong length$LAYOUT = (OfLong)$LAYOUT.select(groupElement("length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VehicleLength_t length
     * }
     */
    public static final OfLong length$layout() {
        return length$LAYOUT;
    }

    private static final long length$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VehicleLength_t length
     * }
     */
    public static final long length$offset() {
        return length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VehicleLength_t length
     * }
     */
    public static long length(MemorySegment struct) {
        return struct.get(length$LAYOUT, length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VehicleLength_t length
     * }
     */
    public static void length(MemorySegment struct, long fieldValue) {
        struct.set(length$LAYOUT, length$OFFSET, fieldValue);
    }

    private static final AddressLayout height$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VehicleHeight_t *height
     * }
     */
    public static final AddressLayout height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VehicleHeight_t *height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VehicleHeight_t *height
     * }
     */
    public static MemorySegment height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VehicleHeight_t *height
     * }
     */
    public static void height(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final AddressLayout weight$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("weight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TrailerWeight_t *weight
     * }
     */
    public static final AddressLayout weight$layout() {
        return weight$LAYOUT;
    }

    private static final long weight$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TrailerWeight_t *weight
     * }
     */
    public static final long weight$offset() {
        return weight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TrailerWeight_t *weight
     * }
     */
    public static MemorySegment weight(MemorySegment struct) {
        return struct.get(weight$LAYOUT, weight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TrailerWeight_t *weight
     * }
     */
    public static void weight(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(weight$LAYOUT, weight$OFFSET, fieldValue);
    }

    private static final GroupLayout frontPivot$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("frontPivot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PivotPointDescription_t frontPivot
     * }
     */
    public static final GroupLayout frontPivot$layout() {
        return frontPivot$LAYOUT;
    }

    private static final long frontPivot$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PivotPointDescription_t frontPivot
     * }
     */
    public static final long frontPivot$offset() {
        return frontPivot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PivotPointDescription_t frontPivot
     * }
     */
    public static MemorySegment frontPivot(MemorySegment struct) {
        return struct.asSlice(frontPivot$OFFSET, frontPivot$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PivotPointDescription_t frontPivot
     * }
     */
    public static void frontPivot(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, frontPivot$OFFSET, frontPivot$LAYOUT.byteSize());
    }

    private static final AddressLayout rearPivot$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rearPivot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PivotPointDescription *rearPivot
     * }
     */
    public static final AddressLayout rearPivot$layout() {
        return rearPivot$LAYOUT;
    }

    private static final long rearPivot$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PivotPointDescription *rearPivot
     * }
     */
    public static final long rearPivot$offset() {
        return rearPivot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PivotPointDescription *rearPivot
     * }
     */
    public static MemorySegment rearPivot(MemorySegment struct) {
        return struct.get(rearPivot$LAYOUT, rearPivot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PivotPointDescription *rearPivot
     * }
     */
    public static void rearPivot(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rearPivot$LAYOUT, rearPivot$OFFSET, fieldValue);
    }

    private static final AddressLayout bumpers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("bumpers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct BumperHeights *bumpers
     * }
     */
    public static final AddressLayout bumpers$layout() {
        return bumpers$LAYOUT;
    }

    private static final long bumpers$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct BumperHeights *bumpers
     * }
     */
    public static final long bumpers$offset() {
        return bumpers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct BumperHeights *bumpers
     * }
     */
    public static MemorySegment bumpers(MemorySegment struct) {
        return struct.get(bumpers$LAYOUT, bumpers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct BumperHeights *bumpers
     * }
     */
    public static void bumpers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(bumpers$LAYOUT, bumpers$OFFSET, fieldValue);
    }

    private static final AddressLayout axles$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("axles"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Axles *axles
     * }
     */
    public static final AddressLayout axles$layout() {
        return axles$LAYOUT;
    }

    private static final long axles$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Axles *axles
     * }
     */
    public static final long axles$offset() {
        return axles$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Axles *axles
     * }
     */
    public static MemorySegment axles(MemorySegment struct) {
        return struct.get(axles$LAYOUT, axles$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Axles *axles
     * }
     */
    public static void axles(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(axles$LAYOUT, axles$OFFSET, fieldValue);
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

