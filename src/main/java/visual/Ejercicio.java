/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

/**
 *
 * @author Grupo12
 */
public class Ejercicio {
    private String message;
   private int level;
 
   public Ejercicio(String message, int level) {
 
      this.setMessage(message);
      this.setLevel(level);
 
      this.clear();
      this.update();
 
   }
 
   void clear() {
 
      this.message = "";
      this.level = 0;
      this.update();
 
   }
 
   void setMessage(String message) {
 
      this.message = message;
 
   }
 
   void setLevel(int level) {
 
      this.level = level;
 
   }
 
   private void update() {
 
    
   }
}
