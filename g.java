import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class g {
   public Image a;
   private int a = 0;
   private int b;
   private int c;
   public short a;
   public short b;

   public g() {
   }

   public g(byte[] var1) {
      this.a(var1);
   }

   public g(int var1) {
      this.a(e.a(var1));
   }

   private final void a(byte[] var1) {
      try {
         this.a = Image.createImage(var1, 0, var1.length);
         this.a = (short)this.a.getWidth();
         this.b = (short)this.a.getHeight();
      } catch (Exception var3) {
      }
   }

   public g(g var1, int var2, int var3, int var4, int var5) {
      this.a = (short)var4;
      this.b = (short)var5;
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public g(g var1, int var2) {
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.b = var1.b;
      this.c = var1.c;
      this.a = var2;
   }

   public final g[] a(int var1) {
      int var2 = this.a / var1;
      short var3 = this.b;
      return this.a(var2, var3);
   }

   public final g[] a(int var1, int var2) {
      int var3 = this.a / var1;
      int var4;
      g[] var5 = new g[(var4 = this.b / var2) * var3];
      int var6 = 0;

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            var5[var6++] = new g(this, var8 * var1, var7 * var2, var1, var2);
         }
      }

      return var5;
   }

   public final void a(Graphics var1, int var2, int var3) {
      this.a(var1, var2, var3, 20);
   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      var1.drawRegion(this.a, this.b, this.c, this.a, this.b, this.a, var2, var3, var4);
   }

   public final void b(Graphics var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 20);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      var1.drawRegion(this.a, this.b, this.c, this.a, this.b, var4, var2, var3, var5);
   }
}
