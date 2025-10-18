import javax.microedition.midlet.MIDlet;

public class b extends MIDlet {
   public static b a;
   private e a;

   public b() {
      a = this;
      this.a = new e(this);
   }

   public final void startApp() {
   }

   public final void pauseApp() {
      if (this.a != null) {
         e.c = true;
      }

   }

   public final void destroyApp(boolean var1) {
      e.a(0);
      e.d = false;
   }
}
