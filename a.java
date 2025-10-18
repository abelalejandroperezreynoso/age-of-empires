import java.util.Enumeration;
import java.util.Vector;

public final class a {
   public static int a = 100;
   public static int b = 30;
   public static int c = 3;
   public static int d = 2000;
   public static byte[] a = new byte[]{3, 10, 14};
   public static int e = 2;
   public static int f = 0;
   public static int g = 1;
   public static int h = 25;
   public static int i = 7;
   public int j;
   public f a;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public byte[] b;
   public byte[][] a;
   public int r;
   public int s;
   public boolean a;
   public Vector a;
   public Vector b;
   public Vector c;
   public Vector d;
   public int t;
   public int u;
   public Vector e;
   public int v;
   public int w;
   public int x;
   public int y;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e;
   public int z;
   public int A;
   public int[] a;
   public int B;
   public int[] b;
   public int C;
   public int[] c;
   public short[] a;
   public byte[] c;
   private static final byte[][] c = new byte[][]{{0, 0, 1, 2, -1, 0, 0, 1, 2, -1}, {1, 1, 0, 2, -1, 1, 1, 0, 2, -1}, {2, 2, 2, 2, 2, 0, 0, -1, 1, 1}};
   public int[] d;
   public static final byte[][] b = new byte[][]{{0, 100, 0, 0, 0, 0, 0, 0}, {0, 20, 24, 23, 23, 0, 10, 0}, {0, 5, 15, 15, 24, 23, 8, 10}};

   public a(f var1, int var2) {
      this.n = d;
      this.a = new Vector();
      this.b = new Vector();
      this.c = new Vector();
      this.d = new Vector();
      this.t = -1;
      this.u = -1;
      this.e = new Vector();
      this.v = -1;
      this.w = -1;
      this.x = -1;
      this.y = -1;
      this.a = new int[0];
      this.b = new int[0];
      this.C = 0;
      this.c = new int[0];
      this.a = new short[3];
      this.c = new byte[3];
      this.d = new int[0];
      this.a = var1;
      this.k = var2;
      this.j = 0;
   }

   public final void a() {
      boolean var1 = this.v != -1;
      d[] var2 = this.a.a[this.k];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         d var4;
         if ((var4 = var2[var3]) != null) {
            if (var4.d == 2) {
               if (var4.a[12] == 0) {
                  if (!var1 && this.v == -1) {
                     this.v = var4.i;
                     this.w = var4.j;
                  }

                  this.b = true;
               }
            } else if (var4.d == 3 && var4.a[4] == 1) {
               if (!var1) {
                  this.v = var4.i;
                  this.w = var4.j;
               }

               this.b = true;
            }
         }
      }

      this.x = this.v / 10;
      this.y = this.w / 10;
      this.p = this.a.L / 10;
      if (this.a.L % 10 != 0) {
         ++this.p;
      }

      this.q = this.a.M / 10;
      if (this.a.M % 10 != 0) {
         ++this.q;
      }

