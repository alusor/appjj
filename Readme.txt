————— Thank you for your purchase! ———————————————————



To get started, open go to our documentation using the link file or visit:
http://sherdle.com/support/documentation/

If you don’t have an internet connection, you can check the offline documentation (exported pdf of the web version).



————————————————— License ————————————————————————————



For more license information, check the License.txt file inside the template's folder.



——————————— Change log & Upgrading ———————————————————

From V1 to V1.1

Warning: Analytics has been removed from the template.
Updates: Check our website.
Upgrading: Complete reconfiguration required, you can not recycle any files except
single assets (images).



From V1.1 to V1.1.1

Information: You only have to update if you use Wordpress in Rss.
Updates: Check our website.
Upgrading: Complete reconfiguration required, you can not recycle any files except
single assets (images).



From V1.1.1 to V1.2

Updates: Check our website.
Warning: We dropped the functionality to switch between NativeWeb & Webview for RSS descriptions
Updates: Check our website.
Upgrading: Complete reconfiguration required, you can not recycle any files except
single assets (images).




From V1.2 to V1.2.1

Updates: fixed bug's only
Upgrading: Replace your current WordpressDetailActivity with the new one



From V1.2 to V1.2.2

Updates: 
Aug:
- Youtube Playlist Compatibility
- Overall bugfixes
Sep:
- Wordpress thumbnail compatibility and fallback
- Rss refresh button
- Rss adview reliability
Upgrading: You can keep your all you non-layout xml files and the SlidingMenuFragment.java file



From V1.2.2 to V1.2.3

Updates: Bugfixes & Stability improvements
Upgrading: You can keep most of you files:
Replace the RSS packages
Replace the Wordpress packages
Replace the XML layout files.



From V1.2.3 to V2.0

Updates:
- Material Design
- Redesigned Application Framework, fragment based
- Faster loading, especially for Wordpress Items
- Twitter supports search (e.g. hashtag) as content
- Easier Setup using configuration file
- Video Documentation
- No connection handling improved
- Endless scrolling loading indication footer
- Fading ActionBar (toolbar)
- Using official NavigationDrawer instead of SlidingMenu library
- Looks better on tablets
- Multi-orientation support
- Improvements regarding notifications
- Stability and Compatibility improvements
- Lollipop bugfixes & features (e.g. not using the in app player due to compatibility issues, ripple and tint). 

Deprecated:
- User can not set a default item, it’s now by default the first item in the menu
- Links in RSS/Wordpress do not open in WebView anymore

Upgrading: 
Complete reconfiguration required. 



From V2.0 to V2.1

Updates:
- Android Studio documentation and main version
- Background loading of items (you’re free to navigate)
- Background radio playing
- RSS notifications are easier to configure and on by default.
- Notifications have content preview
- Links from detail views will be loaded in web-view again.
- Wordpress & Tumblr reload bug fix
- Menu open by default bug fix
- Losing connection while using app fix

Upgrading:
Complete reconfiguration recommended.



From V2.1 to V2.2

Updates: 
- New Navigation Drawer
- Google Places API
- Headers/highlighted items for Wordpress Youtube
- Maps Navigation
- WebView fullscreen HTML5 Video
- WebView stability & appearance
- Bug fixes & Stability improvements 

Upgrading:
A summary of all changed files can be found in ‘File Changelog.txt’



From V2.2 to V2.2.1

Updates:
- RTL Arab & Hebrew support for Android 4.2+
- Settings cleaned up, ability to set font size
- Author & Date shown for wordpress
- RSS reliability & media updated
- Higher quality wordpress attachements & images.
- Ability to hide menu (just add 1 item).
- Bug fixes: Youtube sharing, Adview in detail focus, notification body, webview background playing.

Upgrading:
A summary of all changed files can be found in ‘File Changelog.txt’




From V2.2.1 to V2.3

Updates:
- Native Facebook support
- Native Instagram support
- In-App purchase to remove ads & unlock sections
- Comments for Youtube, Facebook, Instagram and Wordpress
- Related posts for Wordpress
- Support for RSS podcasts
- Built-in media viewer (for images, video and sound)
- Radio player notification & call  interrupt
- Layout improvements (more icons, more material design)
- Updates for Android 5.1
- Notification Sound
- Bug fixes: Notifications stop when turned off, Menu width, RTL support improved, empty search results toast, Webview related improvements, other minor improvements.

Upgrading:
It’s recommended to start over, you can reuse your Configuration file. Strings.xml has to be reconfigured since we’ve added some strings. Menu Icons, Launcher icons and Drawer Header images can be transferred to your new project.





From V2.3 to V2.3.1
Updates:
- Bug fixes
- Play button over Facebook video
- Translation improvements
- Debug info hints

Upgrading:
It’s not necessary to upgrade if you’re not having any problems with the current version. If you do, the main updates are in the Facebook package (and layout files) and the Wordpress package. You can replace these packages and files.





From V2.3.1 to V2.3.2
Updates:
- Bug fixes and compatibility improvements
- Facebook not playing
- Translation improvements
- Download option for videos, images and audio (built-in player)
- Text size setting now works for Facebook & Instagram
- More optional settings on file basis

Upgrading:
It’s not necessary to upgrade if you’re not having any problems with the current version. If you do, consider only upgrading the package’s your having trouble with. Otherwise a complete reinstallation is recommended. Config.xml and images can be kept.





From V2.3.2 to V2.4.0
Updates:
- Android Marshmallow support (including new permission system)
- New dedicated tablet layout
- Pull-to-refresh for WebView
- Adviews (Admob) now better optimized for all devices and located at the bottom.
- More layout and code re-using
- Bugfixes for: Instagram would not load, Theme issues, WebView local file issues

Upgrading:
This is a recommended update to support all new Android Marshmallow devices. You can keep your drawables, strings file and configuration file (config.java) all other files should be updated. 





From V2.4.0 to V2.5.0
New features:
- SoundCloud support!
- Disqus comments for Wordpress
- Radio Player now playing info
- Wordpress items load automatically in background, resulting in near-instant loading
- Date and time are relative now
- Menu items are translatable/can use string resource

Under the hood updates and fixes:
- Picasso instead of UIL
- Incompatible videos are opened externally now
- Support for new Instagram API
- More code re-use and optimization
- Added some settings like; Logging can be disabled with a simple toggle, API access way, in app webview behavior and more.
- Fix for WebView bugs on rotation and full screen video

Upgrading: 
If you are using WebView, Instagram or would like SoundClound or Disqus, this update is recommended, otherwise this update is optional. You can keep your drawables, most Strings. Configuration file (config.java) can be partially re-used but requires an update.