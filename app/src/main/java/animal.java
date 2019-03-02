import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.Serializable;

public class animal implements Serializable {

    String name;
    int legs;
    String info;
    Boolean fur;

        public animal (String aName, int aLegs, String aInfo, boolean aFur) {
            this.name = aName;
            this.legs = aLegs;
            this.info=aInfo;
            this.fur=aFur;
        }

        public String getName() {
            return name;
        }

        public int getlegs() {
            return legs;
        }

        public String getInfo() {
             return info;
        }

        public Boolean getfur() {
            return fur;
          }

        public void setName(String name){
            this.name=name;
        }

        public void setlegs(int legs){
            this.legs=legs;
        }

        public void setinfo(String info){
           this.info=info;
         }

         public void setfur(boolean fur){
            this.fur=fur;
    }
}
