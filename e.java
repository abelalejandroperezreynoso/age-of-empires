import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

public final class e extends i implements Runnable, CommandListener {
   public static final char[] a = new char[]{'C', 'd', '\u0096'};
   public static final int[] a = new int[]{4, 8, 4, 4, 8, 8, 4, 4, 4, 8, 8, 8, 16384};
   public static int a;
   public static int b;
   public static boolean a;
   public static boolean b;
   private boolean p;
   public static boolean c;
   public static boolean d;
   public static boolean e;
   public static int c = -1;
   public static boolean f = true;
   public static boolean g = true;
   public static boolean h = true;
   public static boolean i = true;
   public static boolean j = true;
   public f a;
   public static Display a;
   public static b a;
   public static e a;
   public static Random a = new Random();
   public static int d;
   private int W;
   public static g[] a;
   public static g[] b;
   public static g[] c;
   public static g[] d;
   public static g[] e;
   public static g a;
   public static g b;
   public static g c;
   public static g d;
   public static g[] f;
   public static g e;
   public static int e = 0;
   public static int f = -1;
   public static int g;
   public static h a;
   public static int h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   public static byte[] a;
   public static boolean[] a = new boolean[2];
   public static boolean k;
   public static g f;
   public static int p;
   public static int q;
   public int r;
   public int s;
   public int t;
   public int u;
   public int v;
   public int w;
   public int x;
   public int y;
   public int z;
   public int A;
   public int B;
   public static int C;
   public static int D;
   private static g g;
   private g h;
   private h v;
   private String[] c;
   public static boolean l;
   private static int X;
   public static h b;
   public static h c;
   public static h d;
   public static h e;
   public static h f;
   public static h g;
   public static h h;
   public static h i;
   public static h j;
   public static h k;
   public static h l;
   public static h m;
   public static h n;
   public static h o;
   public static h p;
   public static h q;
   public static h r;
   public static h s;
   public static h t;
   public static h u;
   public static int E;
   public static int F;
   public static int G;
   public static int H;
   public static int I = Math.max(1, a(1, (int)2));
   public static int J;
   public static int K;
   public static int L;
   public int M;
   public static int[][] a = new int[3][];
   public static boolean m;
   public static String[] a;
   public static int N;
   public static int O;
   public static boolean n;
   public static int P;
   public static int Q;
   public static int R;
   public static int S;
   public static String[] b;
   public static int T;
   public static int U;
   public static int V;
   public static int[] b;
   private static int Y;
   private static int Z;
   private static int aa;
   private static int ab;
   private static DataInputStream a;
   private static int[] n;
   private static byte[][] a;
   private static int ac = -1;
   private static g[][] a = new g[2][];
   private static char[][] a = new char[2][];
   private static int[] o = new int[2];
   public static int[] c = new int[2];
   public static int[] d = new int[2];
   public static int[] e = new int[2];
   public static Player[] a;
   public static int[] f;
   public static int[] g;
   public static int[] h;
   private static byte[][] b;
   public static Player a;
   public static Player b;
   private static int ad;
   private static String a;
   private static int ae;

   public e(b var1) {
      a = var1;
      a = this;
      a = Display.getDisplay(var1);
      a.setCurrent(this);
      (new Thread(this)).start();
   }

   public final void run() {
      d = true;
      f = 0;
      System.currentTimeMillis();

      while(d) {
         long var1 = System.currentTimeMillis();

         try {
            if (c) {
               this.M();
            }

            if (!e) {
               this.t();
               j();
            }

            long var3;
            if ((var3 = System.currentTimeMillis() - var1) < 45L) {
               Thread.sleep(50L - var3);
            } else {
               Thread.sleep(5L);
            }
         } catch (Exception var5) {
         }
      }

      i.c(1);
      a.destroyApp(true);
      a.notifyDestroyed();
   }

   private final void t() {
      try {
         if (this.p && Q == 0 && f != 4) {
            this.p = i.c(2) == 0;
         }

         if (P > 0) {
            P = Math.max(0, P - 50);
         }

         if (Q != 0) {
            if (Q == 2 && a()) {
               b = null;
               n();
               if (!k) {
                  this.a.r();
               }

               k = false;
            }
         } else {
            p();
            if (!d() && f == 10 && b.b != 2 && b != -1) {
               if (b == a[a]) {
                  ++a;
                  if (a >= a.length) {
                     a = 0;
                     i();
                     this.H();
                     a(u);
                  }
               } else {
                  a = 0;
               }

               b = -1;
            }

            switch(f) {
            case 0:
               this.u();
               break;
            case 2:
               if (!b()) {
                  this.C();
               }
               break;
            case 4:
               if (a()) {
                  f = g;
                  if (c != -1) {
                     i.a(3, new int[]{c});
                  }
               }
               break;
            case 5:
               if (!b()) {
                  this.y();
               }
               break;
            case 10:
               if (!b()) {
                  this.d();
               }
            case 30:
            default:
               break;
            case 40:
               d.a = null;
               this.a = null;
               int var1 = b.b == 2 ? 4 : -1;
               if (d() && var1 != -1) {
                  j(var1);
               } else {
                  a(a, a == c, false);
                  i.a(3, new int[]{0});
                  f = 10;
               }

               a = c;
               break;
            case 100:
               this.a.q();
            }
         }

         ++d;
      } catch (Exception var2) {
      }
   }

   public final void paint(Graphics var1) {
      try {
         if (Q != 0) {
            this.a(var1);
         } else {
            switch(f) {
            case 2:
               this.i(var1);
               break;
            case 4:
               a((Graphics)var1, 0);
               a(e, var1, a[113], 88, 220 - d[e] >> 1, 17);
               break;
            case 5:
               this.h(var1);
               break;
            case 10:
               this.b(var1);
            case 30:
            default:
               break;
            case 40:
               a((Graphics)var1, 0);
               a(e, var1, a == null ? "..." : a[110], 88, 220 - d[e] >> 1, 17);
               break;
            case 100:
               this.a.b(var1);
            }

            if (T != 0) {
               this.c(var1);
            }
         }

      } catch (Exception var3) {
      }
   }

   public final void a(Graphics var1) {
      if (b != null) {
         this.c(var1, 0);
      } else {
         a((Graphics)var1, 0);
      }

      String var2 = null;
      int var3 = 110;
      boolean var4 = a != null;
      int var5;
      if (a == null) {
         var2 = "...";
      } else if (Q != 1 && Q != 2) {
         if (Q == 3) {
            var2 = a(111);
            var4 = false;
         } else {
            var2 = a(112);
            var4 = false;
         }
      } else {
         if (Q == 2) {
            if ((d & 4) != 0) {
               var2 = a(113);
            }
         } else {
            var2 = a(110);
         }

         if (b != null) {
            var5 = q / 2;

            for(int var6 = 0; var6 < b.length; ++var6) {
               a(e, var1, b[var6], 88, var5, 17);
               var5 += d[e];
            }
         }

         var3 = this.t - 2;
      }

      if (var2 != null) {
         a(e(0) ? 0 : 1, var1, var2, 88, var3, var4 ? 65 : 3);
      }

      if (var4) {
         var5 = S * this.y / 100;
         a(var1, d, this.A, this.t, this.B);
         a(var1, c, this.u, this.v, this.u + var5);
         f[0].a(var1, this.r, this.t);
         f[1].a(var1, this.s, this.t, 24);
         if (S < 100) {
            e.a(var1, this.u + var5 - e.a / 5, this.v + this.z / 2, 3);
         }
      }

   }

   public static final void a(Graphics var0, g var1, int var2, int var3, int var4) {
      int var5;
      for(var5 = var2; var5 <= var4 - var1.a; var5 += var1.a) {
         var1.a(var0, var5, var3);
      }

      if (var5 < var4) {
         b(var0, var5, 0, var4 - var5, 220);
         var1.a(var0, var5, var3);
         e(var0);
      }

   }

   private final void u() {
      k();
      a = (new g(65618)).a(4);
      b = (new g(65596)).a(2);
      c = (new g(65597)).a(2);
      e = new g[8];
      g[] var1 = (new g(65607)).a(3);
      e[0] = var1[0];
      e[1] = new g(var1[0], 5);
      e[2] = new g(var1[0], 3);
      e[3] = new g(var1[0], 6);
      e[4] = var1[1];
      e[5] = new g(var1[1], 1);
      e[6] = var1[2];
      e[7] = new g(var1[2], 2);
      f = new g[2];
      g var3 = new g(65604);
      f[0] = var3;
      f[1] = new g(var3, 2);
      e = new g(65605);
      c = new g(65602);
      d = new g(65603);
      e(0);

      try {
         i.b(1, "1");
      } catch (Exception var2) {
      }

      g(e);
      this.a();
      String var4;
      if ((var4 = a("ms-skPos")) != null) {
         l = var4.equals("1");
      }

      this.b();
      n();
   }

