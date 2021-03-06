public boolean evenlySpaced(int a, int b, int c) {
  //return true if small_medium equals medium_large
  int small = Math.min(Math.min(a, b), Math.min(b, c));
  int large = Math.max(Math.max(a, b), Math.max(b, c));
  int medium = a + b + c - small - large;
 
  return (medium - small == large - medium);
}
