import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;

public class i extends GameCanvas {
   public static boolean o;
   public static final Font[] a = new Font[]{Font.getFont(0, 0, 8), Font.getFont(0, 0, 0), Font.getFont(0, 0, 16)};
   public static final int[] i = new int[]{-1, 0, -1, -1, -1, -2};
   public static final int[] j = new int[]{65536, 65537};
   public static int[] k = new int[]{0, 1};
   public static final int[] l = new int[]{0, -1, 0, -2};
   public static int[] m;

   public i() {
      super(false);
      this.setFullScreenMode(true);
   }

   public static final int c(int var0) {
      return a(var0, new int[]{0});
   }

   public static final int a(int var0, int[] var1) {
      switch(var0) {
      case 0:
         e.r();
         break;
      case 1:
         e.c(true);
         break;
      case 2:
         if (e.c()) {
            return 1;
         }

         return 0;
      case 3:
         e.b(var1[0], var1.length == 1 ? 100 : var1[1]);
         break;
      case 4:
         e.s();
      }

      return 0;
   }

   public static final int b(int var0, String var1) throws Exception {
      switch(var0) {
      case 0:
         e.a.platformRequest(var1);
         break;
      case 1:
         o = var1.equals("1");
      }

      return 0;
   }

   public static final void m(int var0) {
      if (e.f) {
         Display.getDisplay(b.a).vibrate(var0);
      }

   }

   public final void hideNotify() {
      e.c = true;
      e.e = true;
   }

   public final void showNotify() {
      e.i();
      e.e = false;
   }

   public final int d(int var1) {
      if (var1 == 53) {
         return 16;
      } else if (var1 == -6) {
         return e.l ? 128 : 64;
      } else if (var1 == -7) {
         return e.l ? 64 : 128;
      } else if (var1 == 50) {
         return 1;
      } else if (var1 == 56) {
         return 2;
      } else if (var1 == 52) {
         return 4;
      } else if (var1 == 54) {
         return 8;
      } else if (var1 == 49) {
         return 256;
      } else if (var1 == 51) {
         return 512;
      } else if (var1 == 55) {
         return 1024;
      } else if (var1 == 57) {
         return 2048;
      } else if (var1 == 42) {
         return 4096;
      } else if (var1 == 35) {
         return 8192;
      } else if (var1 == 48) {
         return 16384;
      } else {
         switch(this.getGameAction(var1)) {
         case 1:
            return 1;
         case 2:
            return 4;
         case 3:
         case 4:
         case 7:
         default:
            return 0;
         case 5:
            return 8;
         case 6:
            return 2;
         case 8:
            return 16;
         }
      }
   }

   public void paint(Graphics var1) {
   }

   public static final void g(Graphics var0) {
      int var1 = e.T == 2 ? 0 : 255;
      int var2 = e.T == 2 ? 255 : 0;
      b(var0, e.a(var1, var2, e.U, 3) << 24, 0, 0, 176, 220);
   }

   public static final void b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < var4; ++var6) {
         m[var6] = var1;
      }

      var0.drawRGB(m, 0, 0, var2, var3, var4, var5, true);
   }

   static {
      String[] var10000 = new String[]{"2", "8", "4", "6", "1", "3", "7", "9"};
      m = new int[176];
   }
}
