// Generated by jextract

package org.unix;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor dladdr$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle dladdr$MH = RuntimeHelper.downcallHandle(
        "dladdr",
        constants$0.dladdr$FUNC, false
    );
    static final FunctionDescriptor dlclose$FUNC = FunctionDescriptor.of(JAVA_INT,
        ADDRESS
    );
    static final MethodHandle dlclose$MH = RuntimeHelper.downcallHandle(
        "dlclose",
        constants$0.dlclose$FUNC, false
    );
    static final FunctionDescriptor dlerror$FUNC = FunctionDescriptor.of(ADDRESS);
    static final MethodHandle dlerror$MH = RuntimeHelper.downcallHandle(
        "dlerror",
        constants$0.dlerror$FUNC, false
    );
    static final FunctionDescriptor dlopen$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS,
        JAVA_INT
    );
    static final MethodHandle dlopen$MH = RuntimeHelper.downcallHandle(
        "dlopen",
        constants$0.dlopen$FUNC, false
    );
    static final FunctionDescriptor dlsym$FUNC = FunctionDescriptor.of(ADDRESS,
        ADDRESS,
        ADDRESS
    );
    static final MethodHandle dlsym$MH = RuntimeHelper.downcallHandle(
        "dlsym",
        constants$0.dlsym$FUNC, false
    );
    static final FunctionDescriptor dlopen_preflight$FUNC = FunctionDescriptor.of(JAVA_BOOLEAN,
        ADDRESS
    );
    static final MethodHandle dlopen_preflight$MH = RuntimeHelper.downcallHandle(
        "dlopen_preflight",
        constants$0.dlopen_preflight$FUNC, false
    );
}