      this.b = new byte[this.p * this.q];
      this.a = new byte[this.p * this.q][3];
      this.r = 0;
      this.s = 0;
      this.l = e.b(a);
      this.B = this.a.k[this.k];
      this.A = 10;
      this.j = 1;
   }

   public final void b() {
      int var1;
      for(var1 = 0; var1 < this.b.length; ++var1) {
         this.b[var1] = 0;
      }

      for(var1 = 0; var1 < e.m; ++var1) {
         if (var1 != this.k) {
            d[] var2 = this.a.a[var1];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               d var4;
               if ((var4 = var2[var3]) != null && var4.b() && !var4.c(this.k)) {
                  int var5 = var4.i / 10;
                  int var6 = var4.j / 10;
                  int var7 = var4.c() ? 2 : 1;
                  byte[] var10000 = this.b;
                  int var10001 = var5 * this.q + var6;
                  var10000[var10001] = (byte)(var10000[var10001] + var7);
               }
            }
         }
      }

   }

   public final void c() {
      if (this.r != -1) {
         int var1 = this.r * this.q + this.s;

         int var2;
         for(var2 = 0; var2 < 3; ++var2) {
            this.a[var1][var2] = 0;
         }

         var2 = this.r * 10;
         int var3 = this.s * 10;
         int var4 = Math.min(this.a.L - 1, var2 + 10);
         int var5 = Math.min(this.a.M - 1, var3 + 10);

         for(int var6 = var2; var6 <= var4; ++var6) {
            for(int var7 = var3; var7 <= var5; ++var7) {
               int var8 = this.a.a(var6, var7);
               if (this.a.b(var8)) {
                  ++this.a[var1][e.a(f.y, var8)];
               }
            }
         }

         if (++this.s >= this.q) {
            if (++this.r >= this.p) {
               this.r = -1;
               this.s = -1;
               this.a = true;
               return;
            }

            this.s = 0;
         }
      }

   }

   public final void d() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.c[var1] = 0;
      }

      Enumeration var4 = this.a.elements();

      while(var4.hasMoreElements()) {
         byte var3;
         if ((var3 = ((d)var4.nextElement()).a[19]) != -1) {
            ++this.c[var3];
         }
      }

   }

   public final byte[] a() {
      int var1 = -1;
      int var2 = Integer.MAX_VALUE;
      int var3 = -1;
      int var4 = -1;

      int var5;
      int var6;
      for(var5 = 0; var5 < this.p; ++var5) {
         for(var6 = 0; var6 < this.q; ++var6) {
            byte var7 = this.b[var5 * this.q + var6];
            int var8;
            if ((var8 = f.d(this.x, this.y, var5, var6)) < var2 && var7 > 0) {
               var2 = var8;
               var3 = var5;
               var4 = var6;
               var1 = var7;
            }
         }
      }

      if (var2 >= Integer.MAX_VALUE) {
         return null;
      } else {
         for(var5 = var3 - 1; var5 < var3 + 1; ++var5) {
            for(var6 = var4 - 1; var6 < var4 + 1; ++var6) {
               if (f.c(var5, var6, this.p, this.q)) {
                  var1 += this.b[var5 * this.q + var6] / 8;
               }
            }
         }

         return new byte[]{(byte)var3, (byte)var4, (byte)var1};
      }
   }

   public final byte[] a(int var1) {
      byte var2 = -1;
      int var3 = Integer.MAX_VALUE;
      int var4 = -1;
      int var5 = -1;
      int var6 = Integer.MAX_VALUE;

      for(int var7 = 0; var7 < this.p; ++var7) {
         for(int var8 = 0; var8 < this.q; ++var8) {
            byte var9;
            if ((var9 = this.a[var7 * this.q + var8][var1]) > 0) {
               byte var10 = this.b[var7 * this.q + var8];
               int var11 = f.d(this.x, this.y, var7, var8);
               byte var12;
               if (var10 >= var6 && (var10 != var6 || var11 >= var3)) {
                  var12 = 0;
               } else {
                  var6 = var10;
                  var12 = var9;
               }

               if (var12 > 0) {
                  var3 = var11;
                  var4 = var7;
                  var5 = var8;
                  var2 = var12;
               }
            }
         }
      }

      if (var3 < Integer.MAX_VALUE) {
         return new byte[]{(byte)var4, (byte)var5, (byte)var2};
      } else {
         return null;
      }
   }

   public final void e() {
      if (!this.c) {
         switch(this.j) {
         case 0:
            this.a();
            return;
         case 1:
            if (--this.l <= 0) {
               this.l = a;
               this.b();
               if (this.b) {
                  this.d();
                  this.i();
                  this.h();
                  this.g();
                  this.f();
                  this.j();
                  int var1 = this.a.a(3, 3, this.k);
                  int var2 = f + this.m * g;
                  if (var1 < var2) {
                     this.b(3, false);
                  }

                  if (this.d && this.a.a(3, 8, this.k) == null) {
                     this.b(8, false);
                  }

                  if (this.m >= 1 && this.a.a(3, 7, this.k) == null) {
                     this.b(7, false);
                  }
               }

               this.k();
               this.r = 0;
               this.s = 0;
               this.a = false;
            }

            if (this.b) {
               this.c();
               --this.A;
               if (this.A <= 0) {
                  this.z = (this.z + 1) % c[0].length;
                  this.A = 10;
               }
            }

            if (this.n > 0 && --this.n <= 0) {
               ++this.m;
               if (this.m == 2) {
                  this.d = true;
               }

               if (this.m < 2) {
                  this.n = (this.m + 1) * d;
               }
            }
         default:
         }
      }
   }

   public final void a(int var1, boolean var2) {
      if (this.b) {
         if (!a((int[])this.a, var1, 2)) {
            if (this.B < var1) {
               if (var1 - this.B > 1) {
                  this.a(var1 - 1, true);
               }

               this.a = e.a(this.a, new int[]{var1, 0}, var2);
            }
         }
      }
   }

   public final void f() {
      if (this.a.length != 0) {
         int var1 = this.a[0];
         int var2 = 16 + var1 - 1;
         boolean var3 = false;
         if (this.a[1] == 0) {
            this.a[1] = 1;
            this.a(f.b[var2]);
         }

         var3 = !this.a.a(this.k, f.b[var2]);
         d var4 = null;
         if (!var3) {
            int[] var5 = this.a(var2);
            var3 = (var4 = this.a(var5)) == null;
         }

         if (!var3 && var4.a(var2)) {
            this.B = var1;
            this.a = e.a(this.a, 2, true);
         }

      }
   }

   public final boolean a(int var1) {
      if (this.a.k[this.k] < var1) {
         this.a(var1, false);
         return true;
      } else {
         return false;
      }
   }

   public final void b(int var1, boolean var2) {
      if (this.b) {
         if (!a((int[])this.b, var1, 2)) {
            this.b = e.a(this.b, new int[]{var1, 0}, var2);
         }
      }
   }

   public final void g() {
      if (this.b.length != 0) {
         int var1 = this.b[0];
         int var2 = -1 + var1;
         boolean var3 = false;
         if (this.b[1] == 0) {
            this.b[1] = 1;
            this.a(f.b[var2]);
         }

         if (!(var3 = !this.a.a(this.k, f.b[var2]))) {
            var3 = var2 != 0 && this.a(new int[]{1}) == null;
         }

         if (!var3) {
            byte var4 = f.u[var2];
            var3 = this.a(var4);
         }

         int[] var8;
         if (!var3 && (var8 = this.a.a(this.v, this.w, 3, -1, 500, new int[]{this.k, var1})) != null) {
            int var5 = var8[0];
            int var6 = var8[1];
            this.a.b(this.k, f.b[var2]);
            d var7 = d.a(var1, this.k);
            this.a.a(var7, true);
            var7.a(var5, var6);
            this.c.addElement(var7);
            if (var1 == 2) {
               ++this.C;
            }

            this.b = e.a(this.b, 2, true);
         }
      }
   }

   public final void a(d var1) {
      if (var1.a[4] == 2) {
         this.C = Math.max(0, this.C - 1);
      }

      if (var1.a[4] == 8) {
         this.d = false;
      }

      if (var1.a[4] == 7) {
         this.e = true;
      }

   }

   public final void b(d var1) {
      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         d var3;
         if ((var3 = (d)this.e.elementAt(var2)).f()) {
            var3.a(var1.i, var1.j, var1);
         }
      }

   }

   public final void c(d var1) {
      this.c.removeElement(var1);
      if (var1.a[4] == 7) {
         this.e = false;
      }

   }

   public final d a(int[] var1) {
      d var2 = null;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         d var4;
         if ((var4 = this.a.a(3, var1[var3], this.k)) != null) {
            var2 = var4;
            if (var4.c != 0) {
               break;
            }
         }
      }

      if (var2 == null) {
         this.b(var1[0], var1[0] == 1);
      } else if (var2.c != 0) {
         return var2;
      }

      return null;
   }

   public final void c(int var1, boolean var2) {
      if (this.b) {
         this.c = e.a(this.c, new int[]{var1, 0}, var2);
      }
   }

   public final void h() {
      if (this.c.length != 0) {
         int var1 = this.c[0];
         int var2 = 8 + var1;
         boolean var3 = false;
         if (this.c[1] == 0) {
            this.c[1] = 1;
            this.a(f.b[var2]);
         }

         if (!(var3 = !this.a.a(this.k, f.b[var2]))) {
            byte var4 = f.u[var2];
            var3 = this.a(var4);
         }

         d var6 = null;
         if (!var3) {
            int[] var5 = this.a(var2);
            var3 = (var6 = this.a(var5)) == null;
         }

         if (!var3 && this.a.g[this.k] >= this.a.h[this.k] + this.C * 5) {
            this.b(2, true);
            var3 = true;
         }

         if (!var3 && var6.a(var2)) {
            this.c = e.a(this.c, 2, true);
         }

      }
   }

   public final int[] a(int var1) {
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < f.e.length; ++var3) {
         if (f.e[var3] != null) {
            for(int var4 = 0; var4 < f.e[var3].length; ++var4) {
               if (f.e[var3][var4] == var1) {
                  var2.addElement(new Integer(var3));
               }
            }
         }
      }

      return e.a(var2);
   }

   public final void d(d var1) {
      this.b.addElement(var1);
      if (var1.a[12] == 0) {
         this.a.addElement(var1);
      } else if (var1.a[20] != 2 && (!this.b || this.e.size() >= e + this.m)) {
         var1.a[20] = 1;
         this.d.addElement(var1);
      } else {
         var1.a[20] = 2;
         this.e.addElement(var1);
      }
   }

   public final void e(d var1) {
      this.b.removeElement(var1);
      if (var1.d(0)) {
         this.a.removeElement(var1);
      } else {
         this.e.removeElement(var1);
         this.d.removeElement(var1);
         if (this.d.size() == 0) {
            this.t = -1;
            this.u = -1;

            for(int var2 = 0; var2 < this.b.size(); ++var2) {
               d var3;
               if ((var3 = (d)this.b.elementAt(var2)).a[12] != 0 && !this.e.contains(var3)) {
                  this.d.addElement(var3);
               }
            }
         }

      }
   }

   public final void a(short[] var1) {
      if (this.b) {
         for(int var2 = 0; var2 < 3; ++var2) {
            short[] var10000 = this.a;
            var10000[var2] += var1[var2];
         }

      }
   }

   public final void i() {
      if (this.b) {
         int var1 = Integer.MAX_VALUE;
         int var2 = -1;

         int var4;
         int var6;
         for(int var3 = 0; var3 < 3; ++var3) {
            if (this.a[var3] != 0) {
               var4 = this.a[var3] / b;
               int var5 = c + this.m;
               var4 = Math.min(var4, var5);
               if ((var6 = this.c[var3] - var4) < var1) {
                  var1 = var6;
                  var2 = var3;
               }
            }
         }

         d var9 = null;
         Enumeration var10 = this.a.elements();

         while(var10.hasMoreElements()) {
            d var11;
            if ((var11 = (d)var10.nextElement()).a[19] == -1) {
               var9 = var11;
               break;
            }
         }

         var4 = -1;
         if (var9 != null) {
            if (var1 >= 0) {
               var4 = this.a.b(this.k);
            } else {
               var4 = var2;
            }
         } else if (var1 < 0) {
            if (var2 == 0 && this.a.d[this.k][0] < f.b[8][0]) {
               var4 = 0;
               Enumeration var12 = this.a.elements();

               while(var12.hasMoreElements()) {
                  d var14;
                  if ((var14 = (d)var12.nextElement()).a[19] != 0) {
                     var9 = var14;
                     break;
                  }
               }
            } else if (!a((int[])this.c, 0, 2)) {
               this.c(0, true);
            }
         }

         if (this.a && var9 != null && var4 != -1) {
            byte[] var13;
            if ((var13 = this.a(var4)) == null) {
               for(var6 = 0; var6 < 3 && (var6 == var4 || (var13 = this.a(var6)) == null); ++var6) {
               }
            }

            if (var13 != null) {
               var6 = var13[0] * 10 + 5;
               int var7 = var13[1] * 10 + 5;
               int[] var8;
               if ((var8 = this.a.a(var6, var7, 0, f.a(var6, var7, var9.i, var9.j), 48, (int[])null)) != null) {
                  var9.k();
                  var9.b(var8[0], var8[1], false);
                  var9.a[19] = (byte)var4;
               }
            }
         }

      }
   }

   public final void a(d var1, int var2, int var3) {
      if (this.e) {
         var2 = c[var2][this.z];
      }

      if (var2 != -1) {
         this.a.c(this.k, var2, var3);
         this.a[var2] = (short)Math.max(0, this.a[var2] - var3);
      }

   }

   public final void a(int var1, int var2) {
      if (this.b) {
         this.d = e.a(this.d, new int[]{var1, var2, 0}, false);
      }
   }

   public final void j() {
      if (this.d.length != 0) {
         int var1 = this.d[0];
         int var2 = this.d[1];
         boolean var3 = false;
         if (this.d[2] == 0) {
            this.d[2] = 1;
            this.a(f.b[var2]);
         }

         if (!(var3 = !this.a.a(this.k, f.b[var2]))) {
            byte var4 = f.u[var2];
            var3 = this.a(var4);
         }

         d var5 = null;
         if (!var3) {
            var3 = (var5 = this.a(new int[]{var1})) == null;
         }

         if (!var3 && var5.a(var2)) {
            this.d = e.a(this.d, 3, true);
         }

      }
   }

   public final void k() {
      if (this.t != -1) {
         if (this.b[this.t * this.q + this.u] == 0) {
            this.t = -1;
            this.u = -1;
         } else {
            int var1 = this.t * 10 + 5;
            int var2 = this.u * 10 + 5;

            for(int var3 = 0; var3 < this.d.size(); ++var3) {
               d var4;
               if ((var4 = (d)this.d.elementAt(var3)).c == 1 && var4.a[16] == -1) {
                  var4.b(var1, var2, false);
               }
            }
         }
      }

      if (this.t == -1) {
         byte[] var14;
         if ((var14 = this.a()) != null) {
            byte var15 = var14[0];
            byte var16 = var14[1];
            int var17 = Math.min(a[this.m], Math.max(1, var14[2] / 2)) + e + this.m;
            boolean var5 = e.b(101) <= h - this.m * i;
            boolean var6 = false;
            int var7 = this.d.size();
            int var8;
            int var9;
            if (this.b) {
               if (var5 && var7 > 0) {
                  var17 = var7;
               } else {
                  var8 = this.a(0);
                  if ((var9 = var17 - var7 - var8) > 0) {
                     for(int var10 = 0; var10 < var9; ++var10) {
                        int var11 = e.b(101);
                        int var12 = 0;

                        for(int var13 = 0; var13 < b[this.m].length; ++var13) {
                           var12 += b[this.m][var13];
                           if (var11 <= var12 && f.U[8 + var13] >= 0) {
                              this.c(var13, false);
                              break;
                           }
                        }
                     }
                  }
               }
            }

            if (this.b && var7 < var17) {
               var6 = true;
            }

            if (!this.b && var7 == 0) {
               var6 = true;
            }

            if (this.o == 0 && !var6) {
               this.a.a(this.d);
               var8 = var15 * 10 + 5;
               var9 = var16 * 10 + 5;
               int[] var18;
               if ((var18 = this.a.a(var8, var9, 0, -1, 99, (int[])null)) != null) {
                  this.a.a(this.a.a[this.k], var18[0], var18[1], false);
                  this.t = var15;
                  this.u = var16;
               }

               this.a.c(this.k);
            }

         }
      }
   }

   public final int a(int var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.c.length; ++var3) {
         if (var1 == 0 && this.c[var3] != 0 || var1 == 1 && this.c[var3] == 0) {
            ++var2;
         }
      }

      for(var3 = 0; var3 < this.c.size(); ++var3) {
         int[] var5;
         if ((var5 = ((d)this.c.elementAt(var3)).a[0]) != null) {
            for(int var6 = 0; var6 < var5.length; var6 += 2) {
               if (f.t[var5[var6]] == 0) {
                  int var8 = var5[var6] - 8;
                  if (var1 == 0 && var8 != 0 || var1 == 1 && var8 == 0) {
                     var2 += var5[var6 + 1];
                  }
               }
            }
         }
      }

      return var2;
   }

   public static final boolean a(int[] var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.length; var3 += var2) {
         if (var0[var3] == var1) {
            return true;
         }
      }

      return false;
   }
}
