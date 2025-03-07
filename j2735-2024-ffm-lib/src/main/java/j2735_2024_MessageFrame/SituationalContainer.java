// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct SituationalContainer {
 *     struct Obstructions *obstructions;
 *     NTCIPEssVisibility_t *visibility;
 *     Activity_t *peoplePresent;
 *     Activity_t *anomalousTraffic;
 *     RegionInfo_t applicableRegion;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class SituationalContainer {

    SituationalContainer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("obstructions"),
        MessageFrame_h.C_POINTER.withName("visibility"),
        MessageFrame_h.C_POINTER.withName("peoplePresent"),
        MessageFrame_h.C_POINTER.withName("anomalousTraffic"),
        RegionInfo.layout().withName("applicableRegion"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("SituationalContainer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout obstructions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("obstructions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct Obstructions *obstructions
     * }
     */
    public static final AddressLayout obstructions$layout() {
        return obstructions$LAYOUT;
    }

    private static final long obstructions$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct Obstructions *obstructions
     * }
     */
    public static final long obstructions$offset() {
        return obstructions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct Obstructions *obstructions
     * }
     */
    public static MemorySegment obstructions(MemorySegment struct) {
        return struct.get(obstructions$LAYOUT, obstructions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct Obstructions *obstructions
     * }
     */
    public static void obstructions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(obstructions$LAYOUT, obstructions$OFFSET, fieldValue);
    }

    private static final AddressLayout visibility$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("visibility"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPEssVisibility_t *visibility
     * }
     */
    public static final AddressLayout visibility$layout() {
        return visibility$LAYOUT;
    }

    private static final long visibility$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPEssVisibility_t *visibility
     * }
     */
    public static final long visibility$offset() {
        return visibility$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPEssVisibility_t *visibility
     * }
     */
    public static MemorySegment visibility(MemorySegment struct) {
        return struct.get(visibility$LAYOUT, visibility$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPEssVisibility_t *visibility
     * }
     */
    public static void visibility(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(visibility$LAYOUT, visibility$OFFSET, fieldValue);
    }

    private static final AddressLayout peoplePresent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("peoplePresent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Activity_t *peoplePresent
     * }
     */
    public static final AddressLayout peoplePresent$layout() {
        return peoplePresent$LAYOUT;
    }

    private static final long peoplePresent$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Activity_t *peoplePresent
     * }
     */
    public static final long peoplePresent$offset() {
        return peoplePresent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Activity_t *peoplePresent
     * }
     */
    public static MemorySegment peoplePresent(MemorySegment struct) {
        return struct.get(peoplePresent$LAYOUT, peoplePresent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Activity_t *peoplePresent
     * }
     */
    public static void peoplePresent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(peoplePresent$LAYOUT, peoplePresent$OFFSET, fieldValue);
    }

    private static final AddressLayout anomalousTraffic$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("anomalousTraffic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Activity_t *anomalousTraffic
     * }
     */
    public static final AddressLayout anomalousTraffic$layout() {
        return anomalousTraffic$LAYOUT;
    }

    private static final long anomalousTraffic$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Activity_t *anomalousTraffic
     * }
     */
    public static final long anomalousTraffic$offset() {
        return anomalousTraffic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Activity_t *anomalousTraffic
     * }
     */
    public static MemorySegment anomalousTraffic(MemorySegment struct) {
        return struct.get(anomalousTraffic$LAYOUT, anomalousTraffic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Activity_t *anomalousTraffic
     * }
     */
    public static void anomalousTraffic(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(anomalousTraffic$LAYOUT, anomalousTraffic$OFFSET, fieldValue);
    }

    private static final GroupLayout applicableRegion$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("applicableRegion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RegionInfo_t applicableRegion
     * }
     */
    public static final GroupLayout applicableRegion$layout() {
        return applicableRegion$LAYOUT;
    }

    private static final long applicableRegion$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RegionInfo_t applicableRegion
     * }
     */
    public static final long applicableRegion$offset() {
        return applicableRegion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RegionInfo_t applicableRegion
     * }
     */
    public static MemorySegment applicableRegion(MemorySegment struct) {
        return struct.asSlice(applicableRegion$OFFSET, applicableRegion$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RegionInfo_t applicableRegion
     * }
     */
    public static void applicableRegion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, applicableRegion$OFFSET, applicableRegion$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 152;

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

