package desantisenterprise.ascabcapoeirahub;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * Created by Broderick on 10/6/2016.
 */

public class AboutActivity extends AppCompatActivity{


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            Element adsElement = new Element();
            adsElement.setTitle("Special Thanks: \n" +
                    "Mestre Dotour \n" +
                    "Monitor Agua de Bebe\n" +
                    "Monitor Lobo Mau");

            View aboutPage = new AboutPage(this)
                    .isRTL(false)
                    .setDescription("This app was designed to Consolidate the current ASCAB movesets to allow for a shared terminology between different ASCAB, " +
                            "as well as allow for the expansion of that teminology through new moves and variations. ")
                    .setImage(R.drawable.capoeiralogo)
                    .addItem(new Element().setTitle("Broderick DeSantis(Cem por Cento)\nVersion 1.0"))
                    .addItem(adsElement)
                    .addGroup("Let me know what you think of the App")
                    .addEmail("desantisbmbm@appstate.com")
                    //.addWebsite("http://medyo.github.io/")
                    .addFacebook("https://www.facebook.com/broderick.desantis")
                    .addTwitter("medyo80")//make one of these as a development tool
                    .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")//for adding videos? private account maybe
                    //.addPlayStore("com.ideashower.readitlater.pro") //is this even an option
                    //.addInstagram("medyo80") //can this display gifs?
                    //.addGitHub("medyo") //maybe when its done.
                    .addItem(getCopyRightsElement())
                    .create();

            setContentView(aboutPage);
        }


        Element getCopyRightsElement() {
            Element copyRightsElement = new Element();
            final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
            copyRightsElement.setTitle(copyrights);
            copyRightsElement.setIcon(R.drawable.about_icon_copy_right);
            copyRightsElement.setColor(ContextCompat.getColor(this, mehdi.sakout.aboutpage.R.color.about_item_icon_color));
            copyRightsElement.setGravity(Gravity.CENTER);
            copyRightsElement.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(AboutActivity.this, copyrights, Toast.LENGTH_SHORT).show();
                }
            });
            return copyRightsElement;
        }
    }
