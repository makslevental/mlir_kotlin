// Generated by jextract

package org.mlir;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface LLVMOrcGenericIRModuleOperationFunction {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress Ctx, java.lang.foreign.MemoryAddress M);
    static MemorySegment allocate(LLVMOrcGenericIRModuleOperationFunction fi, MemorySession session) {
        return RuntimeHelper.upcallStub(LLVMOrcGenericIRModuleOperationFunction.class, fi, constants$206.LLVMOrcGenericIRModuleOperationFunction$FUNC, session);
    }
    static LLVMOrcGenericIRModuleOperationFunction ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _Ctx, java.lang.foreign.MemoryAddress _M) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$206.LLVMOrcGenericIRModuleOperationFunction$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_Ctx, (java.lang.foreign.Addressable)_M);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


