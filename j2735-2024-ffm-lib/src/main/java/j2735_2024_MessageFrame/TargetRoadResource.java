// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct TargetRoadResource {
 *     TRRType_t tRRType;
 *     TRRLocation_t tRRLocation;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class TargetRoadResource {

    TargetRoadResource() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_LONG.withName("tRRType"),
        TRRLocation.layout().withName("tRRLocation"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("TargetRoadResource");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong tRRType$LAYOUT = (OfLong)$LAYOUT.select(groupElement("tRRType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TRRType_t tRRType
     * }
     */
    public static final OfLong tRRType$layout() {
        return tRRType$LAYOUT;
    }

    private static final long tRRType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TRRType_t tRRType
     * }
     */
    public static final long tRRType$offset() {
        return tRRType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TRRType_t tRRType
     * }
     */
    public static long tRRType(MemorySegment struct) {
        return struct.get(tRRType$LAYOUT, tRRType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TRRType_t tRRType
     * }
     */
    public static void tRRType(MemorySegment struct, long fieldValue) {
        struct.set(tRRType$LAYOUT, tRRType$OFFSET, fieldValue);
    }

    private static final GroupLayout tRRLocation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("tRRLocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TRRLocation_t tRRLocation
     * }
     */
    public static final GroupLayout tRRLocation$layout() {
        return tRRLocation$LAYOUT;
    }

    private static final long tRRLocation$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TRRLocation_t tRRLocation
     * }
     */
    public static final long tRRLocation$offset() {
        return tRRLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TRRLocation_t tRRLocation
     * }
     */
    public static MemorySegment tRRLocation(MemorySegment struct) {
        return struct.asSlice(tRRLocation$OFFSET, tRRLocation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TRRLocation_t tRRLocation
     * }
     */
    public static void tRRLocation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, tRRLocation$OFFSET, tRRLocation$LAYOUT.byteSize());
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

    private static final long _asn_ctx$OFFSET = 136;

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
