class SimpleCircle {
  // ATTRIBUTE
  double radius, 
  pi = Math.PI; //3.14 atau 22/7

  // METHOD
  /** lingkaran yang memiliki radius 1  */
  SimpleCircle(){
    radius = 1;
  }

  /** membuat radius baru pada lingkaran */
  SimpleCircle(double RadiusBaru){
    radius = RadiusBaru;  
  }

  /** Rumus luas lingkaran */
  double getArea(){
    return radius * radius * pi;
  }
}  