   public static final g[] a(int var0, int var1) {
      g[] var2 = new g[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = new g(a(var0 + var3));
      }

      return var2;
   }

   public final void a() {
      p = e[0].a;
      q = e[0].b;
      this.w = 176 - p;
      this.x = f[0].b;
      this.r = (176 - this.w) / 2;
      this.s = 176 - this.r;
      this.t = 220 - q / 2 - this.x;
      this.z = c.b;
      this.u = this.r + f[0].a - a(1, (int)5);
      this.v = this.t + (this.x - this.z) / 2;
      this.y = 176 - 2 * this.u;
      this.A = this.u;
      this.B = 176 - this.A;
      F = 176 - p - 6;
   }

   public final void b() {
      this.E();
   }

   private final void v() {
      i.c(1);
      if (this.a != null) {
         this.a = null;
         d.a = null;
         System.gc();
      }

      f = 100;
      new f();
      n();
   }

   private final void w() {
      d(10);
      b = new g(65620);
      e(1);
      C = a.b;
      d(35);
      this.h = new g(a("splash.png"));
      d(60);
      i.c(0);
      d(70);
      this.g();
      this.b(0);
      this.b(1);
      d(80);
      f.a();
      d(95);
      this.J();
      a(100, true);
   }

   private final void x() {
      if (f != 5) {
         k();
      }

      boolean var1 = false;

      try {
         g = null;
         byte[] var2;
         if ((var2 = a("brand" + D + ".png")) != null) {
            g = new g(var2);
         }

         if (g == null) {
            var1 = true;
         }

         ++D;
      } catch (Exception var3) {
         var3.printStackTrace();
         var1 = true;
      }

      if (var1) {
         this.z();
         this.B();
      } else {
         if (f != 5) {
            f = 5;
            this.w();
            n();
         }

         if (g != null) {
            this.W = (int)System.currentTimeMillis();
         }

         i();
      }
   }

   private final void y() {
      if (!d(16) && !d(64)) {
         if (!b() && (int)System.currentTimeMillis() - this.W > 3000) {
            a(false, 3);
         }

      } else {
         a(false, 3);
      }
   }

   private final void z() {
      g = null;
   }

   private final void h(Graphics var1) {
      a((Graphics)var1, 0);
      if (g != null) {
         g.a(var1, 176 - g.a >> 1, 220 - g.b >> 1);
      }

      b((Graphics)var1, 8);
   }

   public static final void a(Graphics var0, int var1) {
      var0.setColor(var1);
      var0.fillRect(var0.getClipX(), var0.getClipY(), var0.getClipWidth(), var0.getClipHeight());
   }

   private final void A() {
      try {
         i.b(1, a[0]);
      } catch (Exception var2) {
      }

      if (!i.o) {
         h(e);
         e = 1;
      }

      this.G();
      a(f);
      b.a = 1;
   }

   private final void B() {
      i();
      f = 2;
      i.a(3, new int[]{0});
   }

   private final void C() {
      if (a()) {
         a(false, 4);
      }

   }

   private final void i(Graphics var1) {
      this.h.a(var1, 0, 0);
      if (d()) {
         a(var1, 0, 0, 176, d[e], -1728053248);
         a(e, var1, a(302), 88, 0, 17);
      }

      if (!b() && (d & 4) != 0) {
         a(e, var1, a(113), 88, 146, 3);
      }

   }

   private final void D() {
      this.h = null;
   }

   private final void E() {
      String var1;
      if ((var1 = a("ms-multiLang")) == null) {
         this.c("lang.dat");
         this.A();
      } else if (var1.equals("1")) {
         try {
            byte[] var2 = a("multi.dat");
            DataInputStream var3;
            int var4;
            String[] var5 = new String[var4 = (var3 = new DataInputStream(new ByteArrayInputStream(var2))).readInt()];
            this.c = new String[var4];

            int var6;
            for(var6 = 0; var6 < var4; ++var6) {
               var5[var6] = var3.readUTF();
            }

            for(var6 = 0; var6 < var4; ++var6) {
               this.c[var6] = var3.readUTF();
            }

            this.v = new h((String)null, var5, 0);
            a(this.v);
         } catch (Exception var7) {
         }
      } else {
         this.c(var1);
         this.A();
      }
   }

   private final void F() {
      this.c = null;
   }

   private final void c(String var1) {
      b("/" + var1);
      j(1);
   }

   public static final void b(Graphics var0, int var1) {
      boolean var2 = false;
      int var3 = 176 - a[0].a - 1;
      int var4 = 220 - a[0].b - 2;
      if ((var1 & 1) != 0) {
         a[1].a(var0, l ? 1 : var3, var4);
      } else if ((var1 & 4) != 0) {
         a[2].a(var0, l ? 1 : var3, var4);
      }

      if ((var1 & 2) != 0) {
         a[0].a(var0, l ? var3 : 1, var4);
      } else {
         if ((var1 & 16) != 0) {
            a[3].a(var0, l ? var3 : 1, var4);
         }

      }
   }

   private final void G() {
      String[] var1 = new String[]{a(26), a(27)};
      L = 0;
      String var2;
      if ((var2 = a("ms-upSell")) != null) {
         L = Integer.valueOf(var2);
      }

      String var3;
      String var4;
      if (L != 0) {
         var3 = a("ms-upSellUrl");
         var4 = a(306, (String[])(new String[]{var3}));
         if (L == 1) {
            h = a(a[305], var4, c, (h)null);
         }
      }

      Vector var6 = new Vector();
      if (d()) {
         var6.addElement(a(303));
         if ((var3 = (String)a(0)) != null) {
            var6.insertElementAt(var3, 0);
         }

         if (L != 0) {
            var6.addElement(a(305));
         }
      } else {
         var6.addElement(a(3));
         var6.addElement(a(4));
         if (L != 0) {
            var6.addElement(a(305));
         }

         var6.addElement(a(5));
      }

      var6.addElement(a(6));
      var6.addElement(a(7));
      var6.addElement(a(8));
      var6.addElement(a(9));
      c = new h(d() ? a(302) : null, a(var6), 0);
      a = c;
      var6.removeAllElements();
      var6.addElement(a(11));
      if (!d()) {
         var6.addElement(a(28));
      }

      var6.addElement(a(30));
      if (!d()) {
         var6.addElement(a(29));
      }

      var6.addElement(a(18));
      var6.addElement(a(6));
      var6.addElement(a(7));
      var6.addElement(a(2));
      g = new h(a[10], a(var6), 0);
      k = new h(a(17), var1, 1);
      m = new h(a(18), var1, 1);
      e = new h(a(9), var1, 1);
      l = new h(a(16), var1, 1);
      f = new h(a[25], var1, 0);
      n = new h(a(120), new String[]{a(18), a(2)}, 1);
      var6.removeAllElements();
      var6.addElement(a(41));
      var6.addElement(a(43));
      var6.addElement(a(45));
      var6.addElement(a(47));
      var6.addElement(a(49));
      i = new h(a(7), a(var6), 1);
      r = new h(a(97), new String[]{a(35), a(36)}, 0);
      s = new h(a(22), new String[]{a(23), a(24)}, 1);
      var3 = i.o ? "]" : "1P";
      var4 = i.o ? "$" : "CPU1";
      String var5 = i.o ? "_" : "CPU2";
      t = new h(a(21), new String[]{var3 + "  vs  " + var4, var3 + "  vs  " + var4 + " " + var5, var3 + " " + var5 + "  vs  " + var4, var3 + "  vs  " + var5 + "  vs  " + var4}, 1);
      this.H();
   }

   private final void H() {
      u = new h(a(297), this.a == null ? new String[]{a(298) + ": " + b} : new String[]{a(298) + ": " + b, a(299) + ": " + a, a(300), a(301)}, 1);
   }

   private final void I() {
      Vector var1;
      (var1 = new Vector()).addElement(a(12));
      if (b || o > 0) {
         var1.addElement(a(13));
      }

      p = new h(a(3), a(var1), 1);
   }

   public static final void c() {
      Vector var0 = new Vector();

      for(int var1 = 0; var1 <= (b ? f.a.length - 1 : o); ++var1) {
         var0.addElement(a(19, (String[])(new String[]{"" + (var1 + 1)})));
      }

      if (q == null) {
         q = new h(a(14), a(var0), 1);
      } else {
         q.a = a(var0);
      }
   }

