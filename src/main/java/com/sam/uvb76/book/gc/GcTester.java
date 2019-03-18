package com.sam.uvb76.book.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;

/**
 * Created by LiYangpan on 2018/7/29  4:26 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class GcTester {

    static GcTester hook;

    String name;

    int age;

    String ooo;

    int temp;

    int tempclass;

    static {
        //System.out.println("what ? static!");
    }

    static class Game extends WeakReference<String>{
        byte[] value;

        Game(String a, byte[] b){
            super(a);
            this.value = b;
        }
    }


    /**
     * Called by the garbage collector on an object when garbage collection
     * determines that there are no more references to the object.
     * A subclass overrides the {@code finalize} method to dispose of
     * system resources or to perform other cleanup.
     * <p>
     * The general contract of {@code finalize} is that it is invoked
     * if and when the Java&trade; virtual
     * machine has determined that there is no longer any
     * means by which this object can be accessed by any thread that has
     * not yet died, except as a result of an action taken by the
     * finalization of some other object or class which is ready to be
     * finalized. The {@code finalize} method may take any action, including
     * making this object available again to other threads; the usual purpose
     * of {@code finalize}, however, is to perform cleanup actions before
     * the object is irrevocably discarded. For example, the finalize method
     * for an object that represents an input/output connection might perform
     * explicit I/O transactions to break the connection before the object is
     * permanently discarded.
     * <p>
     * The {@code finalize} method of class {@code Object} performs no
     * special action; it simply returns normally. Subclasses of
     * {@code Object} may override this definition.
     * <p>
     * The Java programming language does not guarantee which thread will
     * invoke the {@code finalize} method for any given object. It is
     * guaranteed, however, that the thread that invokes finalize will not
     * be holding any user-visible synchronization locks when finalize is
     * invoked. If an uncaught exception is thrown by the finalize method,
     * the exception is ignored and finalization of that object terminates.
     * <p>
     * After the {@code finalize} method has been invoked for an object, no
     * further action is taken until the Java virtual machine has again
     * determined that there is no longer any means by which this object can
     * be accessed by any thread that has not yet died, including possible
     * actions by other objects or classes which are ready to be finalized,
     * at which point the object may be discarded.
     * <p>
     * The {@code finalize} method is never invoked more than once by a Java
     * virtual machine for any given object.
     * <p>
     * Any exception thrown by the {@code finalize} method causes
     * the finalization of this object to be halted, but is otherwise
     * ignored.
     *
     * @throws Throwable the {@code Exception} raised by this method
     * @jls 12.6 Finalization of Class Instances
     * @see WeakReference
     * @see PhantomReference
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("我销毁了");
        hook = this;

    }

    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {


//        Game g1 = new Game("tom", new byte[1024 * 1024 * 2]);
//
//        //System.out.println(g1.get());
//
//        System.out.println(g1.value == null);
//
//        g1.clear();
//
//        g1.value = null;
//
//        g1.value = new byte[1024 * 1024 * 4];
//
//        g1.value = null;
//
//        System.gc();
//
//        System.out.println(g1.value == null);


        //0----------------------------------------------------------------------------------------


        // ClassLoader cl = ClassLoader.getSystemClassLoader();

        //cl.getParent().loadClass("com.sam.uvb76.book.Svt");
       // System.out.println(cl.getParent().getParent());
        //System.out.println(cl.getParent());

        //System.out.println(cl);

        //Class.forName("com.sam.uvb76.book.Svt");


        //Svt s1 = new Svt();


//        String aaa = "123";
//
//        int bbb = Integer.parseInt(aaa);
//
//        System.out.println(bbb);




//        SoftReference ccc = new SoftReference(new byte[1024 * 1024 * 6]);
//
//        System.out.println(ccc.get() == null);
//
//        byte[] bytes = new byte[1024 * 1024 * 5];
//
//        //System.gc();
//
//        System.out.println(ccc.get() == null);



        hook = new GcTester();

        WeakReference<GcTester> wf = new WeakReference<>(hook);

        System.out.println("引用" + (wf.get() == null));
        System.out.println("对象" + (hook == null));

        Thread.sleep(2000);

        hook = null;

        System.gc();

        Thread.sleep(2000);

        System.out.println("引用" + (wf.get() == null));
        System.out.println("对象" + (hook == null));


//
//
//
//        WeakReference<String> ref = new WeakReference<String>(new String("zbc"));
//
//        System.out.println(ref.get() == null);
//
//        System.gc();
//
//        System.out.println(ref.get() == null);


    }
}
