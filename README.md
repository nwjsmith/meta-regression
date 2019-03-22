# Meta bug reproduction

As originally reported in https://groups.google.com/d/msg/clojure/pxLN9tYti4c/zbhLCOrTBgAJ

To run on Clojure 1.9

```
$ clj -A:1.9 repro.clj
```

To run on Clojure 1.10

```
$ clj -A:1.10 repro.clj
```

Which reports the following:

```
Exception in thread "main" Syntax error compiling at (/path/to/repro.clj:6:1).
        at clojure.lang.Compiler.load(Compiler.java:7647)
        at clojure.lang.Compiler.loadFile(Compiler.java:7573)
        at clojure.main$load_script.invokeStatic(main.clj:452)
        at clojure.main$script_opt.invokeStatic(main.clj:512)
        at clojure.main$script_opt.invoke(main.clj:507)
        at clojure.main$main.invokeStatic(main.clj:598)
        at clojure.main$main.doInvoke(main.clj:561)
        at clojure.lang.RestFn.applyTo(RestFn.java:137)
        at clojure.lang.Var.applyTo(Var.java:705)
        at clojure.main.main(main.java:37)
Caused by: java.lang.ExceptionInInitializerError
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
        at java.lang.Class.newInstance(Class.java:442)
        at clojure.lang.Compiler$ObjExpr.eval(Compiler.java:4996)
        at clojure.lang.Compiler.eval(Compiler.java:7175)
        at clojure.lang.Compiler.load(Compiler.java:7635)
        ... 9 more
Caused by: java.lang.IllegalArgumentException: No matching ctor found for class clojure.reflect$typesym$fn__11912
        at clojure.lang.Reflector.invokeConstructor(Reflector.java:288)
        at clojure.lang.LispReader$EvalReader.invoke(LispReader.java:1317)
        at clojure.lang.LispReader$DispatchReader.invoke(LispReader.java:853)
        at clojure.lang.LispReader.read(LispReader.java:285)
        at clojure.lang.LispReader.read(LispReader.java:216)
        at clojure.lang.LispReader.read(LispReader.java:205)
        at clojure.lang.RT.readString(RT.java:1874)
        at clojure.lang.RT.readString(RT.java:1869)
        at user$eval143.<clinit>(repro.clj:6)
        ... 17 more
```
