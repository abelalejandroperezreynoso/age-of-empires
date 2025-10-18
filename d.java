import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class d {
   public static int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public boolean a;
   public static f a;
   public boolean b;
   public byte[] a;
   public int[] a;
   public int[][] a;
   public boolean[] a;
   public d[] a;
   public int k;
   public int l;
   public int m;
   public int n;
   public int o;
   public boolean c;

   public d(int var1, int var2) {
      this.i = -1;
      this.j = -1;
      this.k = -1;
      this.l = -1;
      this.m = -1;
      this.n = -1;
      this.b = var1;
      this.d = var2;
      this.b();
   }

   public d(int var1) {
      this.i = -1;
      this.j = -1;
      this.k = -1;
      this.l = -1;
      this.m = -1;
      this.n = -1;
      this.b = a++;
      this.d = var1;
      this.b();
   }

   public d(int var1, int var2, int var3) {
      this(var1);
      this.d(var2 << 8, var3 << 8);
   }

   public final byte[] a() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2;
         (var2 = new DataOutputStream(var1)).writeShort(this.b);
         var2.writeByte(this.d);
         var2.writeByte(this.c);
         var2.writeInt(this.e);
         var2.writeInt(this.f);
         var2.writeInt(this.g);
         var2.writeInt(this.h);
         var2.writeShort(this.i);
         var2.writeShort(this.j);
         var2.writeBoolean(this.b);
         var2.writeByte(this.k);
         var2.writeByte(this.l);
         var2.writeByte(this.o);
         var2.writeByte(this.m);
         var2.writeByte(this.n);
         var2.writeBoolean(this.c);
         e.a(this.a, var2);
         e.a(this.a, var2);
         e.a(this.a, var2);
         e.a(this.a, var2);
         e.a(this.a, var2);
         return var1.toByteArray();
      } catch (Exception var3) {
         return null;
      }
   }

   public static final d a(DataInputStream var0) {
      try {
         short var1 = var0.readShort();
         byte var2 = var0.readByte();
         d var3;
         (var3 = new d(var1, var2)).c = var0.readByte();
         var3.e = var0.readInt();
         var3.f = var0.readInt();
         var3.g = var0.readInt();
         var3.h = var0.readInt();
         var3.i = var0.readShort();
         var3.j = var0.readShort();
         var3.b = var0.readBoolean();
         var3.k = var0.readByte();
         var3.l = var0.readByte();
         var3.o = var0.readByte();
         var3.m = var0.readByte();
         var3.n = var0.readByte();
         var3.c = var0.readBoolean();
         var3.a = e.b(var0);
         var3.a = e.b(var0);
         var3.a = e.b(var0);
         var3.a = e.a(var0);
         var3.a = e.a(var0);
         return var3;
      } catch (Exception var4) {
         return null;
      }
   }

   public static final d a(int var0, int var1, int var2, int var3) {
      d var4;
      (var4 = new d(2, var3 * 48, var2 * 48)).a[12] = (byte)var0;
      var4.a[0] = (byte)var1;
      int var5 = var1;
      if (var0 == 7) {
         var5 = var1 + 3;
      }

      var4.i(f.o[var0], var5);
      var4.a[16] = -1;
      var4.a[17] = -1;
      var4.a[19] = -1;
      var4.a[14] = -1;
      var4.a[15] = -1;
      var4.a[4] = -1;
      var4.a[1] = -1;
      a.getClass();
      if (var1 != 0) {
         var4.a[1] = true;
      }

      var4.a[0] = var4.e();
      return var4;
   }

   public static final d a(int var0, int var1) {
      d var2;
      (var2 = new d(3)).a[4] = (byte)var0;
      var2.a[0] = (byte)var1;
      if (f.e[var0] != null) {
         var2.a[0] = new int[0];
      }

      var2.a[1] = -1;
      return var2;
   }

   public final void a(int var1, int var2) {
      int var3 = this.c();
      byte var4 = this.a[4];
      if (!f.m) {
         this.b(var2 * 48 << 8);
         this.c(var1 * 48 << 8);
      }

      int var5 = this.e();
      int var6 = var1;
      int var7 = var2;
      byte[] var8;
      int[] var9 = new int[(var8 = a.a(var3, var4)).length / 3];

      int var10;
      int var11;
      for(var10 = 0; var10 < var8.length; var10 += 3) {
         var11 = var1 + var8[var10];
         int var12 = var2 + var8[var10 + 1];
         a.getClass();
         if (this.c(0)) {
            a.a(2, 1, var11, var12, 1, false);
            a.b(508, 2, var11, var12, 1, false);
         }

         if (this.a[1] == null) {
            var9[var10 / 3] = (var5 / 3 + e.b(var5 / 3)) / 8;
         }

         if (this.a[1] != null && this.a[1][var10 / 3] <= 0) {
            a.b(var11, var12, e.b(2) == 1 ? 89 : 91);
         } else {
            a.b(var11, var12, e.b(2) == 1 ? 88 : 90);
         }

         a.a(1, 0, var11, var12, 1, false);
         a.a(512, 9, var11, var12, 1, false);
         var6 = Math.max(var6, var11);
         var7 = Math.max(var7, var12);
      }

      this.a[5] = (byte)var6;
      this.a[6] = (byte)var7;
      if (this.a[1] == null) {
         this.a[1] = var9;
      }

      if (!f.m) {
         var10 = var1 + f.q[2 * var4];
         var11 = var2 + f.q[2 * var4 + 1];
         this.a[7] = (byte)var10;
         this.a[8] = (byte)var11;
         this.c = 0;
      }

      a.n = true;
   }

   public final void a(boolean var1) {
      int var2 = this.c();
      boolean var3 = this.a();
      byte var4 = this.a[4];
      byte[] var5 = a.a(var2, var4);

      for(int var6 = 0; var6 < var5.length; var6 += 3) {
         int var7 = this.i + var5[var6];
         int var8 = this.j + var5[var6 + 1];
         byte var9 = var5[var6 + 2];
         if (var1) {
            a.getClass();
            if (this.c(0)) {
               a.a(508, 2, var7, var8, -1);
               a.a(var7, var8, f.r[var4], true);
            }
         }

         a.b(var7, var8, var9);
         if (var3) {
            a.b(var7, var8);
         }
      }

   }

   public final void b(boolean var1) {
      int var2 = this.c();
      this.a(true);
      if (!f.m) {
         if (f.s[this.a[4]] > 0) {
            this.a[3] = 60;
         }

         this.c = 1;
         if (var1) {
            a.getClass();
            if (var2 == 0) {
               a.a(e.a(144, (String[])(new String[]{a.b(var2, this.a[4])})), this.i, this.j);
               a.a(f.f[this.a[4]] / 4, this.i, this.j, this.a, this);
            }

            a.getClass();
            if (var2 == 0) {
               ++a.m[1];
            }
         } else if (!f.m) {
            this.a[0] = f.f[this.a[4]];
         }
      }

      if (this.a[4] == 1) {
         a.d(var2, 10);
         a.b[var2] = true;
         a.getClass();
         if (var2 == 0 && a.c && a.s == 0) {
            a.E();
         }
      } else if (this.a[4] == 2) {
         a.d(var2, 5);
      }

      a.getClass();
      if (var2 != 0) {
         a.a[var2].a(this);
      }

      ++a.Y[this.a[4]];
      this.a[9] = (byte)(25 + e.b(15));
   }

   public final boolean a() {
      int var1 = this.c();
      byte var2 = this.a[4];
      byte[] var3 = a.a(var1, var2);

      for(int var4 = 0; var4 < var3.length; var4 += 3) {
         int var5 = this.i + var3[var4];
         int var6 = this.j + var3[var4 + 1];
         if (a.a(508, 2, var5, var6, false)) {
            return true;
         }
      }

      return false;
   }

   public final boolean a(int var1) {
      short[] var2 = f.b[var1];
      byte var3;
      if ((var3 = f.t[var1]) != 2 && var3 != 4) {
         if (a.g[this.c()] >= a.h[this.c()]) {
            a.getClass();
            if (this.b(0)) {
               a.b(e.a(135));
            }

            return false;
         } else {
            a.b(this.c(), var2);
            a.c(this.c(), 1);
            boolean var4 = false;
            int var5 = 0;

            while(var5 < this.a[0].length) {
               label37: {
                  if (this.a[0][var5] == var1) {
                     if (var3 != 0) {
                        break label37;
                     }

                     int var6 = var1 - 8;
                     if (this.a[0][var5 + 1] != f.n[var6]) {
                        int var10002 = this.a[0][var5 + 1]++;
                        break label37;
                     }
                  }

                  var5 += 2;
                  continue;
               }

               var4 = true;
               break;
            }

            if (!var4) {
               this.a[0] = e.a(this.a[0], new int[]{var1, 1}, false);
            }

            return true;
         }
      } else {
         a.b(this.c(), var2);
         this.a[0] = e.a(this.a[0], new int[]{var1, 1}, false);
         return true;
      }
   }

   public final void b(int var1, int var2) {
      if (this.a[0][2 * var1 + 1] == var2) {
         this.a[0] = e.a(this.a[0], 2 * var1, 2 * var1 + 1);
         if (var1 == 0) {
            this.c = 1;
         }
      } else {
         int[] var10000 = this.a[0];
         var10000[2 * var1 + 1] -= var2;
      }

      if (a.c && a.d && this == a.a) {
         if (this.a[0].length == 0) {
            a.d = false;
            a.E();
            return;
         }

         a.c(false);
         a.H();
      }

   }

   public static final d a(int var0) {
      d var1;
      (var1 = new d(5, 0, 0)).i(var0);
      return var1;
   }

   public static final void a(int var0, int var1, boolean var2, boolean var3, int var4) {
      d var5;
      (var5 = new d(5, var0, var1)).i(14);
      var5.j(var4);
      var5.b = true;
      a(15, var0, var1, 12800, var2 ? 1 + e.b(2) : e.b(2));
      if (!var3 && !a.a(var5.i, var5.j, false)) {
         a(18, var0, var1, 0, var2 ? 3 + e.b(2) : 1 + e.b(2));
      } else {
         a(16, var0, var1, 0, var2 ? 1 + e.b(2) : e.b(2));
         a(17, var0, var1, 0, var2 ? 1 + e.b(2) : e.b(2));
      }

      a.a(var5);
      if (var5.b(true)) {
         i.m(50);
      }

   }

   public static final d b(int var0, int var1, int var2, int var3) {
      d var4;
      (var4 = new d(6, var0, var1)).a[3] = var3;
      var4.a[0] = var2;
      var4.a[4] = var2;
      var4.a[1] = 512;
      return var4;
   }

   public static final d a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      d var7;
      (var7 = new d(5, var1, var2)).i(var0);
      var7.m = e.b(f.a[var0][0].length);
      if (var0 == 15) {
         var7.a[0] = 4;
      }

      var7.g = var3;
      var7.h = var4;
      var7.a[1] = var5;
      var7.a[2] = var6;
      return var7;
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var0 == 18 ? e.a(256) : e.a(768);
         int var7 = var0 == 18 ? e.a(256) : e.a(768);
         int var8 = var0 == 18 ? 1536 + e.b(1024) : 1280 + e.b(2);
         d var9;
         (var9 = a(var0, var1 + e.a(12), var2 + e.a(12), var6, var7, var8, -128)).a[0] = var3;
         a.a(var9);
      }

   }

   public static final d a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      d var8;
      (var8 = new d(5, var0, var1)).i(20, var7);
      var8.j(var6);
      var8.g = var2;
      var8.h = var3;
      var8.a[1] = var4;
      var8.a[0] = var5;
      var8.b = true;
      return var8;
   }

   public final byte[] a(int var1) {
      int var2 = this.j();
      int var3 = var1 == 0 ? 0 : (var1 == 4 ? 1 : (var1 == 6 ? 2 : 3));
      byte[] var4;
      byte var5 = (var4 = var2 == 2 ? f.N : (var2 == 1 ? f.P : f.O))[3 * var3];
      byte var6 = var4[3 * var3 + 1];
      byte var7 = var4[3 * var3 + 2];
      return new byte[]{(byte)var5, (byte)var6, (byte)var7};
   }

   public final void c(boolean var1) {
      byte var2;
      int var3 = (var2 = this.a[18]) != 0 && var2 != 4 ? 1 : 0;
      byte[] var4 = this.a(var2);
      d var5;
      (var5 = new d(5, (this.e >> 8) + var4[0], (this.f >> 8) + var4[1])).i(var2 != 0 && var2 != 6 ? 23 : 22);
      var5.j(var3);
      if (var1) {
         var5.m = 1;
      }

      var5.b = true;
      var5.a[0] = var4[2] << 8;
      a.a(var5);
   }

   public final void a(int var1) {
      byte[] var2 = f.i[this.a[4]];

      for(int var3 = 0; var3 < Math.min(var2.length, 3 * var1); var3 += 3) {
         byte var4 = var2[var3];
         byte var5 = var2[var3 + 1];
         int var6 = var2[var3 + 2] << 8;
         d var7 = a(this.j * 48 - 24 + var4, this.i * 48 - 24 + var5, e.a(128), e.a(128), 384, var6, 1, 1);
         a.a(var7);
      }

   }

   public final void a() {
      byte[] var1 = this.a(this.a[18]);

      for(int var2 = 0; var2 < 3; ++var2) {
         byte var3 = var1[0];
         byte var4 = var1[1];
         int var5 = var1[2] + 6;
         if (this.c == 2) {
            var5 += 14;
         }

         d var6 = a((this.e >> 8) + var3, (this.f >> 8) + var4, e.a(64), e.a(64), 384, var5 << 8, 1, 1);
         a.a(var6);
      }

   }

   public static final d a() {
      d var0;
      (var0 = new d(5)).i(19);
      var0.b = true;
      return var0;
   }

   public final void b(int var1) {
      this.e = var1;
      this.j = this.b();
   }

   public final void c(int var1) {
      this.f = var1;
      this.i = this.a();
   }

   public final int a() {
      return this.a(0);
   }

   public final int b() {
      return this.b(0);
   }

   public final int a(int var1) {
      return ((this.f >> 8) + var1 + 24) / 48;
   }

   public final int b(int var1) {
      return ((this.e >> 8) + var1 + 24) / 48;
   }

   public final void d(int var1) {
      this.c(var1 * 48 << 8);
   }

   public final void e(int var1) {
      this.b(var1 * 48 << 8);
   }

   public final void c(int var1, int var2) {
      this.d(var1);
      this.e(var2);
   }

   public final boolean a(int var1, int var2) {
      return this.i == var1 && this.j == var2;
   }

   public final void d(int var1, int var2) {
      this.b(var1);
      this.c(var2);
   }

   public final void f(int var1) {
      this.b(this.e + var1);
   }

   public final void g(int var1) {
      this.c(this.f + var1);
   }

   public final void b() {
      if (f.a[this.d] > 0) {
         this.a = new byte[f.a[this.d]];
      }

      if (f.b[this.d] > 0) {
         this.a = new int[f.b[this.d]];
      }

      if (f.c[this.d] > 0) {
         this.a = new int[f.c[this.d]][];
      }

      if (f.d[this.d] > 0) {
         this.a = new boolean[f.d[this.d]];
      }

      if (f.e[this.d] > 0) {
         this.a = new d[f.e[this.d]];
      }

   }

   public final boolean b() {
      return this.d == 2 || this.d == 3;
   }

   public final boolean b(int var1) {
      return this.c() == var1;
   }

   public final int c() {
      return this.a[0];
   }

   public final boolean a(d var1) {
      return this.c(var1.c());
   }

   public final boolean c(int var1) {
      return e.a[this.c()] == e.a[var1];
   }

   public final int d() {
      return a(this.c(), this.a[12], this.d());
   }

   public static final int a(int var0, int var1, boolean var2) {
      byte var3 = f.m[var1];
      return a(var2 ? 3 : a.n[var0][var3], var1);
   }

   public static final int a(int var0, int var1) {
      byte var2;
      return (var2 = f.a[var1][var0]) == 0 ? 100 : 100 + var2 * 10;
   }

   public final int e() {
      return this.d() && this.a[4] == 229 ? 2000 : a(this.c(), this.d, this.d == 2 ? this.a[12] : this.a[4], this.d());
   }

   public static final int a(int var0, int var1, int var2, boolean var3) {
      if (var1 == 2) {
         short var5 = f.c[var2];
         return a(var0, var2, var3) * var5 / 100;
      } else {
         int var4 = f.f[var2];
         if (e.n == 0) {
            a.getClass();
            if (var0 != 0) {
               var4 = 75 * var4 / 100;
            }
         }

         return var4;
      }
   }

   public final int f() {
      return this.d() && this.a[4] == 229 ? 100 : b(this.c(), this.d, this.d == 2 ? this.a[12] : this.a[4], this.d());
   }

   public static final int b(int var0, int var1, int var2, boolean var3) {
      int var4;
      if (var1 == 2) {
         var4 = a(var0, var2, var3) * f.d[var2] / 100;
      } else {
         var4 = f.s[var2];
         if (var2 == 3 && a.k[var0] == 2) {
            var4 = 150 * var4 / 100;
         }
      }

      if (e.n == 0) {
         a.getClass();
         if (var0 != 0) {
            var4 = 75 * var4 / 100;
         }
      }

      return var4;
   }

   public final int g() {
      return this.d() * f.b[this.a[12]] / 100;
   }

   public final int h() {
      return this.d() * f.e[this.a[12]] / 100;
   }

   public final void c() {
      if (this.k >= 0 && this.c && (!a.j || this.k == 19)) {
         this.p();
         if (!this.c && this.b) {
            this.o();
         }
      }

      if (!a.j) {
         if (this.g != 0 || this.h != 0) {
            int var1 = this.i;
            int var2 = this.j;
            this.f(this.g);
            this.g(this.h);
            int var3 = this.i;
            int var4 = this.j;
            if (this.d != 2 && !a.d(var3, var4)) {
               this.o();
            } else if (var3 != var1 || var4 != var2) {
               if (this.d == 2) {
                  a.getClass();
                  if (this.c(0)) {
                     a.a(var1, var2, f.l[this.a[12]], false);
                     a.a(var3, var4, f.l[this.a[12]], true);
                  }

                  if (this.a[23] == var1 && this.a[24] == var2) {
                     a.a(7168, 10, var1, var2, -1);
                  }

                  a.a(7168, 10, var3, var4, 1);
                  this.a[23] = (byte)var3;
                  this.a[24] = (byte)var4;
               }

               if (var3 == a.e.i && var4 == a.e.j || var1 == a.e.i && var2 == a.e.j) {
                  a.n = true;
               }

               if (this.d == 2) {
                  this.d();
               }
            }
         }

         this.e();
      }
   }

   public final void d() {
      int var1;
      if (f.k[this.a[12]] == 1 && this.a[16] != -1 && this.a[0] != null && this.a[10] == this.a[0].length / 2 - 1) {
         var1 = f.a(this.a[4], this.a[5], this.a[16], this.a[17]);
         boolean var2 = false;
         this.a[21] = (byte)(12 * f.f[2 * var1 + 1]);
         this.a[22] = (byte)(12 * f.f[2 * var1]);
      } else {
         var1 = Math.max(0, (a.c(7168, 10, this.i, this.j) - 1) % (f.C.length / 2));
         this.a[21] = f.C[2 * var1];
         this.a[22] = f.C[2 * var1 + 1];
      }
   }

   public final void e() {
      int var1;
      int var2;
      int var4;
      int var5;
      int var10002;
      if (this.d == 2) {
         if (this.c != 2) {
            if (this.c == 3 && this.a[3] <= 0) {
               if (this.a[12] == 0) {
                  var1 = a.a(this.a[16], this.a[17]);
                  if ((var2 = e.a(f.y, var1)) != -1) {
                     boolean var3 = false;
                     a.getClass();
                     if (this.b(0)) {
                        if (var2 == 0) {
                           if (a.m[6] < 29999) {
                              ++a.m[6];
                           }
                        } else if (var2 == 1) {
                           if (a.m[7] < 29999) {
                              ++a.m[7];
                           }
                        } else if (a.m[8] < 29999) {
                           ++a.m[8];
                        }
                     } else {
                        a.a[this.c()].a((d)this, var2, 1);
                     }

                     a.getClass();
                     if (this.b(0)) {
                        a.c(this.c(), var2, 1);
                     }

                     var4 = a.b(this.a[16], this.a[17]);
                     a.a(536739840, 17, this.a[16], this.a[17], -1);
                     var5 = a.b(this.a[16], this.a[17]);
                     if (var4 != var5) {
                        a.b(this.a[16], this.a[17], var5);
                     }

                     if (a.e.i == this.a[16] && a.e.j == this.a[17] && a.a(508, 2, a.e.i, a.e.j, false)) {
                        a.b = "" + a.c(536739840, 17, a.e.i, a.e.j);
                     }

                     if (a.c(536739840, 17, this.a[16], this.a[17]) <= 0) {
                        byte var21 = this.a[16];
                        byte var6 = this.a[17];
                        a.b(var21, var6, e.a(f.z, var1));
                        a.a(536870912, 29, var21, var6, 1, false);
                        if (a.e.i == var21 && a.e.j == var6 && a.a(2, 1, var21, var6, false)) {
                           a.A();
                        }
                     }
                  } else {
                     this.k();
                     this.i();
                  }

                  if (this.c == 3) {
                     this.a[3] = this.h();
                  }
               } else if (this.g()) {
                  this.b(this.a[0], 0);
               }
            }
         } else {
            var1 = this.a[5] * 48 + this.a[21] << 8;
            var2 = this.a[4] * 48 + this.a[22] << 8;
            if ((this.g >= 0 || this.e > var1) && (this.g <= 0 || this.e < var1) && this.e != var1 || (this.h >= 0 || this.f > var2) && (this.h <= 0 || this.f < var2) && this.f != var2) {
               this.e(var1, var2);
            } else {
               this.l();
               if (this.a[0] != null) {
                  var1 = this.a[5] * 48 + this.a[21] << 8;
                  var2 = this.a[4] * 48 + this.a[22] << 8;
                  this.e(var1, var2);
               }
            }
         }

         if (this.c != 4) {
            if (this.a[3] > 0) {
               var10002 = this.a[3]--;
            }

            if (this.a[25] > 0) {
               --this.a[25];
               if (this.a[25] <= 0) {
                  this.b(this.a[0], 1);
               }
            }

            if (this.a[26] > 0) {
               --this.a[26];
               if (this.a && this.a[26] % 8 == 0) {
                  this.a();
               }
            }
         }
      } else {
         int[] var26;
         if (this.d == 3) {
            byte var13 = this.a[4];
            int var22;
            if (this.c == 0) {
               var2 = this.e();
               var26 = this.a;
               var26[2] += 8;
               var26 = this.a;
               var26[0] += 8;
               if (this.a[2] >= var2) {
                  this.a[0] = Math.min(this.a[0], var2);
                  this.b(true);
               } else {
                  byte[] var16 = a.a(this.c(), var13);

                  for(var4 = 0; var4 < var16.length; var4 += 3) {
                     if (this.a[1][var4 / 3] > 0) {
                        var10002 = this.a[1][var4 / 3]--;
                        if (this.a[1][var4 / 3] <= 0) {
                           var5 = this.i + var16[var4];
                           var22 = this.j + var16[var4 + 1];
                           a.b(var5, var22, a.a(var5, var22) == 88 ? 89 : 91);
                        }
                     }
                  }
               }
            } else if (this.c == 1) {
               if (f.e[var13] != null && this.a[0].length > 0) {
                  var2 = this.a[0][0];
                  byte var15 = f.t[var2];
                  this.a[3] = 0;
                  if (var15 == 0) {
                     var4 = var2 - 8;
                     this.a[4] = f.a[var4];
                  } else if (var15 == 2) {
                     this.a[4] = f.g[var2 - 16];
                  } else if (var15 == 4) {
                     this.a[4] = f.h[var2 - 24];
                  }

                  this.c = 2;
               }
            } else if (this.c == 2) {
               var10002 = this.a[3]++;
               if (this.a[3] >= this.a[4]) {
                  var2 = this.c();
                  int var14 = this.a[0][0];
                  byte var18 = f.t[var14];
                  var5 = this.a[0][1];
                  int var7;
                  if (var18 == 0) {
                     var22 = var14 - 8;
                     var7 = this.i + f.q[2 * var13];
                     int var8 = this.j + f.q[2 * var13 + 1];
                     Vector var9 = new Vector();

                     for(int var10 = 0; var10 < var5; ++var10) {
                        d var11 = a(var22, this.c(), var7, var8);
                        if (a.a(1, 0, var7, var8, false)) {
                           int[] var12;
                           if ((var12 = a.a(var11, this, true))[0] == -1) {
                              var12 = a.a(var7, var8, 1, -1, 99, (int[])null);
                           }

                           if (var12 != null) {
                              var11.c(var12[0], var12[1]);
                           } else {
                              var11.c(var7, var8);
                           }
                        }

                        a.a(var11, true);
                        a.getClass();
                        if (this.b(0)) {
                           ++a.m[0];
                        }

                        var9.addElement(var11);
                     }

                     if (var7 != this.a[7] || var8 != this.a[8]) {
                        Vector var23 = a.a[var2];
                        a.a[var2] = var9;
                        a.a(var9, this.a[7], this.a[8], false);
                        a.a[var2] = var23;
                     }

                     a.getClass();
                     if (this.b(0)) {
                        d var24 = (d)var9.elementAt(var9.size() - 1);
                        a.a(e.a(143, (String[])(new String[]{a.a(var24.c(), var24.a[12])})), var24);
                        i.a(3, new int[]{10});
                     }
                  } else if (var18 == 2) {
                     a.d(this.c());
                  } else if (var18 == 4) {
                     var22 = e.a((byte[])f.v, var13);
                     var7 = e.a(f.w, var14);
                     a.a(this, var22, var7, var14);
                  }

                  this.b(0, var5);
                  a.getClass();
                  if (this.b(0)) {
                     if (var18 == 2) {
                        var22 = this.a[4];
                     } else {
                        var22 = var5 * this.a[4] / 4;
                     }

                     a.a(var22, this.i, this.j, this.a, this);
                  }

                  this.c = 1;
               }
            }

            if (this.a) {
               byte[] var17;
               if ((var17 = a.k[this.c()] == 0 ? f.L : f.M)[3 * var13] != -1 && this.c != 0) {
                  --this.a[9];
                  if (this.a[9] <= 0) {
                     d var19 = a((this.e >> 8) + var17[3 * var13], (this.f >> 8) + var17[3 * var13 + 1], 0, 0, 384, 2 * var17[3 * var13 + 2] << 8, 1, 0);
                     a.a(var19);
                     this.a[9] = (byte)(25 + e.b(15));
                  }
               }

               if (this.c != 0) {
                  var2 = this.a[0];
                  short var20 = f.f[this.a[4]];
                  if (this.a[10] > 0) {
                     --this.a[10];
                     if (this.a[10] <= 0) {
                        this.a(var2 < var20 / 3 ? 3 : 1);
                     }
                  } else if (var2 < var20 / 2 && this.a[10] == 0) {
                     this.a[10] = 4;
                  }
               }
            }
         } else if (this.d == 5 || this.d == 6) {
            if (this.d == 6 && this.a[0] - this.a[4] >= 12288) {
               this.o();
            } else {
               var26 = this.a;
               var26[0] += this.a[1];
               if (this.d == 5 && this.a[2] != 0) {
                  var26 = this.a;
                  var26[1] += this.a[2];
                  if (this.a[0] < 0) {
                     this.a[0] = 0;
                     this.a[1] = -(this.a[1] / 3);
                     if (Math.abs(this.a[1]) < 512) {
                        this.o();
                     } else {
                        this.g /= 2;
                        this.h /= 2;
                     }
                  }
               }
            }

            if (this.k == 15) {
               --this.a[0];
               if (this.a[0] <= 0) {
                  a.a(a(this.e >> 8, this.f >> 8, 0, 0, 0, this.a[0], 2, 1));
                  this.a[0] = 4;
               }
            }
         }
      }

      if (this.b()) {
         if (this.d != 2 || this.c != 4) {
            if ((this.d == 3 || this.c == 1 && !a.c(this)) && this.a[3] > 0) {
               --this.a[3];
               if (this.a[3] <= 0) {
                  this.d(true);
                  this.a[3] = (byte)(this.d == 2 ? 30 : 60);
               }
            }

            if (this.a[1] > 0) {
               --this.a[1];
            }
         }

         if ((this.d == 3 || this.c == 1 || this.c == 4 && this.d()) && this.a[2] > 0) {
            --this.a[2];
            if (this.a[2] <= 0) {
               var1 = this.e();
               this.a[0] = Math.min(var1, this.a[0] + (this.d == 2 ? 5 : 50));
               this.a[1] = 50;
               if (this.a[0] < var1) {
                  this.a[2] = 40;
               }

               if (this.d() && !this.e() && this.a[0] >= var1 / 2) {
                  this.a[2] = false;
                  this.a[3] = 5;
                  this.i(4, 3);
                  this.i();
                  var10002 = a.i[this.c()]++;
               }
            }
         }
      }

   }

   public final void e(int var1, int var2) {
      int var3;
      if (this.a[1] && this.a[2] != 0) {
         var3 = this.a[2];
      } else {
         var3 = this.g();
      }

      if (this.a[4]) {
         this.g = this.e < var1 ? var3 : (this.e > var1 ? -var3 : 0);
      } else {
         this.g = e.b(var1 - this.e, var3);
      }

      if (this.a[5]) {
         this.h = this.f < var2 ? var3 : (this.f > var2 ? -var3 : 0);
      } else {
         this.h = e.b(var2 - this.f, var3);
      }
   }

   public final void f() {
      if (!this.d(3)) {
         int var1;
         int var2;
         if ((var1 = this.j()) != 3 && var1 != 2) {
            if (f.k[this.a[12]] > 1) {
               var2 = e.b(101) <= 50 ? 6 : 7;
            } else {
               var2 = e.b(101) <= 50 ? 4 : 5;
            }
         } else {
            var2 = e.b(101) <= 50 ? 8 : 9;
         }

         i.a(3, new int[]{var2, this.i()});
      }
   }

   public final int i() {
      return Math.max(0, 100 - 10 * Math.max(Math.abs(a.e.i - this.i), Math.abs(a.e.j - this.j)));
   }

   public final boolean a(d var1, int var2) {
      return a.a(this, var1, var2);
   }

   public final boolean a(int var1, int var2, int var3) {
      return a.a(this.i, this.j, var1, var2, var3);
   }

   public final int a(d var1) {
      return f.d(this.i, this.j, var1.i, var1.j);
   }

   public final d b() {
      d var1 = null;
      a.getClass();
      boolean var2 = this.b(0);
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < e.m; ++var4) {
         if (!this.c(var4)) {
            d[] var5 = a.a[var4];

            for(int var6 = 0; var6 < var5.length; ++var6) {
               d var7;
               if ((var7 = var5[var6]) != null && (var7.d == 2 && var7.e() || var7.d == 3) && !var7.a[0] && (!var2 || a.a(508, 2, var7.i, var7.j, false))) {
                  int var8 = this.a(var7);
                  if (var1 == null || var8 < var3 || !var2 && var1.d == 3 && var7.d == 2 && a.a(this.i, this.j, var7.i, var7.j, 3)) {
                     var1 = var7;
                     var3 = var8;
                  }
               }
            }
         }
      }

      return var1;
   }

   public final void d(boolean var1) {
      if (this.d == 2 && this.a[12] == 0 && this.a[19] != -1) {
         int[] var5;
         if ((var5 = a.a(this.i, this.j, 2, -1, this.a[1] ? 500 : 48, new int[]{this.a[19]})) != null) {
            this.a(var5[0], var5[1], (d)null);
         } else {
            this.a[19] = -1;
            a.getClass();
            if (this.b(0) && var1) {
               a.a(e.a(145), this.i, this.j);
            }
         }

      } else {
         int var2 = this.c();
         d var3;
         if ((var3 = this.b()) != null) {
            int var4;
            if (this.d == 3) {
               var4 = f.r[this.a[4]];
            } else if (this.a[1] && this.a[20] == 1 && a.a[var2].o == 0 && a.a[var2].t != -1) {
               var4 = -1;
            } else {
               var4 = Math.max(f.k[this.a[12]], f.l[this.a[12]]);
            }

            if (var4 == -1 || this.a(var3, var4)) {
               if (this.d == 3) {
                  this.b(var3, 0);
               } else if (this.c()) {
                  this.a(var3.i, var3.j, var3);
                  if (var4 != -1) {
                     this.g();
                  }
               }

               a.getClass();
               if (var2 != 0 && a.a[var2].o == 2) {
                  a.a[var2].o = 0;
               }
            }
         }

      }
   }

   public final boolean c() {
      return this.f() > 0;
   }

   public final void a(d var1, int var2) {
      if (this.a[0] > 0) {
         int var3 = this.c();
         int var4 = var1 == null ? -1 : var1.c();
         a.getClass();
         if (var3 == 0 && !this.b(false) && a.ao == 0 && var1 != null) {
            a.ao = 100;
            a.a(e.a(142), this);
         }

         int[] var10000 = this.a;
         var10000[0] -= var2;
         if (this.d == 3 || this.c == 1) {
            this.g();
         }

         if (this.a[0] <= 0) {
            if (this.d == 3) {
               i.a(3, new int[]{11, this.i()});
            } else if (this.d == 2) {
               int var10002 = a.i[var3]--;
               a.c(this);
               this.a[2] = true;
               this.i();
               this.i(f.p[this.a[12]], this.d() ? 3 : var3);
               this.j(e.b(2));
               this.c = 4;
            }

            if (this.d()) {
               this.a[2] = 40;
               a.a(e.a(147, (String[])(new String[]{e.a(this.a[4])})), this);
            } else {
               a.getClass();
               if (var3 == 0) {
                  if (this.d == 2) {
                     ++a.m[4];
                  } else {
                     ++a.m[5];
                  }
               } else {
                  if (this.d == 2) {
                     a.getClass();
                     if (var4 == 0) {
                        ++a.m[2];
                     }

                     a.a[var3].e(this);
                  } else {
                     a.getClass();
                     if (var4 == 0) {
                        ++a.m[3];
                     }

                     a.a[var3].c(this);
                  }

                  a.getClass();
                  if (var4 == 0) {
                     a.a(this.e(), this.i, this.j, this.a, this);
                  }
               }

               boolean var5 = a.a(a.e.i, a.e.j) == this;
               if (this.d == 2) {
                  if (this.a[14] != -1) {
                     a.a(1, 0, this.a[14], this.a[15], 0, false);
                  }

                  a.getClass();
                  if (var3 == 0) {
                     --a.Z[this.a[12]];
                  }

                  a.c(var3, -1);
                  if (this.a[23] != -1) {
                     a.a(7168, 10, this.a[23], this.a[24], -1);
                  }

                  a.getClass();
                  if (this.c(0)) {
                     a.a(this.i, this.j, f.l[this.a[12]], false);
                  }

                  this.b = true;
                  if (this.j() == 2) {
                     a(this.e >> 8, this.f >> 8, false, true, 1);
                  }
               } else {
                  byte[] var6 = a.a(var3, this.a[4]);

                  for(int var7 = 0; var7 < var6.length; var7 += 3) {
                     int var8 = this.i + var6[var7];
                     a((this.j + var6[var7 + 1]) * 48, var8 * 48, false, false, 0);
                  }

                  this.o();
                  a.m();
                  if (this.a[4] == 1) {
                     boolean var11 = a.a(3, 1, var3) != null;
                     a.b[var3] = var11;
                     if (a.c && a.s == 0 && !var11) {
                        a.E();
                     }
                  }
               }

               if (var5) {
                  a.A();
                  a.C();
               }
            }

            a.n();
            if (this.a[1] != -1) {
               a.e.d(this.i);
               a.e.e(this.j);
               a.C();
               a.o();
               a.n = null;
               a.d.removeAllElements();
               a.d.addElement(new short[]{0, (short)this.a[1], 0});
               a.l = false;
               a.ar = 40;
               return;
            }
         } else {
            this.a[1] = 50;
            this.a[2] = 100;
            if (this.d == 2) {
               if (!this.a[3] && this.c() && (this.a[0] == null || !this.a[0].c() || var1.d == 2 && this.a[0].d == 3)) {
                  this.a(var1.i, var1.j, var1);
               }
            } else if (this.d == 3) {
               a.getClass();
               if (var3 != 0) {
                  a.a[var3].b(var1);
               }
            }

            a.getClass();
            if (var3 != 0 && this.d(0) && var1 != null) {
               if (this.c == 3) {
                  this.k();
                  this.a[19] = -1;
                  this.i();
               }

               int[] var10;
               if ((var10 = a.a(this.i, this.j, 0, f.a(var1.i, var1.j, this.i, this.j), 48, (int[])null)) != null) {
                  this.b(var10[0], var10[1], false);
               }
            }
         }

      }
   }

   public final int j() {
      return this.d == 3 ? 3 : f.m[this.a[12]];
   }

   public final boolean d(int var1) {
      return this.d == 2 && this.a[12] == var1;
   }

   public final boolean d() {
      return this.d == 2 && this.a[4] != -1;
   }

   public final boolean e() {
      return !this.a[2];
   }

   public final boolean a(boolean var1) {
      boolean var2 = false;
      boolean var3 = this.a[12] == 0;
      boolean var4 = this.a[19] != -1;
      d[] var5 = a.b[this.c()];

      for(int var6 = 0; var6 < var5.length; ++var6) {
         d var7;
         if ((var7 = var5[var6]) != null && var7 != this && var7.e() && var7.a(this, 2) && !a.b(var7)) {
            boolean var8 = var7.a[12] == 0;
            boolean var9 = var7.a[19] != -1;
            if ((!var1 || var7.a[12] == this.a[12]) && var3 == var8 && (!var3 || var4 == var9) && a.a(var7)) {
               var7.a(var1);
               var2 = true;
            }
         }
      }

      return var2;
   }

   public final void g() {
      d[] var1 = a.b[this.c()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         d var3;
         d var4;
         if ((var3 = var1[var2]) != null && var3 != this && var3.a(this, 2) && var3.c() && var3.e() && var3.f() && (var4 = var3.b()) != null) {
            var3.a(var4.i, var4.j, var4);
         }
      }

   }

   public final void f(int var1, int var2) {
      this.a(var1, var2, false);
   }

   public final void a(int var1, int var2, boolean var3) {
      if (this.d != 2 || this.e()) {
         this.k();
         this.a[19] = -1;
         if (!var3) {
            this.a[2] = 0;
         }

         boolean var4 = a.b(508, 2, var1, var2);
         d var5 = a.a(var1, var2);
         if (this.a[12] == 0 && a.c(var1, var2) || var5 != null && this.b(var5)) {
            this.a(var1, var2, var5);
            if (var3) {
               a.getClass();
               if (this.b(0)) {
                  boolean var6 = a.b(2, 1, var1, var2);
                  if ((var5 != null || !var6) && (var5 == null || var5.d != 2 || !var4) && (var5 == null || var5.d != 3 || !var6 || !a.a(var1, var2, true))) {
                     this.g(var1, var2);
                  } else {
                     this.h();
                  }

                  return;
               }
            }
         } else {
            this.b(var1, var2, true);
            if (var3) {
               this.a[3] = true;
            }

            if (var3) {
               a.getClass();
               if (this.b(0)) {
                  this.g(var1, var2);
               }
            }
         }

      }
   }

   public final void g(int var1, int var2) {
      a.b(a.c);
      a.c.c(var1, var2);
      a.c.j(0);
      a.a(a.c);
   }

   public final void h() {
      a.a(1, 4);
   }

   public final void i() {
      this.c = 1;
      boolean var1 = this.a[1] != null;
      this.a[0] = null;
      this.g = 0;
      this.h = 0;
      this.m();
      boolean var2 = false;
      if (!var1) {
         if (this.a[3]) {
            this.a[3] = false;
         }

         if (this.h()) {
            var2 = true;
            if (this.a[16] != -1) {
               this.a(this.a[16], this.a[17], (d)null);
            } else {
               int[] var3;
               if ((var3 = a.a(this.i, this.j, 1, -1, 48, (int[])null)) != null) {
                  this.b(var3[0], var3[1], false);
               }
            }
         } else if (this.a[16] != -1) {
            if (!this.e()) {
               this.k();
            } else if (this.a(this.a[16], this.a[17], f.k[this.a[12]])) {
               this.h(f.b(this.i, this.j, this.a[16], this.a[17]));
               if (this.f() == 0) {
                  this.n();
               }

               this.c = 3;
            }
         } else {
            this.a[3] = 30;
         }
      }

      if (!var2) {
         this.a[14] = (byte)this.i;
         this.a[15] = (byte)this.j;
         a.a(1, 0, this.i, this.j, 1, false);
      }

      if (this.a[0] < this.e()) {
         this.a[2] = 100;
      }

   }

   public final void b(int var1, int var2, boolean var3) {
      if (this.c != 1) {
         this.i();
      }

      byte[][] var4 = a.a[this.c()].size() <= 15 ? a.k : a.l;
      int var5 = var3 ? a.a(this) : -1;
      int var6 = var1 + (var5 == -1 ? 0 : var4[this.a[13]][2 * var5]);
      int var7 = var2 + (var5 == -1 ? 0 : var4[this.a[13]][2 * var5 + 1]);
      int[] var8 = this.a(this.i, this.j, var6, var7);
      this.a[0] = null;
      this.a[1] = var8;
      this.a[11] = 0;
      a.a(this, this.i, this.j, var8[0], var8[1]);
   }

   public final void a(int var1, int var2, d var3) {
      int[] var4;
      if (var3 != null && var3.d == 3) {
         var1 = (var4 = a.a(this, var3, false))[0];
         var2 = var4[1];
      }

      this.a[16] = (byte)var1;
      this.a[17] = (byte)var2;
      if (var3 != null) {
         this.a[0] = var3;
      }

      if (a.b(var1, var2)) {
         this.a[19] = (byte)e.a(f.y, a.a(var1, var2));
      }

      if (var3 != null && f.k[this.a[12]] > 1) {
         if (this.c(var3)) {
            return;
         }

         var4 = new int[]{var1, var2};
      } else if (var3 != null && var3.d == 3) {
         var4 = a.a(this, var3, true);
      } else {
         var4 = this.a(var1, var2);
      }

      if (var4 != null && var4[0] != -1 && var4[1] != -1) {
         this.b(var4[0], var4[1], false);
      } else if (this.a[14] == -1) {
         int[] var5;
         if ((var5 = a.a(var1, var2, 1, -1, 48, (int[])null)) != null) {
            this.b(var5[0], var5[1], false);
         } else {
            this.j();
         }

      } else {
         this.j();
      }
   }

   public final void j() {
      if (this.a[12] == 0) {
         this.d(false);
      } else {
         this.k();
         this.i();
      }
   }

   public final void b(d var1, int var2) {
      if (var2 == 0 && this.d == 2) {
         this.a[3] = this.h();
      }

      if (var1 == null || var1.a[0] || var1.d == 2 && !var1.e()) {
         if (this.d == 2) {
            this.k();
            this.i();
         }

      } else {
         if (var2 == 0) {
            if (this.d == 2) {
               this.a[25] = f.i[this.a[12]];
            }

            if (var1 != null && !var1.a[0]) {
               if (this.d == 2) {
                  this.n();
               }

               this.f();
            }

            if (this.d == 3 || f.k[this.a[12]] > 1 && !this.d(3) && this.j() != 2) {
               if (this.d == 2) {
                  this.c(true);
               }

               this.a(var1);
            }
         }

         if (var2 == 1) {
            byte var3 = this.d == 2 ? f.j[this.a[12]] : 1;
            int var4 = this.f();
            byte var5 = this.d == 2 ? f.h[this.a[12]] : 2;
            int var6 = var4;
            int var8;
            if (this.d == 2) {
               boolean var7 = false;
               if (f.b[this.a[12]] != null) {
                  if (var1.d == 2) {
                     var8 = var1.j();
                     var7 = e.b(f.b[this.a[12]], var8) != -1;
                  } else {
                     var7 = e.b((byte[])f.b[this.a[12]], 3) != -1;
                  }
               }

               if (var7) {
                  var6 = 300 * var4 / 100;
               }
            }

            if (var5 > 0) {
               var6 += e.a(var5);
            }

            if (var3 > 0) {
               for(var8 = 0; var8 < e.m; ++var8) {
                  if (!this.c(var8)) {
                     d[] var9 = a.b[var8];

                     for(int var10 = 0; var10 < var9.length; ++var10) {
                        d var11;
                        if ((var11 = var9[var10]) != null && var11 != var1 && var11.e() && !var11.a[0] && var11.a(var1, var3)) {
                           int var12 = this.a(var11);
                           var11.a(this, var4 / Math.max(1, var12 * 2));
                        }
                     }
                  }
               }
            }

            var1.a(this, var6);
            if (this.d == 2 && this.j() == 2) {
               this.c(false);
               this.a(var1);
               this.a[26] = (byte)(2 * f.e[this.a[12]] / 3);
            }

            if (this.d == 3 || this.j() == 2 || this.a[12] == 3) {
               var8 = var1.j * 48;
               int var13 = var1.i * 48;
               if (var1.d == 3) {
                  if (var1.b().length > 3) {
                     var8 += 48;
                     var13 += 48;
                  }

                  var8 += e.a(24);
                  var13 += e.a(24);
               } else {
                  var8 += e.a(12);
                  var13 += e.a(12);
               }

               boolean var14 = this.j() == 2;
               a(var8, var13, var14, false, var14 ? 0 : 1);
            }
         }

         if ((this.d == 3 || this.a[25] == 0) && var2 == 0) {
            this.b(var1, 1);
         }

      }
   }

   public final void a(d var1) {
      int var2 = this.d == 2 ? this.a[18] : f.b(this.i, this.j, var1.i, var1.j);
      byte var3 = f.f[2 * var2];
      byte var4 = f.f[2 * var2 + 1];
      int var5;
      int var6;
      int var7;
      if (this.d == 3) {
         byte var9;
         if (this.b().length == 3) {
            var5 = this.j * 48;
            var6 = this.i * 48;
            var9 = 25;
         } else {
            var5 = (this.j + 1) * 48;
            var6 = (this.i + 1) * 48;
            var9 = 49;
         }

         var7 = 23040;
         var5 += var4 * var9;
         var6 += var3 * var9;
      } else {
         byte[] var8 = this.a(var2);
         var5 = (this.e >> 8) + var8[0];
         var6 = (this.f >> 8) + var8[1];
         var7 = var8[2] << 8;
      }

      int var14 = this.d(7) ? 8 : 3;

      for(int var15 = 0; var15 < var14; ++var15) {
         int var10 = var4 * 2 * 256 + e.a(128);
         int var11 = var3 * 2 * 256 + e.a(128);
         int var12 = e.a(128);
         int var13 = this.d(7) ? e.b(2) : 0;
         a.a(a(var5 + e.a(2), var6 + e.a(2), var10, var11, var12, var7, 2, var13));
      }

   }

   public final byte[] b() {
      return a.a(this.c(), this.a[4]);
   }

   public final int[] a(int var1, int var2, int var3, int var4) {
      int[] var5;
      if (!a.a(var3, var4) && (var5 = a.a(var3, var4, 0, -1, 48, (int[])null)) != null) {
         var3 = var5[0];
         var4 = var5[1];
      }

      int var21 = var2 * 48 << 8;
      int var6 = var1 * 48 << 8;
      int var7 = var4 * 48 << 8;
      int var8 = var3 * 48 << 8;
      int var9 = var7 - var21;
      int var10 = var8 - var6;
      int var11;
      int[] var12;
      if ((var11 = e.d(Math.max(Math.abs(var9), Math.abs(var10)), 49152) >> 8) > 0) {
         var12 = new int[2 * var11];
         int var13 = var9 / var11;
         int var14 = var10 / var11;
         int var15 = var21;
         int var16 = var6;

         for(int var17 = 0; var17 < 2 * var11 - 2; var17 += 2) {
            var15 += var13;
            var16 += var14;
            int var18 = a.c(var16);
            int var19 = a.d(var15);
            int[] var20;
            if (!a.a(var18, var19) && (var20 = a.a(var18, var19, 0, -1, 500, (int[])null)) != null) {
               var18 = var20[0];
               var19 = var20[1];
            }

            var12[var17] = var18;
            var12[var17 + 1] = var19;
         }

         var12[var12.length - 2] = var3;
         var12[var12.length - 1] = var4;
      } else {
         var12 = new int[]{var3, var4};
      }

      return var12;
   }

   public final void h(int var1) {
      this.a[18] = (byte)var1;
      this.m();
   }

   public final boolean b(d var1) {
      return this.f() > 0 && !this.a(var1);
   }

   public final boolean f() {
      if (this.d != 2) {
         return true;
      } else {
         return (this.d(0) && this.a[19] == -1 || !this.d(0) && this.a[16] == -1) && !this.a[3];
      }
   }

   public final boolean b(boolean var1) {
      if (!var1 && (this.d == 6 || this.d == 5)) {
         return true;
      } else {
         int[] var2;
         if (this.d == 3) {
            var2 = a.a(this.e >> 8, this.f >> 8, f.P, f.Q);
            byte[] var3 = a.a(this.c(), this.a[4]);
            int var4 = this.k();
            return var3.length == 3 ? a.d(var2[0] - f.P / 2, var2[1] - var4, f.P, var4 + f.Q) : a.d(var2[0] - f.P, var2[1] - var4, 2 * f.P, var4 + 2 * f.Q);
         } else {
            var2 = a.a((this.e >> 8) + 24, (this.f >> 8) + 24, f.P, f.Q);
            return a.d(var2[0] + f.b[this.k][0], var2[1] + f.b[this.k][1], f.a[this.k][0][0].a, f.a[this.k][0][0].b);
         }
      }
   }

   public final int k() {
      return f.K[this.a[4]];
   }

   public final void k() {
      if (this.a[16] != -1) {
         this.a[16] = -1;
         this.a[17] = -1;
         this.a[0] = null;
      }

   }

   public final int[] a(int var1, int var2) {
      int var3 = Integer.MAX_VALUE;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = var1 - 1; var6 <= var1 + 1; ++var6) {
         for(int var7 = var2 - 1; var7 <= var2 + 1; ++var7) {
            int var8;
            if ((var6 == this.a[14] && var7 == this.a[15] || a.a(var6, var7) && !a.b(1, 0, var6, var7)) && (var8 = Math.abs(this.i - var6) + Math.abs(this.j - var7)) < var3) {
               var3 = var8;
               var4 = var6;
               var5 = var7;
            }
         }
      }

      if (var4 == -1) {
         return null;
      } else {
         return new int[]{var4, var5};
      }
   }

   public final void h(int var1, int var2) {
      this.a[4] = (byte)var1;
      this.a[5] = (byte)var2;
      this.a[18] = (byte)f.b(this.i, this.j, var1, var2);
      this.m();
      int[] var3 = this.a[0];
      this.a[4] = false;
      this.a[5] = false;
      if (this.a[10] <= var3.length / 2 - 2) {
         int var4 = this.a[10] + 1;
         int var5 = var3[2 * var4];
         int var6 = var3[2 * var4 + 1];
         int var7;
         if ((var7 = f.a(this.i, this.j, var1, var2)) == f.a(var1, var2, var5, var6)) {
            if (var7 == 6 || var7 == 2) {
               this.a[4] = true;
               return;
            }

            if (var7 == 0 || var7 == 4) {
               this.a[5] = true;
               return;
            }

            this.a[4] = true;
            this.a[5] = true;
         }
      }

   }

   public final void a(int[] var1, boolean var2) {
      if (this.e()) {
         boolean var3 = false;
         int[] var4;
         if (var2 && this.a[0] != null) {
            var3 = true;
            var4 = new int[this.a[0].length + var1.length];
            System.arraycopy(this.a[0], 0, var4, 0, this.a[0].length);
            System.arraycopy(var1, 0, var4, this.a[0].length, var1.length);
            this.a[0] = var4;
            var1 = var4;
         } else {
            this.a[0] = var1;
            this.a[10] = 0;
         }

         if ((var4 = this.a[1]) != null) {
            int var5 = var1[var1.length - 2];
            int var6 = var1[var1.length - 1];
            int var7 = var4.length / 2;
            ++this.a[11];
            if (this.a[11] < var7) {
               int var8 = var4[2 * this.a[11]];
               int var9 = var4[2 * this.a[11] + 1];
               a.a(this, var5, var6, var8, var9);
            } else {
               this.a[1] = null;
               this.a[8] = (byte)var5;
               this.a[9] = (byte)var6;
            }
         }

         if (this.c != 2) {
            this.c = 2;
            if (this.a[14] != -1) {
               a.a(1, 0, this.i, this.j, 0, false);
               this.a[14] = -1;
               this.a[15] = -1;
            }

            this.m();
         }

         if (!var3) {
            this.h(var1[0], var1[1]);
            if (this.a[23] != -1) {
               a.a(7168, 10, this.a[23], this.a[24], -1);
               this.a[23] = -1;
               this.a[24] = -1;
            }
         }

         this.d();
      }
   }

   public final void l() {
      int[] var1 = this.a[0];
      ++this.a[10];
      int var2 = var1.length / 2;
      if (this.a[10] > var2 - 1) {
         this.i();
      } else {
         int var3 = var1[2 * this.a[10]];
         int var4 = var1[2 * this.a[10] + 1];
         if (!a.a(var3, var4)) {
            this.f(this.a[8], this.a[9]);
         } else if (var3 == this.a[8] && var4 == this.a[9] && a.a(1, 0, var3, var4, false)) {
            if (this.a[16] != -1) {
               this.f(this.a[16], this.a[17]);
            } else {
               this.i();
            }
         } else {
            this.h(var3, var4);
         }

         if (this.a[1] && !this.d(0) && this.a[0] == null) {
            this.d(false);
         }
      }

      if (this.a[0] != null && f.k[this.a[12]] > 1) {
         this.c(this.a[0]);
      }

      this.g();
   }

   public final boolean g() {
      d var1;
      if ((var1 = this.a[0]) == null || var1.d != 2 || this.a[16] == var1.i && this.a[17] == var1.j) {
         return true;
      } else {
         this.a(var1.i, var1.j, var1);
         return false;
      }
   }

   public final boolean h() {
      return a.a(1, 0, this.i, this.j, false) && (this.i != this.a[14] || this.j != this.a[15]);
   }

   public final boolean c(d var1) {
      if (var1 != null && this.a(var1, f.k[this.a[12]])) {
         if (!this.h()) {
            this.i();
            return true;
         }

         int[] var2;
         if ((var2 = a.a(this.i, this.j, 1, -1, 48, (int[])null)) != null) {
            this.b(var2[0], var2[1], false);
            return true;
         }
      }

      return false;
   }

   public final void m() {
      boolean var1 = this.c == 2;
      byte var2 = -1;
      switch(this.a[18]) {
      case 0:
         if (var1) {
            var2 = 6;
         } else {
            var2 = 2;
         }
      case 1:
      case 3:
      case 5:
      default:
         break;
      case 2:
         if (var1) {
            var2 = 5;
         } else {
            var2 = 1;
         }
         break;
      case 4:
         if (var1) {
            var2 = 7;
         } else {
            var2 = 3;
         }
         break;
      case 6:
         if (var1) {
            var2 = 4;
         } else {
            var2 = 0;
         }
      }

      if (var2 != -1 && var2 != this.l) {
         this.j(var2);
      }

   }

   public final void n() {
      byte var1 = -1;
      switch(this.a[18]) {
      case 0:
         var1 = 10;
      case 1:
      case 3:
      case 5:
      default:
         break;
      case 2:
         var1 = 9;
         break;
      case 4:
         var1 = 11;
         break;
      case 6:
         var1 = 8;
      }

      if (var1 != -1) {
         this.j(var1);
      }

   }

   public final void a(Graphics var1, int var2, int var3, boolean var4) {
      if (!var4 || this.d != 2 || this.e() || this.d()) {
         int[] var5 = a.a((this.e >> 8) + 24, (this.f >> 8) + 24, var4 ? f.R : f.P, var4 ? f.S : f.Q);
         if (var4) {
            f.i[this.c()].a(var1, var5[0] + var2, var5[1] + var3, 3);
         } else {
            if (this.d == 2) {
               a.getClass();
               if (this.b(0) && a.b(this)) {
                  f.k[this.a[4] == -1 ? 0 : 1].a(var1, var5[0] + var2, var5[1] + var3, 3);
               }
            } else if (this.d == 6 || this.d == 5) {
               if (this.i()) {
                  var1.setColor(0);
                  var1.fillArc(var5[0] - 2 + var2, var5[1] - 1 + var3, 4, 2, 0, 360);
               }

               var3 -= (e.a(1, (int)this.a[0]) >> 8) / 2;
            }

            if (this.k >= 0) {
               this.a(var1, var5, var2, var3);
            }

            if (this.d != 3 && (this.d != 2 || this.a[4] == -1 && !this.e())) {
               if (this.d == 6) {
                  e.a(e.e, var1, "+" + this.a[3], var5[0] + var2, var5[1] + var3, 33);
               }

            } else {
               int var6 = -(this.l() + 9 + e.a(1, (int)3));
               if (this.d == 3 && this.c == 0) {
                  var6 -= e.a(1, (int)3);
               }

               boolean var7;
               int var8;
               label139: {
                  var7 = this.d == 2 ? a.b(this) : a.a == this;
                  if (this.a[1] <= 0) {
                     a.getClass();
                     if ((!this.b(0) || !a.b(this)) && this != a.f && (this.d != 3 || this.c != 0)) {
                        break label139;
                     }
                  }

                  var8 = this.e();
                  int var9;
                  if (this.a[0] < var8 / 3) {
                     var9 = 16711680;
                  } else if (this.a[0] < 2 * var8 / 3) {
                     var9 = 16776960;
                  } else {
                     var9 = 5064382;
                  }

                  int var10 = 100 * this.a[0] / var8;
                  this.a(var1, var5[0] + var2, var5[1] + var6 + var3, var10, var9, var7);
               }

               if (this.d == 3) {
                  a.getClass();
                  if (this.b(0) && this.c == 2) {
                     var8 = 100 * this.a[3] / this.a[4];
                     this.a(var1, var5[0] + var2, var5[1] + 2 + 3 + var6 + var3 + 0, var8, 16776960, var7);
                  }
               }

               if (this.d == 3 && this.c != 0) {
                  var8 = this.c();
                  byte[] var11 = a.k[var8] == 0 ? f.I : f.J;
                  a.d.a(var1, var5, var8, var11[2 * this.a[4]] + var2, var11[2 * this.a[4] + 1] + var3);
               }

            }
         }
      }
   }

   public final boolean i() {
      return this.k >= 15 && this.k <= 18;
   }

   public final int l() {
      if (this.d == 2) {
         return f.a(this.k);
      } else {
         return this.c == 0 ? f.a[0].b / 2 : this.k();
      }
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
      var2 -= 6;
      var1.setColor(0);
      var1.fillRect(var2, var3, 12, 2);
      var1.setColor(var5);
      int var7 = Math.max(1, var4 * 12 / 100);
      var1.fillRect(var2, var3, var7, 2);
      if (var6) {
         var1.setColor(16777215);
         var1.drawRect(var2 - 1, var3 - 1, 13, 3);
      }

   }

   public final void o() {
      if (this.b()) {
         int var1 = this.c();
         this.a[0] = true;
         if (this.d == 3) {
            int var10002 = a.j[var1]--;
            --a.Y[this.a[4]];
            byte[] var2 = a.a(var1, this.a[4]);

            int var4;
            int var5;
            for(int var3 = 0; var3 < var2.length; var3 += 3) {
               var4 = this.i + var2[var3];
               var5 = this.j + var2[var3 + 1];
               a.a(1, 0, var4, var5, 0, false);
               a.a(512, 9, var4, var5, 0, false);
               a.b(var4, var5, f.S[e.b(f.S.length)]);
               a.getClass();
               if (this.c(0)) {
                  if (this.c == 0) {
                     a.a(508, 2, var4, var5, -1);
                  } else {
                     a.a(var4, var5, f.r[this.a[4]], false);
                  }
               } else {
                  a.b(var4, var5);
               }
            }

            if (this.a[4] == 1) {
               a.d(var1, -10);
            } else if (this.a[4] == 2) {
               a.d(var1, -5);
            }

            if (this == a.a) {
               a.G();
            }

            int[] var10;
            if ((var10 = this.a[0]) != null) {
               for(var4 = 0; var4 < var10.length; var4 += 2) {
                  var5 = var10[var4];
                  byte var6 = f.t[var5];
                  int var7 = var10[var4 + 1];
                  short[] var8 = f.b[var5];

                  for(int var9 = 0; var9 < 3; ++var9) {
                     var8[var9] = (short)(var8[var9] * var7);
                  }

                  a.a(var1, var8);
                  if (var6 == 0) {
                     a.c(var1, -var7);
                  }
               }
            }
         }
      }

      a.b(this);
   }

   public final int m() {
      return this.a(10) + this.b(10);
   }

   public final int n() {
      return this.e + this.f;
   }

   public final int b(d var1) {
      int var2 = this.m();
      int var3 = this.n();
      int var4 = var1.m();
      int var5 = var1.n();
      if (var2 == var4 && var3 == var5) {
         return 0;
      } else {
         return var4 >= var2 && (var4 != var2 || var5 >= var3) ? -1 : 1;
      }
   }

   public final void i(int var1) {
      this.i(var1, 0);
   }

   public final void i(int var1, int var2) {
      this.k = var1;
      this.o = var2;
      this.j(0);
   }

   public final void j(int var1) {
      this.l = var1;
      this.m = 0;
      this.n = f.b[this.k][this.l][0];
      this.c = true;
   }

   public final void p() {
      if (this.k >= 0) {
         boolean var1 = false;
         if (--this.n <= 0) {
            ++this.m;
            var1 = true;
         }

         if (this.j()) {
            if (f.m[this.k][this.l] == 1) {
               this.m = 0;
            } else {
               --this.m;
               this.c = false;
            }
         }

         if (var1) {
            this.n = f.b[this.k][this.l][this.m];
         }
      }

   }

   public final boolean j() {
      return this.m >= f.a[this.k][this.l].length;
   }

   public final void a(Graphics var1, int[] var2, int var3, int var4) {
      this.a(var1, var2, this.o, var3, var4);
   }

   public final void a(Graphics var1, int[] var2, int var3, int var4, int var5) {
      if (this.k >= 0) {
         g var6 = f.a[this.k][var3][f.a[this.k][this.l][this.m]];
         short var7 = f.b[this.k][this.l][this.m];
         int var8 = f.b[this.k][0];
         if (var7 == 2) {
            var8 = -(var6.a + var8);
         }

         var4 += var8;
         var5 += f.b[this.k][1];
         var6.b(var1, var2[0] + var4, var2[1] + var5, var7);
      }

   }
}
