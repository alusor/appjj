package com.alusorstroke.jjvm;

import java.util.ArrayList;
import java.util.List;

import com.alusorstroke.jjvm.R;
import com.alusorstroke.jjvm.fav.ui.FavFragment;
import com.alusorstroke.jjvm.yt.ui.VideosFragment;

public class Config {

    //To open links in the WebView or outside the WebView.
    public static final boolean OPEN_EXPLICIT_EXTERNAL = true;
    public static final boolean OPEN_INLINE_EXTERNAL = false;

    //To open videos in our Local player or outside the local player
    public static final boolean PLAY_EXTERNAL = false;

    //To use the new drawer (overlaying toolbar)
    public static final boolean USE_NEW_DRAWER = true;

    //Wordpress perma-friendly API requests
    public static final boolean USE_WP_FRIENDLY = true;

	public static List<NavItem> configuration() {

		List<NavItem> i = new ArrayList<NavItem>();

		//DONT MODIFY ABOVE THIS LINE

        //Some sample content is added below, please refer to your documentation for more information about configuring this file properly
		/*i.add(new NavItem("Section", NavItem.SECTION));*/
        i.add(new NavItem("Web",NavItem.SECTION));
        i.add(new NavItem("Responsive Design",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3exWO3vj5nsKQays7XpLo67"
        }));
        i.add(new NavItem("Diseño Web",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3e_manR8pmKmU6NfTryIfI_"
        }));
        i.add(new NavItem("Juegos en Javascript",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3duPLEqSamvu-79XXEnqOVY"
        }));
        i.add(new NavItem("Menús Responsive",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3eq4PrjVEoDPTXi_S1hGkCi"
        }));
        i.add(new NavItem("Animaciones KeyFrame CSS3",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3fimKsDWwlzmunv7rlebPqm"
        }));
        i.add(new NavItem("Efectos y animaciones en 3D",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3dgMtQ0nmXx3_EkgqgKy8_k"
        }));
        i.add(new NavItem("Efectos Fotografricos CSS",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3fKL9mLBPkfUP0i6k5fmkyM"
        }));
        i.add(new NavItem("Atajos Sublime Text",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3ce9atym1MBKDcz8G0A6Wt9"
        }));
        /****************************************/
        /*****************Aplicaciones**********/
        i.add(new NavItem("Apps",NavItem.SECTION));
        i.add(new NavItem("Android Basico",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3dbmrZv5MT8WHYThw5XqD8I"
        }));
        i.add(new NavItem("LibGDX",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3duiko5MtkFPN2vhm0URmkE"
        }));
        i.add(new NavItem("Swift",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3dVexwvWFLc-NOQJL0r0bMT"
        }));
        i.add(new NavItem("Juegos con Swift",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3eLb5qG5JzkuN4S1eHyAxvm"
        }));
        /****************************************/
        /*****************Escritorio**********/
        i.add(new NavItem("Desktop",NavItem.SECTION));
        i.add(new NavItem("Java",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3fXkVeSku0Sf_FGNOjY4hfh"
        }));
        i.add(new NavItem("C++",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3et0VW1RdeHlXEJTN82Mt0H"
        }));
        i.add(new NavItem("Encriptación en Java",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3caN7AgjsA4efq0Aylpbn1l"
        }));

        /******************************************/
        /**************Otros**********************/
        i.add(new NavItem("Otros",NavItem.SECTION));
        i.add(new NavItem("VideoBlogs",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3dDOHvE3LyrPfzkjqM1HkRG"
        }));
        i.add(new NavItem("Haskell",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3fbHLdBJDmBwcNBZd_1Y_hC"
        }));
        i.add(new NavItem("SEO",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3cdzz9K_5wDRzI6HVoJ54CA"
        }));
        i.add(new NavItem("Lenguajes de programación",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3fgJRSH5B1nFfsElyyILsSs"
        }));
        i.add(new NavItem("Inteligencia Artificial",0, NavItem.ITEM, VideosFragment.class,new String[]{
                "PLraIUviMMM3cfUDGXox5PWTu07R1DOILG"
        }));
        /*
        i.add(new NavItem("Youtube Channel", R.drawable.ic_details, NavItem.ITEM, VideosFragment.class,
                new String[]{"UU7V6hW6xqPAiUfataAZZtWA","UC7V6hW6xqPAiUfataAZZtWA"}));
        i.add(new NavItem("Youtube Playlist", R.drawable.ic_details, NavItem.ITEM, VideosFragment.class,
                new String[]{"LL7V6hW6xqPAiUfataAZZtWA"}));

        i.add(new NavItem("RSS", R.drawable.ic_details, NavItem.ITEM, RssFragment.class,
                new String[]{"https://googleblog.blogspot.nl/atom.xml"}));
        i.add(new NavItem("Rss Podcast", R.drawable.ic_details, NavItem.ITEM, RssFragment.class,
                new String[]{"http://feeds.nature.com/nature/podcast/current"}));
        i.add(new NavItem("Webview", R.drawable.ic_details, NavItem.ITEM, WebviewFragment.class,
                new String[]{"http://www.google.com"}));

        i.add(new NavItem("Wordpress Recent", R.drawable.ic_details, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://androidpolice.com", "", "http://androidpolice.disqus.com/;androidpolice;%d http://www.androidpolice.com/?p=%d"}));
        i.add(new NavItem("Wordpress Category", R.drawable.ic_details, NavItem.ITEM, WordpressFragment.class,
                new String[]{"http://moma.org/wp/inside_out", "conservation"}));

        i.add(new NavItem("Tumblr", R.drawable.ic_details, NavItem.ITEM, TumblrFragment.class,
                new String[]{"androidbackgrounds"}, true));
        i.add(new NavItem("SoundCloud", R.drawable.ic_details, NavItem.ITEM, SoundCloudFragment.class,
                new String[]{"13568105"}));
        i.add(new NavItem("Radio Stream", R.drawable.ic_details, NavItem.ITEM, MediaFragment.class,
                new String[]{"http://yp.shoutcast.com/sbin/tunein-station.m3u?id=709809"}));

        i.add(new NavItem("Twitter", R.drawable.ic_details, NavItem.ITEM, TweetsFragment.class,
                new String[]{"Android"}));
        i.add(new NavItem("Instagram", R.drawable.ic_details, NavItem.ITEM, InstagramFragment.class,
                new String[]{"1067259270"}));
        i.add(new NavItem("Facebook", R.drawable.ic_details, NavItem.ITEM, FacebookFragment.class,
                new String[]{"104958162837"}));

        i.add(new NavItem("Maps Query", R.drawable.ic_details, NavItem.ITEM, MapsFragment.class,
                new String[]{"pharmacy"}));
        i.add(new NavItem("Maps Query", R.drawable.ic_details, NavItem.ITEM, MapsFragment.class,
                new String[]{"<b>Adress:</b><br>SomeStreet 5<br>Sydney, Australia<br><br><i>Email: Mail@Company.com</i>",
                        "Company",
                        "This is where our office is.",
                        "-33.864",
                        "151.206",
                        "13"}));
*/
        //It's suggested to not change the content below this line

        i.add(new NavItem("Dispositivo", NavItem.SECTION));
        i.add(new NavItem("Favoritos", R.drawable.ic_action_favorite, NavItem.EXTRA, FavFragment.class, null));
        i.add(new NavItem("Configuración", R.drawable.ic_action_settings, NavItem.EXTRA, SettingsFragment.class, null));

        //DONT MODIFY BELOW THIS LINE

        return i;

	}

}