   private final void J() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < f.F.length; var2 += 2) {
         byte var3 = f.F[var2];
         byte var4 = f.F[var2 + 1];
         var1.addElement(a(208 + var3 + 1) + " (" + var4 + ")");
      }

      o = new h(a(20), a(var1), 1);
   }

   private final void K() {
      String[] var1 = new String[3];

      for(int var2 = 0; var2 < 3; ++var2) {
         int[] var3;
         if ((var3 = a[var2]) == null) {
            var1[var2] = a(15);
         } else {
            var1[var2] = (var3[0] == 0 ? a(3) + " " + var3[1] : a(4)) + " " + a((String)("" + var3[2]), 2) + ":" + a((String)("" + var3[3]), 2) + ":" + a((String)("" + var3[4]), 2);
         }
      }

      if (j == null) {
         j = new h(a(m ? 29 : 5), var1, 1);
      } else {
         j.a = var1;
      }
   }

   private final void L() {
      Vector var1;
      (var1 = new Vector()).addElement(a(g ? 31 : 32));
      var1.addElement(a(f ? 33 : 34));
      var1.addElement(a(43) + ": " + a(i ? 35 : 36));
      var1.addElement(a(h ? 37 : 38));
      d = new h(a(6), a(var1), 1);
   }

   public static final void a(h var0) {
      a(var0, false, true);
   }

   public static final void a(h var0, boolean var1, boolean var2) {
      if (var0 != null) {
         i();
         if (var2 && var0.b != 0 && !var0.a) {
            var0.b = b;
         }

         b = var0;
         if (var0.b == 2) {
            X = d[e];
         } else {
            X = d[0].b;
         }

         if (var1) {
            b.a = 0;
            b.d = 0;
         }

         a(false);
         J = Math.min(b.a(), K);
         H = J * (X + I) - I;
         if (var0.b == 2) {
            E = F;
         } else {
            E = 2 * d[0].a;
         }

         f = 10;
      }
   }

   public static final void a(boolean var0) {
      if (a.a != null) {
         G = 220 - C;
      } else if (!var0 && a == null) {
         G = 220;
      } else {
         G = 220 - C;
      }

      H = G - q - 2 * c[0].b;
      K = (H + I) / (X + I);
   }

   public final void b(Graphics var1) {
      a(var1, 0, 0, 176, 220);
      if (d() && b.f != -1 && f != null) {
         a((Graphics)var1, 0);
         f.a(var1, 88, 0, 17);
      } else if (a.a == null) {
         if (a != null) {
            a((Graphics)var1, 0);
            a.a(var1, 88, 0, 17);
         }
      } else {
         a.a.b(var1);
      }

      if (b == null) {
         a((Graphics)var1, 0);
      } else {
         this.c(var1, 220 - G);
      }

      int var2;
      if (b.a != null) {
         var2 = b == f ? (220 - H) / 2 - 2 * d[e] : 220 - G + -2;
         a(e, var1, b.a, 88, var2, 17);
      }

      if ((b.c & 2) != 0) {
         var2 = 220 - G + (G - H) / 2;
      } else {
         var2 = 220 - G + q / 2;
      }

      int var3 = var2;
      int var4 = b.d;

      for(int var5 = 0; var4 < b.a() && var5 < J; ++var5) {
         if (b.b != 2) {
            if (d.length == 4) {
               byte var6;
               if (var4 == b.a) {
                  var6 = 2;
               } else {
                  var6 = 0;
               }

               d[var6].a(var1, 88, var3, 24);
               d[var6 + 1].a(var1, 88, var3, 20);
            } else {
               d[0].a(var1, 88, var3, 24);
               d[1].a(var1, 88, var3, 20);
               if (var4 == b.a) {
                  var1.setColor(16777215);
                  var1.drawRect(88 - d[0].a, var3, 2 * d[0].a - 1, d[0].b - 1);
               }
            }
         }

         int var7 = (b.c & 4) != 0 ? (176 - E) / 2 : 88;
         a(e, var1, b.a[var4], var7, var3 + X / 2, b.c);
         var3 += X + I;
         ++var4;
      }

      if (b.b == 2) {
         if (b.d > 0) {
            c[0].a(var1, 88, var2 - 2, 33);
         }

         if (b.d < b.a() - J) {
            c[1].a(var1, 88, var2 + H + 2, 17);
         }
      } else if (b.a() > 1) {
         c[0].a(var1, 88, var2 - 2, 33);
         c[1].a(var1, 88, var2 + H + 2, 17);
      }

      if (!b()) {
         if (d() && b.f != -1) {
            f(var1);
         } else {
            var4 = 0;
            if (b.b != null || b == g) {
               var4 = 1;
            }

            if ((b.a != null || b.e != -1 || b.b != 2) && (m || b != j || a[b.a] != null)) {
               var4 |= 2;
            }

            b(var1, var4);
         }
      }

      e(var1);
   }

   public final void c(Graphics var1, int var2) {
      int var3;
      if (b != null) {
         for(var3 = var2; var3 < 220; var3 += b.b) {
            a(var1, b, 0, var3, 176);
         }
      }

      if (e != null) {
         for(var3 = e[0].a; var3 < 176 - e[0].a; var3 += e[0].a) {
            e[4].a(var1, var3, var2);
            e[5].a(var1, var3, 220, 36);
         }

         for(var3 = var2 + e[0].b; var3 < 220 - e[0].b; var3 += e[0].b) {
            e[6].a(var1, 0, var3);
            e[7].a(var1, 176, var3, 24);
         }

         e[0].a(var1, 0, var2);
         e[1].a(var1, 176, var2, 2, 24);
         e[2].a(var1, 0, 220, 1, 36);
         e[3].a(var1, 176, 220, 3, 40);
      }

   }

   public final void d() {
      if (c(1)) {
         --b.a;
         if (b.a < 0) {
            if (b.b == 2) {
               b.a = 0;
            } else {
               b.a = b.a() - 1;
               b.d = b.a - J + 1;
            }
         } else if (b.a < b.d) {
            --b.d;
         } else if (b.b == 2) {
            --b.d;
         }
      } else if (c(2)) {
         int var1 = b.a();
         ++b.a;
         if (b.b == 2) {
            if (b.a > var1 - J) {
               b.a = var1 - J;
            } else {
               ++b.d;
            }
         } else if (b.a > var1 - 1) {
            b.a = 0;
            b.d = 0;
         } else if (b.a > b.d + J - 1) {
            ++b.d;
         }
      }

      if (!d(16) && !d(64)) {
         if (d(128)) {
            if (d() && b.f != -1) {
               l(b.f);
               return;
            }

            this.e();
         }
      } else {
         if (d() && b.f != -1) {
            k(b.f);
            return;
         }

         if (b.e != -1) {
            this.a(b.e);
            return;
         }

         if (b.a == null) {
            this.a(b, b.a);
            return;
         }

         a(b.a, b.a == c, true);
         if (b == q) {
            b.b = p;
         }

         if (b.a < b.d) {
            b.d = b.a;
            return;
         }

         if (b.a > b.d + J - 1) {
            b.d = b.a - J + 1;
            return;
         }
      }

   }

   public final void e() {
      if (b == d) {
         a(0);
      }

      if (b.b != null) {
         b.a = 0;
         a(b.b, false, false);
      } else {
         if (b == g) {
            f = 100;
            this.a.r();
         }

      }
   }

   public final void a(int var1) {
      switch(var1) {
      case 0:
         if (h == 1) {
            a(c, true, true);
            return;
         } else {
            ++j;
            if (d() && j >= 2) {
               f = 40;
               return;
            }

            a(false, 0);
            return;
         }
      case 1:
         if (this.a.n != null && this.a.n[0] == 0) {
            this.a.n = null;
         } else {
            a(g);
         }

         f = 100;
         return;
      case 2:
         a(n, true, true);
         return;
      case 3:
         a(false, 0);
         return;
      case 4:
         a(r);
         return;
      case 5:
         f = 40;
      default:
      }
   }

   private final void a(h var1, int var2) {
      if (var1 == this.v) {
         this.c(this.c[this.v.a]);
         this.F();
         a(false, 2);
      } else {
         String var3 = var1.a[var2];
         if (var1 == f) {
            if (var3 == a(26)) {
               g = true;
            } else if (var3 == a(27)) {
               g = false;
            }

            a(false, 3);
         }

         String var4;
         if (var1 == c) {
            if (var3 == a(3)) {
               h = 0;
               this.I();
               a(p, true, true);
            } else if (var3 == a(4)) {
               h = 1;
               a(o, true, true);
            } else if (var3 == a(5)) {
               m = false;
               this.K();
               a(j, true, true);
            } else if (var3 == a(8)) {
               if ((var4 = a("MIDlet-Version")) == null) {
                  var4 = "?";
               }

               a(a(a[8], a(39, (String[])(new String[]{a[1], var4})), var1, (h)null));
            } else if (var3 == a(9)) {
               a(e);
               b.a = 1;
            }
         }

         if (var1 == e) {
            if (var3 == a(26)) {
               o();
            } else if (var3 == a(27)) {
               this.e();
            }
         }

         if (var1 == p) {
            if (var3 == a(12)) {
               h = 0;
               i = 0;
               j = 0;
               m = 2;
               a(s);
               s.a = n;
            } else {
               i = 1;
               c();
               a(q, true, true);
            }
         }

         if (var1 == o) {
            k = f.F[2 * var2];
            l = f.F[2 * var2 + 1];
            if (l == 2) {
               a = new byte[]{0, 1};
               t.a = 0;
               m = a.length;
               a(s);
               s.a = n;
            } else {
               a(t, true, true);
            }
         } else if (var1 == t) {
            if (var2 == 0) {
               a = new byte[]{0, 1};
            } else if (var2 == 1) {
               a = new byte[]{0, 1, 1};
            } else if (var2 == 2) {
               a = new byte[]{0, 1, 0};
            } else {
               a = new byte[]{0, 1, 2};
            }

            m = a.length;
            a(s);
            s.a = n;
         }

         if (b == n) {
            if (var3 == a(18)) {
               f.o = true;
               a(false, 0);
            } else if (var3 == a(2)) {
               f = 40;
            }
         }

         if (b == r) {
            i = var2 == 0;
            a(0);
            this.a.n = null;
            h var8;
            (var8 = a(a(88), a(99), (h)null, (h)null)).e = 1;
            a(var8, true, false);
         }

         if (var3 == a(6)) {
            this.L();
            a(d);
         } else if (var3 == a(7)) {
            a(i, true, true);
         }

         if (var1 == g) {
            if (var3 == a[11]) {
               this.e();
            } else if (var3 == a(30)) {
               this.a.t();
            } else if (var3 == a(29)) {
               m = true;
               this.K();
               a(j, true, true);
            } else if (var3 == a(18)) {
               a(m);
               b.a = 1;
            } else if (var3 == a(2)) {
               a(l);
               b.a = 1;
            }
         }

         if (var1 == g && var3 == a(28)) {
            this.a.M();
         }

         if (var1 == l) {
            if (var3 == a(26)) {
               f = 40;
            } else {
               this.e();
            }
         }

         if (var1 == m) {
            if (var3 == a(26)) {
               f.o = true;
               a(false, 0);
            } else {
               this.e();
            }
         }

         if (var1 == s) {
            n = var2;
            if (h == 1 && !f.o) {
               var4 = a(122) + a(208 + k + 1) + "\n" + a(21) + ": " + t.a[t.a] + "\n" + a(22) + ": " + a(23 + n);
               h var5;
               (var5 = a(a(121), var4, (h)null, (h)null)).e = 3;
               a(var5);
            } else {
               a(false, 0);
            }
         }

         if (var1 == j) {
            if (m) {
               this.M = var2;
               if (a[this.M] != null) {
                  a(k);
                  b.a = 1;
               } else {
                  this.f();
               }
            } else if (a[var2] != null) {
               a(false, 1);
               b = new int[]{2 + var2};
            }
         }

         if (var1 == k) {
            if (var3 == a(26)) {
               this.f();
            }

            this.e();
         }

         if (var1 == q) {
            j = var2;
            m = var2 == 14 ? 3 : 2;
            a(s);
            s.a = n;
         }

         if (var1 == d) {
            if (var3 == a(31)) {
               g = false;
               var1.a(a(32));
               i.c(1);
            } else if (var3 == a(32)) {
               g = true;
               var1.a(a(31));
               if (this.a == null) {
                  i.c(2);
               } else {
                  i.a(3, new int[]{12});
               }
            } else if (var3 == a(33)) {
               f = false;
               var1.a(a(34));
            } else if (var3 == a(34)) {
               f = true;
               var1.a(a(33));
               i.m(50);
            } else if (var3.endsWith(a(35))) {
               i = false;
               var1.a(a(43) + ": " + a(36));
            } else if (var3.endsWith(a(36))) {
               i = true;
               var1.a(a(43) + ": " + a(35));
            } else if (var3 == a(37)) {
               h = false;
               var1.a(a(38));
            } else if (var3 == a(38)) {
               h = true;
               var1.a(a(37));
            }
         }

         if (var1 == i) {
            if (var3 != a(49)) {
               var4 = a(40 + 2 * var2 + 2);
            } else {
               StringBuffer var9 = new StringBuffer();

               for(int var6 = 50; var6 <= 55; ++var6) {
                  String var7;
                  if ((var7 = a(var6)).length() > 0) {
                     var9.append(var7);
                     if (var6 < 55) {
                        var9.append("\n\n");
                     }
                  }
               }

               var4 = var9.toString();
            }

            a(a(var3, var4, var1, (h)null));
         }

         if (var1 == u) {
            if (var3.startsWith(a(298))) {
               b = !b;
               var1.a(a(298) + ": " + b);
            } else if (var3.startsWith(a(299))) {
               a = !a;
               var1.a(a(299) + ": " + a);
               this.a.a(false);
            } else if (var3 == a(300)) {
               if (this.a != null) {
                  f var10000 = this.a;
                  this.a.getClass();
                  var10000.a(0, new short[]{500, 500, 500});
               }
            } else if (var3 == a(301) && this.a != null) {
               for(int var10 = 1; var10 < m; ++var10) {
                  this.a.a(var10, new short[]{500, 500, 500});
               }
            }
         }

         if (d()) {
            if (var3 == a(303)) {
               h = 0;
               i = 0;
               j = 0;
               m = 2;
               n = 0;
               j(3);
            } else if (var3 == (String)a(0)) {
               a(0, (String)null);
            }

            if (var1 == (h)a(1)) {
               a(1, (String)var3);
            }
         }

         if (var3 == a[305]) {
            if (L == 2) {
               a(a("ms-upSellUrl"));
               return;
            }

            a(h);
         }

      }
   }

   public static final void a(String var0) {
      if (var0 != null) {
         try {
            i.b(0, var0);
         } catch (Exception var2) {
         }

         o();
      }

   }

   public final void f() {
      c(3);
      int[] var1 = this.a.a();
      a[this.M] = new int[]{h, j + 1, var1[0], var1[1], var1[2]};
      a(1);
      this.a.i();
      a(2 + this.M);
      f.aa = null;
      this.K();
      c(4);

      try {
         Thread.sleep(1000L);
      } catch (Exception var3) {
      }

      n();
   }

   public static final h a(String var0, String var1, h var2, h var3) {
      h var4;
      (var4 = new h(var0, a(var1, F, e), 2)).b = var2;
      var4.a = var3;
      return var4;
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   public final void g() {
      try {
         RecordStore var1;
         if ((var1 = RecordStore.openRecordStore("aoe3", true)).getNumRecords() == 0) {
            for(int var2 = 0; var2 <= 4; ++var2) {
               a(var2);
            }
         }

         var1.closeRecordStore();
      } catch (Exception var3) {
      }
   }

   public static final boolean a(int var0) {
      String var1 = "aoe3";
      int var2 = var0;

      try {
         RecordStore var3 = RecordStore.openRecordStore(var1, true);
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         DataOutputStream var5 = new DataOutputStream(var4);
         if (var2 == 0) {
            var5.writeBoolean(j);
            var5.writeBoolean(f);
            var5.writeBoolean(i);
            var5.writeBoolean(h);
            var5.writeByte(n);
            a(a, var5);
            var5.writeByte(o);
         } else if (var2 == 1) {
            for(int var6 = 0; var6 < 3; ++var6) {
               boolean var7 = a[var6] != null;
               var5.writeBoolean(var7);
               if (var7) {
                  for(int var8 = 0; var8 < 5; ++var8) {
                     var5.writeInt(a[var6][var8]);
                  }
               }
            }
         } else if (var2 >= 2 && f.aa != null) {
            var5.writeShort(f.aa.length);
            var5.write(f.aa);
         }

         byte[] var10 = var4.toByteArray();
         var5.close();
         var4.close();
         if (var3.getNumRecords() <= var0) {
            var3.addRecord(var10, 0, var10.length);
         } else {
            var3.setRecord(var0 + 1, var10, 0, var10.length);
         }

         var3.closeRecordStore();
         return true;
      } catch (Exception var9) {
         return false;
      }
   }

   public final void b(int var1) {
      String var2 = "aoe3";
      int var3 = var1;

      try {
         RecordStore var4;
         if ((var4 = RecordStore.openRecordStore(var2, true)).getNumRecords() > var1) {
            byte[] var5 = var4.getRecord(var1 + 1);
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5);
            DataInputStream var7 = new DataInputStream(var6);
            if (var3 == 0) {
               j = var7.readBoolean();
               f = var7.readBoolean();
               i = var7.readBoolean();
               h = var7.readBoolean();
               n = var7.readByte();
               a = a(var7);
               o = var7.readByte();
            } else if (var3 != 1) {
               if (var3 >= 2) {
                  f.aa = new byte[var7.readShort()];
                  var7.readFully(f.aa);
               }
            } else {
               for(int var8 = 0; var8 < 3; ++var8) {
                  if (var7.readBoolean()) {
                     a[var8] = new int[5];

                     for(int var10 = 0; var10 < 5; ++var10) {
                        a[var8][var10] = var7.readInt();
                     }
                  }
               }
            }

            var7.close();
            var6.close();
         }

         var4.closeRecordStore();
      } catch (Exception var11) {
      }
   }

   public static final void b(String var0) {
      try {
         InputStream var1 = null;
         DataInputStream var2 = null;
         var1 = a.getClass().getResourceAsStream(var0);
         a = new String[(var2 = new DataInputStream(var1)).readInt()];

         for(int var3 = 0; var3 < a.length; ++var3) {
            a[var3] = var2.readUTF();
         }

      } catch (Exception var4) {
      }
   }

   public static final String a(int var0) {
      return var0 < a.length ? a[var0] : null;
   }

   public static final String a(int var0, String[] var1) {
      String var2 = new String(a(var0));
      if (var1.length == 1) {
         var2 = a(var2, "%U", var1[0]);
      } else {
         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2 = a(var2, "%U", var1[var3]);
         }
      }

      return var2;
   }

   public static final String a(String var0, String var1, String var2) {
      String var3 = null;
      boolean var4 = false;
      int var5;
      if ((var5 = var0.indexOf(var1)) != -1) {
         var3 = var0.substring(0, var5) + var2 + var0.substring(var5 + var1.length());
      } else {
         var3 = var0;
      }

      return var3;
   }

   public static final String[] a(String var0, int var1, int var2) {
      Vector var3 = new Vector();
      int var4 = 0;
      int var5 = var0.length();
      String var6 = null;

      int var8;
      do {
         var8 = var4;
         int var9 = var0.indexOf(10, var4);

         label43:
         do {
            int var10 = var8;
            String var7 = var6;
            var8 = a(var0, var8);
            if (var9 > -1 && var9 < var8) {
               var8 = var9;
            }

            var6 = var0.substring(var4, var8).trim();
            if (a(var2, var6) > var1) {
               if (var10 == var4) {
                  int var11 = var6.length() - 1;

                  while(true) {
                     if (var11 <= 0) {
                        break label43;
                     }

                     String var12 = var6.substring(0, var11);
                     if (a(var2, var12) <= var1) {
                        var8 = var10 + var11;
                        var6 = var12;
                        break label43;
                     }

                     --var11;
                  }
               }

               var8 = var10;
               var6 = var7;
               break;
            }

            if (var8 == var9) {
               ++var8;
               break;
            }
         } while(var8 < var5);

         var3.addElement(var6);
         var4 = var8;
      } while(var8 < var5);

      String[] var13 = new String[var3.size()];
      var3.copyInto(var13);
      return var13;
   }

   private static final int a(String var0, int var1) {
      if (f(var0.charAt(var1))) {
         return var1 + 1;
      } else {
         int var4;
         for(boolean var3 = false; (var4 = var0.indexOf(32, var1)) == 0; ++var1) {
         }

         int var5;
         if (var4 == -1) {
            var5 = var0.length();
         } else {
            var5 = var4 + 1;
         }

         for(var4 = var1 + 1; var4 < var5; ++var4) {
            if (f(var0.charAt(var4))) {
               return var4;
            }
         }

         return var5;
      }
   }

   private static final boolean f(int var0) {
      return var0 >= 11904 && var0 < 44032 || var0 >= 63744 && var0 < 64256 || var0 >= 65280 && var0 < 65504;
   }

   public static final String a(String var0) {
      String var1;
      return (var1 = a.getAppProperty(var0)) != null ? var1.trim() : null;
   }

   public static final int a(int var0) {
      return a.nextInt() % var0;
   }

   public static final int b(int var0) {
      return Math.abs(a.nextInt() % var0);
   }

   public static final boolean b(int var0) {
      return (N & var0) != 0;
   }

   public static final boolean c(int var0) {
      if (P == 0) {
         boolean var1;
         if (var1 = b(var0)) {
            if (n) {
               P = 400;
               n = false;
            } else {
               P = 80;
            }
         }

         return var1;
      } else {
         return false;
      }
   }

   public static final boolean d(int var0) {
      if ((O & var0) != 0) {
         O = 0;
         return true;
      } else {
         return false;
      }
   }

   public static final boolean a() {
      if (O != 0) {
         O = 0;
         return true;
      } else {
         return false;
      }
   }

   public static final void h() {
      O = 0;
   }

   public static final void i() {
      N = 0;
      O = 0;
      P = 0;
      n = false;
   }

   public final synchronized void keyPressed(int var1) {
      try {
         int var2 = this.d(var1);
         N |= var2;
         b = var2;
         O |= var2;
         n = true;
      } catch (Exception var3) {
      }
   }

   public final synchronized void keyReleased(int var1) {
      try {
         int var2 = this.d(var1);
         N &= ~var2;
         P = 0;
         n = false;
      } catch (Exception var3) {
      }
   }

   public static final void j() {
      a.repaint();
      a.serviceRepaints();
   }

   private final void M() {
      c = false;
      h();
      if (f != 4 && Q == 0) {
         i.c(1);
         if (a != null) {
            g = f;
            f = 4;
         }
      }

   }

   public static final byte[] a(byte[] var0, byte[] var1) {
      int var2 = 37;

      int var3;
      for(var3 = 0; var3 < var0.length - 4; ++var3) {
         if (var0[var3] == 80 && var0[var3 + 1] == 76 && var0[var3 + 2] == 84 && var0[var3 + 3] == 69) {
            var2 = var3;
            break;
         }
      }

      var3 = var2 - 4;
      int var4 = ((var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255) & -1;
      var4 += 12;
      byte[] var5 = new byte[var0.length - var4 + var1.length];
      System.arraycopy(var0, 0, var5, 0, var3);
      System.arraycopy(var1, 0, var5, var3, var1.length);
      System.arraycopy(var0, var3 + var4, var5, var3 + var1.length, var0.length - (var3 + var4));
      return var5;
   }

   public static final int a(int var0, int var1) {
      return a[var0] == 'd' ? var1 : a[var0] * var1 / 100;
   }

   public static final int[] a(int[] var0, int[] var1, boolean var2) {
      var2 = var2 && var0.length > 0;
      int[] var4 = new int[var0.length + var1.length];
      if (var2) {
         System.arraycopy(var0, 0, var4, var1.length, var0.length);
      } else {
         System.arraycopy(var0, 0, var4, 0, var0.length);
      }

      for(int var5 = 0; var5 < var1.length; ++var5) {
         if (var2) {
            var4[var5] = var1[var5];
         } else {
            var4[var0.length + var5] = var1[var5];
         }
      }

      return var4;
   }

   public static final int[] a(int[] var0, int var1, boolean var2) {
      int[] var3 = new int[var0.length - var1];
      System.arraycopy(var0, var2 ? var1 : 0, var3, 0, var3.length);
      return var3;
   }

   public static final int[] a(int[] var0, int var1, int var2) {
      int[] var3 = new int[var1];
      System.arraycopy(var0, 0, var3, 0, var3.length);
      int[] var4 = new int[Math.max(0, var0.length - var2 - 1)];
      System.arraycopy(var0, var2 + 1, var4, 0, var4.length);
      int[] var5 = new int[var0.length - (var2 - var1) - 1];
      System.arraycopy(var3, 0, var5, 0, var3.length);
      System.arraycopy(var4, 0, var5, var3.length, var4.length);
      return var5;
   }

   public static final int[] a(Vector var0) {
      int[] var1 = new int[var0.size()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (Integer)var0.elementAt(var2);
      }

      return var1;
   }

   public static final String[] a(Vector var0) {
      String[] var1 = new String[var0.size()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = (String)var0.elementAt(var2);
      }

      return var1;
   }

   public static final void k() {
      if (b != null) {
         b = null;
      }

      c(1);
   }

   public static final void l() {
      String var0;
      while((var0 = a(50 + b(6))).length() == 0) {
      }

      b = a(var0, 176 - p, e);
      c(1);
   }

   public static final void c(int var0) {
      i.a(1, (int[])null);
      Q = var0;
      R = 0;
      S = 0;
      j();
   }

   public static final void d(int var0) {
      a(var0, false);
   }

   public static final void a(int var0, boolean var1) {
      if (!var1) {
         S = R;
      }

      R = var0;
      if (var1) {
         S = R;
      }

      j();
   }

   public static final void m() {
      if (S < R) {
         ++S;
         j();
      }

   }

   public static final void n() {
      if (b != null) {
         Q = 2;
      } else {
         Q = 0;
      }

      i();
      q();
      System.currentTimeMillis();
   }

   public static final int b(int var0, int var1) {
      if (var0 < 0) {
         return Math.max(var0, -var1);
      } else {
         return var0 > 0 ? Math.min(var0, var1) : var0;
      }
   }

   public static final String a(String var0, int var1) {
      if (var0.length() < var1) {
         int var2 = var1 - var0.length();

         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = "0" + var0;
         }
      }

      return var0;
   }

   public static final byte[] a(DataInputStream var0) throws Exception {
      return a(var0, false);
   }

   public static final byte[] a(DataInputStream var0, boolean var1) throws Exception {
      short var10000 = var1 ? var0.readShort() : var0.readByte();
      short var2 = var10000;
      byte[] var3 = new byte[var10000];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var0.readByte();
      }

      return var3;
   }

   public static final byte[][] a(DataInputStream var0) throws Exception {
      byte var1;
      byte[][] var2 = new byte[var1 = var0.readByte()][];

      for(int var3 = 0; var3 < var1; ++var3) {
         byte var4;
         if ((var4 = var0.readByte()) > 0) {
            var2[var3] = new byte[var4];

            for(int var5 = 0; var5 < var4; ++var5) {
               var2[var3][var5] = var0.readByte();
            }
         }
      }

      return var2;
   }

   public static final int[] a(DataInputStream var0) throws Exception {
      int var1;
      int[] var2 = new int[var1 = var0.readInt()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0.readInt();
      }

      return var2;
   }

   public static final short[] a(DataInputStream var0) throws Exception {
      short var1;
      short[] var2 = new short[var1 = var0.readShort()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0.readShort();
      }

      return var2;
   }

   public static final short[][] a(DataInputStream var0) throws Exception {
      short var1;
      short[][] var2 = new short[var1 = var0.readShort()][];

      for(int var3 = 0; var3 < var1; ++var3) {
         short var4;
         if ((var4 = var0.readShort()) > 0) {
            var2[var3] = new short[var4];

            for(int var5 = 0; var5 < var4; ++var5) {
               var2[var3][var5] = var0.readShort();
            }
         }
      }

      return var2;
   }

   public static final int[][] a(DataInputStream var0) throws Exception {
      int var1;
      int[][] var2 = new int[var1 = var0.readInt()][];

      for(int var3 = 0; var3 < var1; ++var3) {
         int var4;
         if ((var4 = var0.readInt()) > 0) {
            var2[var3] = new int[var4];

            for(int var5 = 0; var5 < var4; ++var5) {
               var2[var3][var5] = var0.readInt();
            }
         }
      }

      return var2;
   }

   public static final int a(byte[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; var2 += 2) {
         if (var1 == var0[var2]) {
            return var0[var2 + 1];
         }
      }

      return -1;
   }

   public static final short a(short[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; var2 += 2) {
         if (var1 == var0[var2]) {
            return var0[var2 + 1];
         }
      }

      return -1;
   }

   public static final int b(byte[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var1 == var0[var2]) {
            return var2;
         }
      }

      return -1;
   }

   public static final int c(int var0, int var1) {
      return (var0 >> 4) * (var1 >> 4);
   }

   public static final int d(int var0, int var1) {
      int var2;
      if (var1 >> 8 == 0) {
         var2 = var0;
      } else {
         var2 = (var0 << 8) / var1;
      }

      return var2;
   }

   public static final void a(int[] var0, DataOutputStream var1) throws Exception {
      if (var0 == null) {
         var1.writeByte(-1);
      } else {
         var1.writeByte(var0.length);

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1.writeInt(var0[var2]);
         }

      }
   }

   public static final void a(short[] var0, DataOutputStream var1) throws Exception {
      if (var0 == null) {
         var1.writeByte(-1);
      } else {
         var1.writeByte(var0.length);

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1.writeShort(var0[var2]);
         }

      }
   }

   public static final void a(int[][] var0, DataOutputStream var1) throws Exception {
      if (var0 == null) {
         var1.writeByte(-1);
      } else {
         var1.writeByte(var0.length);

         for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] == null) {
               var1.writeByte(-1);
            } else {
               a(var0[var2], var1);
            }
         }

      }
   }

   public static final void a(boolean[] var0, DataOutputStream var1) throws Exception {
      if (var0 == null) {
         var1.writeShort(-1);
      } else {
         var1.writeShort(var0.length);

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1.writeBoolean(var0[var2]);
         }

      }
   }

   public static final void a(d[] var0, DataOutputStream var1) throws Exception {
      if (var0 == null) {
         var1.writeByte(-1);
      } else {
         var1.writeByte(var0.length);

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1.writeShort(var0[var2] == null ? -1 : var0[var2].b);
         }

      }
   }

   public static final int[] b(DataInputStream var0) throws Exception {
      byte var1;
      if ((var1 = var0.readByte()) == -1) {
         return null;
      } else {
         int[] var2 = new int[var1];

         for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = var0.readInt();
         }

         return var2;
      }
   }

   public static final short[] b(DataInputStream var0) throws Exception {
      byte var1;
      if ((var1 = var0.readByte()) == -1) {
         return null;
      } else {
         short[] var2 = new short[var1];

         for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = var0.readShort();
         }

         return var2;
      }
   }

   public static final int[][] b(DataInputStream var0) throws Exception {
      byte var1;
      if ((var1 = var0.readByte()) == -1) {
         return (int[][])null;
      } else {
         int[][] var2 = new int[var1][];

         for(int var3 = 0; var3 < var1; ++var3) {
            byte var4;
            if ((var4 = var0.readByte()) != -1) {
               var2[var3] = new int[var4];

               for(int var5 = 0; var5 < var4; ++var5) {
                  var2[var3][var5] = var0.readInt();
               }
            }
         }

         return var2;
      }
   }

   public static final boolean[] a(DataInputStream var0) throws Exception {
      short var1;
      if ((var1 = var0.readShort()) == -1) {
         return null;
      } else {
         boolean[] var2 = new boolean[var1];

         for(int var3 = 0; var3 < var1; ++var3) {
            var2[var3] = var0.readBoolean();
         }

         return var2;
      }
   }

   public static final d[] a(DataInputStream var0) throws Exception {
      byte var1;
      if ((var1 = var0.readByte()) == -1) {
         return null;
      } else {
         d[] var2 = new d[var1];

         for(int var3 = 0; var3 < var1; ++var3) {
            short var4;
            if ((var4 = var0.readShort()) != -1) {
               var2[var3] = new d(var4, 0);
            }
         }

         return var2;
      }
   }

   public static final void a(byte[] var0, DataOutputStream var1) throws Exception {
      if (var0 == null) {
         var1.writeShort(-1);
      } else {
         var1.writeShort(var0.length);
         var1.write(var0);
      }
   }

   public static final byte[] b(DataInputStream var0) throws Exception {
      short var1;
      if ((var1 = var0.readShort()) == -1) {
         return null;
      } else {
         byte[] var2 = new byte[var1];
         var0.readFully(var2);
         return var2;
      }
   }

   public static final void o() {
      d = false;
   }

   public static final void a(boolean var0, int var1) {
      if (var0) {
         T = 3;
         V = var1;
      } else {
         U = 0;
         T = 2;
         V = var1;
      }
   }

   public static final void b(boolean var0) {
      if (var0) {
         T = 0;
      } else {
         U = 0;
         T = 1;
      }

      V = -1;
   }

   public static final void p() {
      if (T == 1 || T == 2) {
         if (U > 2) {
            i();
            if (T == 1) {
               T = 0;
               return;
            }

            if (T == 2) {
               T = 3;
               a.a(3, (int)V);
               b(false);
            }

            return;
         }

         ++U;
      }

   }

   public static final boolean b() {
      return T != 0;
   }

   public final void a(int var1, int var2) {
      if (var2 >= 5) {
         this.a.f(var2);
      } else {
         switch(var2) {
         case 0:
            if (h == 0) {
               k = true;
            }

            l();
            this.v();
            return;
         case 1:
            l();
            (new StringBuffer()).append("Loading slot ").append(b[0]).toString();
            this.b(b[0]);
            this.v();
            f.aa = null;
            return;
         case 2:
            this.A();
            return;
         case 3:
            this.x();
            return;
         case 4:
            this.D();
            a(c);
         default:
         }
      }
   }

   public final void c(Graphics var1) {
      a(var1, 0, 0, 176, 220);
      if (T == 3) {
         a((Graphics)var1, 0);
      } else if (T == 1 || T == 2) {
         i.g(var1);
      }

      e(var1);
   }

   public static final int a(int var0, int var1, int var2, int var3) {
      if (var2 <= 0) {
         return var0;
      } else if (var2 >= var3) {
         return var1;
      } else {
         int var4 = var0 >> 16 & 255;
         int var5 = var0 >> 8 & 255;
         int var6 = var0 & 255;
         int var7 = var1 >> 16 & 255;
         int var8 = var1 >> 8 & 255;
         int var9 = var1 & 255;
         return (var7 - var4) * var2 / var3 + var4 << 16 | (var8 - var5) * var2 / var3 + var5 << 8 | (var9 - var6) * var2 / var3 + var6;
      }
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      i.b(var0, var5, var1, var2, var3, var4);
   }

   public static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      d(var0);
      var0.setClip(var1, var2, var3, var4);
   }

   public static final void b(Graphics var0, int var1, int var2, int var3, int var4) {
      d(var0);
      var0.clipRect(var1, var2, var3, var4);
   }

   public static final void d(Graphics var0) {
      Y = var0.getClipX();
      Z = var0.getClipY();
      aa = var0.getClipWidth();
      ab = var0.getClipHeight();
   }

   public static final void e(Graphics var0) {
      var0.setClip(Y, Z, aa, ab);
   }

   public static final void e(int var0) {
      if (var0 != 0) {
         if (var0 == 2) {
         }
      } else {
         d = new g[4];
         g[] var1 = (new g(65606)).a(2);
         d[0] = var1[0];
         d[1] = new g(var1[0], 2);
         d[2] = var1[1];
         d[3] = new g(var1[1], 2);
      }

      if (var0 == 2) {
         d(50);
      }

      if (var0 == 1 || var0 == 2) {
         a = new g(65608);
      }

      if (var0 == 2) {
         a(100, true);
      }

   }

   public static final byte[] a(int var0) {
      System.out.println();
      m();
      if (var0 == -1) {
         return null;
      } else {
         int var1 = var0 & '\uffff';
         int var2 = var0 >> 16 & '\uffff';
         byte[] var3 = null;

         try {
            if (var2 != 0) {
               if (ac != var2) {
                  f(var2);
               }

               return a[var1];
            }

            var3 = a(var1 + ".res", true);
         } catch (Exception var5) {
         }

         return var3;
      }
   }

   public static final byte[] a(String var0) {
      return a(var0, false);
   }

   public static final byte[] a(String var0, boolean var1) {
      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         InputStream var3 = a.getClass().getResourceAsStream("/" + var0);
         if (var1) {
            var3.skip(4L);
         }

         boolean var4 = false;

         int var6;
         while((var6 = var3.read()) != -1) {
            var2.write(var6);
         }

         var3.close();
         return var2.toByteArray();
      } catch (Exception var5) {
         return null;
      }
   }

   public static final void q() {
      ac = -1;
      n = null;
      a = (byte[][])null;

      try {
         if (a != null) {
            a.close();
            a = null;
         }

      } catch (Exception var1) {
      }
   }

   public static final void f(int var0) {
      if (ac != -1) {
         q();
      }

      ac = var0;
      a = new DataInputStream(a.getClass().getResourceAsStream("/" + var0 + ".pak"));

      try {
         short var1;
         int[] var2 = new int[var1 = a.readShort()];
         int[] var3 = new int[var1];
         n = new int[var1];

         int var4;
         for(var4 = 0; var4 < var1; ++var4) {
            n[var4] = a.readInt();
            var2[var4] = a.readInt();
            var3[var4] = a.readInt();
         }

         a = new byte[var1][];

         for(var4 = 0; var4 < var1; ++var4) {
            a[var4] = new byte[var3[var4]];
            a.read(a[var4]);
         }

         a.close();
      } catch (Exception var5) {
      }
   }

   public static final boolean e(int var0) {
      return a[var0] != null;
   }

   public static final void g(int var0) {
      if (i.k[var0] == 0) {
         if (a[var0] != null) {
            return;
         }

         try {
            int var1 = i.l[(var0 << 1) + 0];
            byte[] var3 = a(i.j[(var1 << 1) + 1]);
            DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var3));
            o[var0] = var4.readByte();
            c[var0] = var4.readByte();
            d[var0] = var4.readByte();
            byte var5 = var4.readByte();
            e[var0] = d[var0] - var5;
            int var6 = var4.read();
            String var7 = var4.readUTF();
            a[var0] = var7.toCharArray();
            byte[] var8 = new byte[var6];
            short[] var9 = new short[var6 * 2];

            int var10;
            for(var10 = 0; var10 < var6; ++var10) {
               var8[var10] = var4.readByte();
            }

            for(var10 = 0; var10 < var6 * 2; ++var10) {
               var9[var10] = var4.readShort();
            }

            byte[] var11 = a(i.j[var1 << 1]);
            g var12;
            int var13;
            if ((var13 = i.l[(var0 << 1) + 1]) == -1) {
               var12 = new g(var11);
            } else {
               byte[] var14 = a(var13);
               var12 = new g(a(var11, var14));
            }

            g[] var20 = new g[var6];

            for(int var15 = 0; var15 < var20.length; ++var15) {
               byte var16 = var8[var15];
               short var17 = var9[var15 << 1];
               short var18 = var9[(var15 << 1) + 1];
               var20[var15] = new g(var12, var17, var18, var16, d[var0]);
            }

            a[var0] = var20;
            var4.close();
            return;
         } catch (Exception var19) {
         }
      }

   }

   public static final void h(int var0) {
      a[var0] = null;
      a[var0] = null;
   }

   public static final int a(int var0, char var1) {
      int var2 = 0;
      int var3 = a[var0].length;

      int var4;
      while((var4 = (var3 - var2 >> 1) + var2) != var2) {
         char var5;
         if ((var5 = a[var0][var4]) == var1) {
            return var4;
         }

         if (var5 > var1) {
            var3 = var4;
         } else {
            var2 = var4;
         }
      }

      return -1;
   }

   public static final int b(int var0, char var1) {
      if (i.k[var0] == -1) {
         return Font.getDefaultFont().charWidth(var1);
      } else if (i.o && i.k[var0] == 0) {
         int var2;
         return (var2 = a(var0, var1)) != -1 ? a[var0][var2].a + o[var0] : c[var0] >> 1;
      } else {
         return i.a[i.l[(var0 << 1) + 0]].charWidth(var1);
      }
   }

   public static final int a(int var0, String var1) {
      if (i.k[var0] == -1) {
         return Font.getDefaultFont().stringWidth(var1);
      } else if (i.o && i.k[var0] == 0) {
         char[] var2 = var1.toCharArray();
         int var3 = 0;
         boolean var4 = false;

         for(int var5 = 0; var5 < var2.length; ++var5) {
            char var6;
            if ((var6 = var2[var5]) == ' ') {
               var3 += c[var0] >> 1;
            } else {
               int var7;
               if ((var7 = a(var0, var6)) != -1) {
                  var3 += a[var0][var7].a + o[var0];
               } else {
                  var3 += c[var0] >> 1;
               }
            }
         }

         return var3 - o[var0];
      } else {
         return i.a[i.l[(var0 << 1) + 0]].stringWidth(var1);
      }
   }

   public static final void a(int var0, Graphics var1, String var2, int var3, int var4, int var5) {
      if (i.k[var0] != -1) {
         int var6;
         int var8;
         if (i.o && i.k[var0] == 0) {
            if (a[var0] != null) {
               var6 = var2.length();
               char[] var16 = var2.toCharArray();
               boolean var17 = false;
               int var9;
               if ((var5 & 1) > 0) {
                  var9 = a(var0, var2);
                  var3 -= var9 >> 1;
               } else if ((var5 & 8) > 0) {
                  var9 = a(var0, var2);
                  var3 -= var9;
               }

               if ((var5 & 32) > 0) {
                  var4 -= d[var0];
               }

               if ((var5 & 64) > 0) {
                  var4 -= e[var0];
               } else if ((var5 & 2) > 0) {
                  var4 -= d[var0] >> 1;
               }

               boolean var10 = false;
               boolean var11 = false;
               boolean var12 = false;

               for(int var13 = 0; var13 < var6; ++var13) {
                  char var14;
                  if ((var14 = var16[var13]) == ' ') {
                     var3 += c[var0] >> 1;
                  } else if ((var8 = a(var0, var14)) == -1) {
                     var1.setColor(16777215);
                     var1.fillRect(var3 + 1, var4 + 1, (c[var0] >> 1) - 1, d[var0] - 1);
                     var1.setColor(0);
                     var1.drawString("" + var14, var3 + 1, var4 + 1, 20);
                     var3 += c[var0] >> 1;
                  } else {
                     g var15;
                     (var15 = a[var0][var8]).a(var1, var3, var4);
                     var3 += var15.a + o[var0];
                  }
               }

            }
         } else {
            var6 = i.l[(var0 << 1) + 0];
            Font var7 = i.a[var6];
            if ((var5 & 1) > 0) {
               var8 = var7.stringWidth(var2);
               var3 -= var8 >> 1;
            } else if ((var5 & 8) > 0) {
               var8 = var7.stringWidth(var2);
               var3 -= var8;
            }

            if ((var5 & 32) > 0) {
               var4 -= d[var0];
            }

            if ((var5 & 64) > 0) {
               var4 -= e[var0];
            } else if ((var5 & 2) > 0) {
               var4 -= d[var0] >> 1;
            }

            var1.setFont(var7);
            if ((var8 = i.l[(var0 << 1) + 1]) == -2) {
               var1.setColor(0);
               var1.drawString(var2, var3 + 1, var4 + i.i[(var6 << 1) + 1] + 1, 20);
               var1.setColor(16777215);
            } else if (var8 != -1) {
               var1.setColor(var8);
            }

            var1.drawString(var2, var3, var4 + i.i[(var6 << 1) + 1], 20);
         }
      }
   }

   public static final void r() {
      try {
         a = new Player[f.length];
         b = new byte[f.length][];

         for(int var0 = 0; var0 < a.length; ++var0) {
            if (f[var0] != -1) {
               b[var0] = a(f[var0]);
               if (g[var0] == 0) {
                  a[var0] = Manager.createPlayer(new ByteArrayInputStream(b[var0]), g[var0] == 0 ? "audio/midi" : "audio/x-wav");
                  a[var0].realize();
                  a[var0].prefetch();
               }
            }
         }

      } catch (Exception var1) {
      }
   }

   public static final void s() {
      for(int var0 = 0; var0 < a.length; ++var0) {
         if (a[var0] != null) {
            a[var0].close();
            a[var0] = null;
         }
      }

      r();
   }

   public static final void i(int var0) {
      b(var0, (int)100);
   }

   public static final void b(int var0, int var1) {
      var0 = h[var0];
      boolean var2;
      if (var2 = g[var0] == 0) {
         c = var0;
      }

      if (g && !e) {
         try {
            VolumeControl var3;
            if (var2) {
               c(true);
               a = a[var0];
               a.setLoopCount(f[var0] == 65542 ? 1 : -1);
               a.setMediaTime(0L);
               if ((var3 = (VolumeControl)a.getControl("VolumeControl")) != null) {
                  var3.setLevel(110);
               }

               a.start();
            } else if (!a(false) && var1 > 0 && f.ay == 0) {
               c(false);
               b = Manager.createPlayer(new ByteArrayInputStream(b[var0]), g[var0] == 0 ? "audio/midi" : "audio/x-wav");
               b.realize();
               b.prefetch();
               if ((var3 = (VolumeControl)b.getControl("VolumeControl")) != null) {
                  var3.setLevel(var1);
               }

               b.start();
               f.ay = 20;
               Thread.yield();
            }

         } catch (Exception var4) {
         }
      }
   }

   public static final void c(boolean var0) {
      try {
         if (var0 && a != null) {
            a.stop();
            a = null;
         } else if (!var0 && b != null) {
            b.stop();
            b.close();
            b = null;
         }

      } catch (Exception var2) {
      }
   }

   public static final boolean c() {
      int var0 = c;
      if (g && var0 != -1 && !a(true)) {
         i(var0);
         return a(true);
      } else {
         return true;
      }
   }

   public static final boolean a(boolean var0) {
      if (var0) {
         return a != null && a.getState() == 400;
      } else {
         return b != null && b.getState() == 400;
      }
   }

   public static final void j(int var0) {
      ad = var0;
      if (ad == 1) {
         String var3;
         if ((var3 = a("ms-demoMode")) != null) {
            ae = Integer.valueOf(var3);
         }

         a = a("ms-demoUrl");
         byte[] var2;
         f = (var2 = a("demo.png")) != null ? new g(var2) : null;
      } else {
         h var1;
         if (ad == 3) {
            (var1 = a((String)null, a(1) + "\n" + a(302) + "\n\n" + a(329), (h)null, (h)null)).f = 2;
            a(var1);
         } else {
            if (ad == 4 || ad == -1) {
               b = null;
               var1 = a(a(304), a(ae == 2 ? 327 : 328), c, (h)null);
               if (ae == 2) {
                  var1.f = 3;
               } else {
                  var1.f = 0;
               }

               a(var1);
            }

         }
      }
   }

   public static final void k(int var0) {
      if (var0 == 2) {
         a(false, 0);
      } else {
         if (var0 == 3) {
            a(a);
         }

      }
   }

   public static final void l(int var0) {
      if (var0 == 2) {
         o();
      } else {
         a(c, false, false);
         i.a(3, new int[]{0});
      }
   }

   public static final boolean d() {
      return ae != 0;
   }

   public static final Object a(int var0) {
      switch(var0) {
      case 0:
         return a(330);
      default:
         return null;
      }
   }

   public static final void a(int var0, String var1) {
      switch(var0) {
      case 0:
         if (ae == 1) {
            h var2;
            (var2 = a(a(330), a(327), (h)null, (h)null)).f = 1;
            a(var2);
            return;
         }

         if (ae == 2) {
            a(a);
            return;
         }
         break;
      case 1:
         if (var1 == a(26)) {
            a(a);
            return;
         }

         if (var1 == a(27)) {
            a(c);
         }
      }

   }

   public static final void f(Graphics var0) {
      String var1 = null;
      String var2 = null;
      if (b.f == 2) {
         var1 = a(332);
         var2 = a(333);
      } else if (b.f == 3) {
         var1 = a(334);
         var2 = a(331);
      } else {
         var2 = a(331);
      }

      if (var1 != null) {
         a(e, var0, var1, 2, 219, 36);
      }

      if (var2 != null) {
         a(e, var0, var2, 174, 219, 40);
      }

   }

   static {
      for(int var0 = 0; var0 < 2; ++var0) {
         if (i.k[var0] == 1) {
            int var1 = i.l[(var0 << 1) + 0];
            int var2 = i.i[(var1 << 1) + 0];
            int var3 = i.i[(var1 << 1) + 1];
            d[var0] = i.a[var1].getHeight() + var3 + var2;
            e[var0] = i.a[var1].getBaselinePosition() + var3;
            c[var0] = i.a[var1].charWidth('W');
         }
      }

      char[] var10000 = new char[]{'č', 'Č', 'ž', 'Ž', 'ů', 'Ů', 'ř', 'Ř', 'é', 'É', 'à', 'À', 'ó', 'Ó', 'ç', 'Ç', 'ã', 'Ã', 'á', 'Á', 'ú', 'Ú', 'í', 'Í', 'ñ', 'Ñ', 'â', 'Â', 'ê', 'Ê', 'î', 'Î', 'ô', 'Ô', 'û', 'Û', 'ö', 'Ö', 'è', 'È', 'ò', 'Ò', 'ü', 'Ü', 'ä', 'Ä', 'õ', 'Õ', 'ù', 'Ù', 'ì', 'Ì'};
      f = new int[]{65541, 65538, 65539, 65540, 65548, 65549, 65545, 65546, 65543, 65544, 65547, 65542};
      g = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0};
      h = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11};
   }
}
