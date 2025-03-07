// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct NodeAttributeSetXY {
 *     struct NodeAttributeXYList *localNode;
 *     struct SegmentAttributeXYList *disabled;
 *     struct SegmentAttributeXYList *enabled;
 *     struct LaneDataAttributeList *data;
 *     Offset_B10_t *dWidth;
 *     Offset_B10_t *dElevation;
 *     struct NodeAttributeSetXY__regional {
 *         struct {
 *             struct Reg_NodeAttributeSetXY **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_NodeAttributeSetXY *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class NodeAttributeSetXY {

    NodeAttributeSetXY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("localNode"),
        MessageFrame_h.C_POINTER.withName("disabled"),
        MessageFrame_h.C_POINTER.withName("enabled"),
        MessageFrame_h.C_POINTER.withName("data"),
        MessageFrame_h.C_POINTER.withName("dWidth"),
        MessageFrame_h.C_POINTER.withName("dElevation"),
        MessageFrame_h.C_POINTER.withName("regional"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("NodeAttributeSetXY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout localNode$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("localNode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct NodeAttributeXYList *localNode
     * }
     */
    public static final AddressLayout localNode$layout() {
        return localNode$LAYOUT;
    }

    private static final long localNode$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct NodeAttributeXYList *localNode
     * }
     */
    public static final long localNode$offset() {
        return localNode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct NodeAttributeXYList *localNode
     * }
     */
    public static MemorySegment localNode(MemorySegment struct) {
        return struct.get(localNode$LAYOUT, localNode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct NodeAttributeXYList *localNode
     * }
     */
    public static void localNode(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(localNode$LAYOUT, localNode$OFFSET, fieldValue);
    }

    private static final AddressLayout disabled$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("disabled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *disabled
     * }
     */
    public static final AddressLayout disabled$layout() {
        return disabled$LAYOUT;
    }

    private static final long disabled$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *disabled
     * }
     */
    public static final long disabled$offset() {
        return disabled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *disabled
     * }
     */
    public static MemorySegment disabled(MemorySegment struct) {
        return struct.get(disabled$LAYOUT, disabled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *disabled
     * }
     */
    public static void disabled(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(disabled$LAYOUT, disabled$OFFSET, fieldValue);
    }

    private static final AddressLayout enabled$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("enabled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *enabled
     * }
     */
    public static final AddressLayout enabled$layout() {
        return enabled$LAYOUT;
    }

    private static final long enabled$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *enabled
     * }
     */
    public static final long enabled$offset() {
        return enabled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *enabled
     * }
     */
    public static MemorySegment enabled(MemorySegment struct) {
        return struct.get(enabled$LAYOUT, enabled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct SegmentAttributeXYList *enabled
     * }
     */
    public static void enabled(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(enabled$LAYOUT, enabled$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct LaneDataAttributeList *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct LaneDataAttributeList *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct LaneDataAttributeList *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct LaneDataAttributeList *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final AddressLayout dWidth$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Offset_B10_t *dWidth
     * }
     */
    public static final AddressLayout dWidth$layout() {
        return dWidth$LAYOUT;
    }

    private static final long dWidth$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Offset_B10_t *dWidth
     * }
     */
    public static final long dWidth$offset() {
        return dWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Offset_B10_t *dWidth
     * }
     */
    public static MemorySegment dWidth(MemorySegment struct) {
        return struct.get(dWidth$LAYOUT, dWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Offset_B10_t *dWidth
     * }
     */
    public static void dWidth(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dWidth$LAYOUT, dWidth$OFFSET, fieldValue);
    }

    private static final AddressLayout dElevation$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dElevation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Offset_B10_t *dElevation
     * }
     */
    public static final AddressLayout dElevation$layout() {
        return dElevation$LAYOUT;
    }

    private static final long dElevation$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Offset_B10_t *dElevation
     * }
     */
    public static final long dElevation$offset() {
        return dElevation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Offset_B10_t *dElevation
     * }
     */
    public static MemorySegment dElevation(MemorySegment struct) {
        return struct.get(dElevation$LAYOUT, dElevation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Offset_B10_t *dElevation
     * }
     */
    public static void dElevation(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dElevation$LAYOUT, dElevation$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct NodeAttributeSetXY__regional {
     *     struct {
     *         struct Reg_NodeAttributeSetXY **array;
     *         int count;
     *         int size;
     *         void (*free)(struct Reg_NodeAttributeSetXY *);
     *     } list;
     *     asn_struct_ctx_t _asn_ctx;
     * }
     * }
     */
    public static class NodeAttributeSetXY__regional {

        NodeAttributeSetXY__regional() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            list.layout().withName("list"),
            asn_struct_ctx_s.layout().withName("_asn_ctx")
        ).withName("NodeAttributeSetXY__regional");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     struct Reg_NodeAttributeSetXY **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_NodeAttributeSetXY *);
         * }
         * }
         */
        public static class list {

            list() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                MessageFrame_h.C_POINTER.withName("array"),
                MessageFrame_h.C_INT.withName("count"),
                MessageFrame_h.C_INT.withName("size"),
                MessageFrame_h.C_POINTER.withName("free")
            ).withName("$anon$39:3");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final AddressLayout array$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("array"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * struct Reg_NodeAttributeSetXY **array
             * }
             */
            public static final AddressLayout array$layout() {
                return array$LAYOUT;
            }

            private static final long array$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * struct Reg_NodeAttributeSetXY **array
             * }
             */
            public static final long array$offset() {
                return array$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * struct Reg_NodeAttributeSetXY **array
             * }
             */
            public static MemorySegment array(MemorySegment struct) {
                return struct.get(array$LAYOUT, array$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * struct Reg_NodeAttributeSetXY **array
             * }
             */
            public static void array(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(array$LAYOUT, array$OFFSET, fieldValue);
            }

            private static final OfInt count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("count"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static final OfInt count$layout() {
                return count$LAYOUT;
            }

            private static final long count$OFFSET = 8;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static final long count$offset() {
                return count$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static int count(MemorySegment struct) {
                return struct.get(count$LAYOUT, count$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * int count
             * }
             */
            public static void count(MemorySegment struct, int fieldValue) {
                struct.set(count$LAYOUT, count$OFFSET, fieldValue);
            }

            private static final OfInt size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("size"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static final OfInt size$layout() {
                return size$LAYOUT;
            }

            private static final long size$OFFSET = 12;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static final long size$offset() {
                return size$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static int size(MemorySegment struct) {
                return struct.get(size$LAYOUT, size$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * int size
             * }
             */
            public static void size(MemorySegment struct, int fieldValue) {
                struct.set(size$LAYOUT, size$OFFSET, fieldValue);
            }

            /**
             * {@snippet lang=c :
             * void (*free)(struct Reg_NodeAttributeSetXY *)
             * }
             */
            public static class free {

                free() {
                    // Should not be called directly
                }

                /**
                 * The function pointer signature, expressed as a functional interface
                 */
                public interface Function {
                    void apply(MemorySegment _x0);
                }

                private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
                    MessageFrame_h.C_POINTER
                );

                /**
                 * The descriptor of this function pointer
                 */
                public static FunctionDescriptor descriptor() {
                    return $DESC;
                }

                private static final MethodHandle UP$MH = MessageFrame_h.upcallHandle(Function.class, "apply", $DESC);

                /**
                 * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
                 * The lifetime of the returned segment is managed by {@code arena}
                 */
                public static MemorySegment allocate(Function fi, Arena arena) {
                    return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
                }

                private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

                /**
                 * Invoke the upcall stub {@code funcPtr}, with given parameters
                 */
                public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
                    try {
                         DOWN$MH.invokeExact(funcPtr, _x0);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                }
            }

            private static final AddressLayout free$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("free"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_NodeAttributeSetXY *)
             * }
             */
            public static final AddressLayout free$layout() {
                return free$LAYOUT;
            }

            private static final long free$OFFSET = 16;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_NodeAttributeSetXY *)
             * }
             */
            public static final long free$offset() {
                return free$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_NodeAttributeSetXY *)
             * }
             */
            public static MemorySegment free(MemorySegment struct) {
                return struct.get(free$LAYOUT, free$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * void (*free)(struct Reg_NodeAttributeSetXY *)
             * }
             */
            public static void free(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(free$LAYOUT, free$OFFSET, fieldValue);
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

        private static final GroupLayout list$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("list"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_NodeAttributeSetXY **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_NodeAttributeSetXY *);
         * } list
         * }
         */
        public static final GroupLayout list$layout() {
            return list$LAYOUT;
        }

        private static final long list$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_NodeAttributeSetXY **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_NodeAttributeSetXY *);
         * } list
         * }
         */
        public static final long list$offset() {
            return list$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_NodeAttributeSetXY **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_NodeAttributeSetXY *);
         * } list
         * }
         */
        public static MemorySegment list(MemorySegment struct) {
            return struct.asSlice(list$OFFSET, list$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     struct Reg_NodeAttributeSetXY **array;
         *     int count;
         *     int size;
         *     void (*free)(struct Reg_NodeAttributeSetXY *);
         * } list
         * }
         */
        public static void list(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, list$OFFSET, list$LAYOUT.byteSize());
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

    private static final AddressLayout regional$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("regional"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct NodeAttributeSetXY__regional *regional
     * }
     */
    public static final AddressLayout regional$layout() {
        return regional$LAYOUT;
    }

    private static final long regional$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct NodeAttributeSetXY__regional *regional
     * }
     */
    public static final long regional$offset() {
        return regional$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct NodeAttributeSetXY__regional *regional
     * }
     */
    public static MemorySegment regional(MemorySegment struct) {
        return struct.get(regional$LAYOUT, regional$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct NodeAttributeSetXY__regional *regional
     * }
     */
    public static void regional(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(regional$LAYOUT, regional$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 56;

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

