### v 9.12 "Clara Zetkin" (WIP)
- moved repo from Github zu Codeberg
- moved from crowdin to weblate
- fix: cookie settings lost on tab change
- fix: profile settings lost, when going back in history
- fix: Not really a bug... #1075
- fix: Menu Dialog tweaks #1086
- updated translations


### v 9.11 "Traven"
- new: context menu in tab overview
- new: icons in menus
- new: delete entries from search
- new: http-warning before loading
- fix: layout in menus
- fix: menus
- fix: onReceivedHttpAuthRequest password showing #1069
- fix: download names #1071


### v 9.10 "Durruti"
- new: Clipboard record preference thanks to @Bnyro
- new: show url on link menus or when clicking menu title
- new: show urls in lists
- new: tab number in overview
- fix: refactored settings
- fix: layout issues on small devices #976
- fix: Password field for protected sites shows entries #1039
- fix: youtube redirects
- fix: onReceivedError
- fix: Settings refactor thanks to @Bnyro
- fix: OLED theme issues #1052


### v 9.6
- removed: redirection for Instagram
- fix: Redirect error from YouTube #991
- fix: loading images fit screen width
- fix: cookie manager, when going back in history
- fix: buttons not reachable on some dialogs
- fix: Auth-request dialog
- fix: download dialog
- fix: startsite is now the wiki #997
- fix: crash when open downloads, while default file manager not installed
- fix: issues with the file name when downloading thanks to @Bnyro
- fix: kill the app on pressing quit thanks to @Bnyro
- fix: theme settings
- fix: suppress DRM notice #1019
- fix: profile icons - red for attached profiles #999
- fix: Youtube videos in full screen mode cropped #1015
- fix: Twitter-to-Nitter redirector matches some unrelated urls #1022
- fix: & not escaped in search URL #959
- fix: lint issues
- new: circular progress - press to stop loading
- new: Swedish translation
- new: material dialogs in the preferences thanks to @Bnyro
- new: monochrome icon for Android 13+ thanks to @Bnyro
- new: custom redirects thanks to @Bnyro
- new: Custom error pages  thanks to @Bnyro


### v 9.5
- fix: can't open URL from outside, if it was closed before
- fix: Active button colors on OLED theme #1006
- new: hebrew translation


### v 9.4
- new: "post on website" in sharing menu
- new: Serbo-Croation translation
- new: Support app split screen #937
- fix: Restored functionality to proceed according to user selection #941
- updated: translations
- updated: build libraries
- removed: swipe to reload -> use gestures instead

### v 9.3.1
- fix: Half screen after orientation change #919
- fix: not all menu items accessible in landscape orientation
- fix: Download dialog does not decode multibyte file name #917
- fix: File name is not shown in the download prompt #916
- fix: Browser crashes when switching embedded video to full screen #925
- fix: Persistent swipe issues #924

### v 9.2
- fix: crash when sharing links #883
- fix: no password field on webserver authentication #891
- fix: some swiping issues #899 by Lakjdf
- fix: support for intent scheme URLs again #898 by Lakjdf
- fix: refactored code to make it much more readable #896 by T8RIN
- fix: share link
- fix: Home-screen links improvment #906
- fix: no password field on authentication dialog #891
- updated: layout and user experience
- updated: settings for night view
- updated: settings for gestures
- updated: settings for editing profiles #909
- updated translations: *Now 21 languages are fully supported!*

### v 9.1
- fix: removed unnecessary toasts in fastToggle
- fix: Browser crash on search with "%" #861
- fix: progressbar visible when searching
- fix: UI of FastToggleDialog #872
- fix: UI of edit/save as dialog #873
- fix: https warning #863
- fix: Images not displayed #881
- new: gesture to copy link to clipboard #868
- new: copy link to clipboard in context menu #878
- new: switched license to APGL
- new: redirect YouTube/Instagram/Twitter links
- new: show number of tabs in overview

### v 9.0
- fix: popup menu in Overview
- fix: searchbar not hiding in back pressing #852
- fix: edit favorites layout not scrolling #854
- fix: open external link shows Overview #858
- updated: translations

### v 8.9
- fix: some webpages show half the screen #817
- fix: Shortcut on the home screen #830
- fix: crash on first start #829 #820
- fix: Settings button does not open settings #823
- fix: cannot connect to some webservices #818
- fix: default user-agent is now received from installed webview
- fix: long press actions on toolbar buttons #866
- fix: https warning #863
- fix: Images not displayed #881
- updated: translations
- new: moved tab-dialog in overview
- new: permanent night mode (optional) #825
- new: help buttons in most important UI-elements

### v 8.8
- new: Wiki integrated in settings and menus
- new: notification when playing audio on background #800
- new: gestures
- fix: mailto and other intents not working
- fix: button "reload " is hidden #803
- fix: play audio in background #800

### v 8.7
- fix: dark theme in settings activities
- fix: night mode (webView)
- new: play audio on background
- new: Quick toggle to keep screen on
- new: gesture settings for long pressing
- new: open links in background
- new: swipe through menu
- updated: F-Droid (screenshots, description)
- updated: Privacy Policy
- updated: translations (17 languages supported!)
- improved: MaterialYou theme
- improved: search in history, bookmarks, ...
- improved: close open tabs dialog after making selection

### v 8.6
- skipped -

### v 8.5.1
- fix: camera issue #729
- fix: profile icon in toolbar #728
- fix: cookie settings when switching tab
- fix: stay at night mode, when openeing bookmark
- fix: close open tabs window after making selection #746
- new: restart and reload tabs
- new: Material You Design #726
- new: OLED dark theme Feature #742
- new: FOSS Browser in context menu of marked text #723
- new: remember night mode per site #669
- new: adding "copy link" button to download dialog #733
- new: remember night mode, when opening new tabs
- new: gesture: open start site
- new: keep screen on
- improved: set favicons (thanks to @woheller69)
- updated: translations
- updated: build libraries

### v 8.4
- new: camera use (thanks to @woheller69)
- new: microphone use
- new: webRTC support
- new: DRM protected video playback (thanks to @woheller69)
- new: support of encrypted backups (thanks to @woheller69)
- new: profiles instead of whitelists
- new: restore tabs on restart (optional)
- new: restore tabs when killed by system (optional) (thanks to @woheller69)
- fix: AutoComplete TextView (thanks to @woheller69)
- updated: setting screens

### v 8.3
- fix: Swipe to reload not working sometimes #654
- fix: Restoring bookmarks does not work properly #653
- fix: some force closes #642 #643
- fix: gestures and text-edit-scrolling collide #633
- fix: Toolbar hides, but reappears if page is refreshed #660
- fix: minor fixes and UIredirects webview
- new: save dektopMode, Javascript, domStorage also for history items
- removed: PlayStore support
- updated: translations

### v 8.2
- fix: chip desktop, javascript, DOM should not be visible in settings when editing filter names (thanks to @woheller69)
- fix: Sometimes Favicon is stored several times in database (thanks to @woheller69)
- fix: permission problems
- fix: download problems
- new: edit startSite and history items
- new: Privacy Enhancement #602 (thanks to @woheller69)
- new: choose preferred theme
- updated: Edit filter names (thanks to @woheller69)
- updated: backup preference

### v 8.1
- new: edit bookmark-url (thanks to @woheller69)
- new: Reload on swipeDown when at top of webpage (thanks to @woheller69)
- new: Added GlobalPrivacyControl (thanks to @woheller69)
- new: Remove device info from useragent, use prefixes like DuckDuckGo browser (thanks to @woheller69)
- new: favicons in bookmarklist (thanks to @woheller69)
- new: option to select blocked content
- updated: do not track (thanks to @woheller69)
- updated: translations
- fix: sorting of tabs in overview
- fix: DOM-storage description in settings
- fix: apply settings on back/forward navigation
- fix: Ad-Blocking also blocks "social" media
- fix: open link externally

### v 8.0
- new: toggle mobile/desktop mode (thanks to @woheller69)
- new: auto update of AdBlock-hosts (thanks to @woheller69)
- new: save desktop mode/javascript/DOM content settings in bookmarks (thanks to @woheller69)
- new: show colored bookmark icon when editing bookmark category (thanks to @woheller69)
- new: Use settings stored in bookmark when a bookmark is found in search (thanks to @woheller69)
- new: Show icon source of item (start page, bookmarks, history) in search (thanks to @woheller69)
- new: save form data/use autofill service in settings
- fix: correct icon colors when importing bookmarks (thanks to @woheller69)
- fix: content hidden by toolbar
- fix: opening new tabs on older Android versions
- fix: Dark mode not applied to all tabs
- fix: toolbar input handling

### v 7.5
- new: right to left layout support (thanks to @M3hdiRostami)
- new: Farsi (Persian) language support (thanks to @M3hdiRostami)
- updated: AdBlock
- updated: AppIcon
- fix: New bookmarks are not shown in red-filtered bookmark view
- fix: Application crash when trying to watch video in full screen mode
- fix: showing keyboard when leaving fullscreen mode
- fix: interaction with url in address line
- fix: tab handling
- fix: toolbar input handling
- even more fixes

### v 7.4
- removed: app shortcuts
- fix: keyboard not showing on large input fields
- fix: app crash when displaying overview on start
- fix: app crash when showing some dialogs
- fix: clearing data
- fix: open fallback urls
- fix: crashing on fullscreen on older Android versions

### v 7.3
- updated: translations (now 16 languages are supported!)
- updated: build and theme libraries
- updated: AdBlock-hosts
- updated: Material Components
- updated: settings activities
- updated: tab handling
- removed: multi-window support
- removed: theme settings
- new: support of: open target="_blank"
- fix: Opting out of metrics collection
- fix: export bookmarks
- fix: tab handling
- fix: apply javaScript, cookies and DOM content whitelists
- fix: switching between system day/night mode
- fix: dialogs in landscape
- fix: alphabetical sorting of overview entries
- fix: search in toolbar
- fix: many other small fixes

### v 7.2
- fix: zooming on websites
- fix: opening new tab when restarting
- new: close search on site by back pressing

### v 7.1
- removed: ability to save password within bookmark
- updated: AdBlock hosts
- updated: translations
- updated: bookmark management (sorry for removing password saving)
- updated: overview, menus and dialogs
- fix: searx.me search
- new: hide overflow button
- new: whitelist for DOM content
- new: backup/restore bookmarks as html
- many stability improvements -> removed ca. 5000 lines of unnecessary code!)

### v 7.0
- new: F-Droid description
- updated: many translations (BIG THANKS TO ALL CROWDIN translators)
- fix: leave video fullscreen with back key
- fix: create windows inside webView

### v 6.9
- fix: custom search engine
- new: Italian translation
- new: custom user agent
- new: removed storage permission for Android 10+
- updated: some translations
- updated: Android libraries

### v 6.8
- new: search in all overview entries
- new: Blank target href open a new tab
- new: removed device model and build number from user agent string
- new: follow system theme
- new: Amoled theme
- new: moving to AndroidX libraries
- new: favorite settings
- updated: handling of ssl-errors
- updated: adblock hosts
- updated: themes
- updated: Turkish translation
- updated: Czech translation
- updated: Brazilian translation
- updated: Russian translation
- updated: settings (especially filter settings)
- updated: saving locations of backups and screenshots
- removed: tinting of toolbar
- removed: open links in background

### v 6.7
- new: backup and restore settings
- fix: saving on startsite
- fix: toolbar not showing title
- fix: making backups

### v 6.6
- fix: storage permission problems
- fix: location permission problems
- fix: lint issues
- fix: sort startsite by time
- fix: favorite site not loading on start
- fix: inputs not loading
- new: add to startsite from link context menu

### v 6.5
- new: more font sizes (thanks @pbui)
- new: ECOSIA search engine
- new: open dialogs always expanded
- fix: exclude notifications from recent apps
- fix: some popup dialogs not opening
- fix: hide nav button

### v 6.4
- new: FAQ site (thanks @HarryHeights)
- new: long click on tab preview to close
- new: add shortcuts to home screen (long press overview entry)
- new: dynamic shortcuts: two last opened websites
- updated: help dialog
- updated: Portuguese translation (thanks @smarquespt)
- updated: French translation (thanks @franco27)
- updated: adblock domain list
- improved: Overview
- improved: rendering speed
- fix: file upload
- fix: input box not showing on some devices
- fix: hide navigation bar in fullscreen mode
- fix: can't go back in history in some cases

### v 6.3
- new: Add Cookies support for download function
- new: option to enable Save-Data header (thanks @SkewedZeppelin)
- new: set blank start site
- new: fast scroll on long lists
- new: show/hide tab preview
- new: animations when showing/hiding views
- new: Qwant search engine (thanks @Tobiplayer3)
- new: option to open new tab instead of exiting app
- new: Ukrainian translation (thanks @Roman Babiy)
- new: Turkish translation (thanks @ali-demirtas)
- fix: UI and minor issues
- updated: long press menu on websites
- updated: Help dialog
- updated: Polish translation (thanks @gh-pmjm)
- updated: Dutch translation (thanks @Vistaus)
- updated: Taiwan Trad. Chinese translation (thanks @elmru)
- updated: Portuguese translation (thanks @smarquespt)
- updated: Overview dialog
- updated: FastToggle dialog

### v 6.2
- new: advanced gesture settings
- new: show overview on start
- fix: light settings theme

### v 6.1
- new: overview instead of startPage
- new: order and filter bookmarks
- new: edit url of bookmark
- new: open favorite website on start
- new: Code of conduct site (thanks @HarryHeights)
- new: Privacy declaration (thanks @HarryHeights)
- updated: adBlock hosts list
- updated: help dialog
- updated: French translation (thanks @Hellohat)
- updated: Portuguese translation (thanks @smarquespt)
- removed: loginData (use bookmarks instead)
- fix: upload files
- fix: not clearing indexed databases on exit
- many more fixes and improvements

### v 6.0
- updated: adBlock hosts list
- updated: Polish translation (thanks @gh-pmjm)
- fix: problems with characters like ä, ü, ö
- new: Taiwan Trad. Chinese translation (thanks @elmru)
- new: Italian translation (thanks @EnricoMonese)
- new: Portuguese translation (thanks @Sérgio Marques)
- many more fixes and improvements (thanks @BO41)

### v 5.9
- updated: Chinese translation (thanks @YC L)
- updated: Russian translation (thanks @Vladimir Kosolapov)
- new: Polish translation (thanks @gh-pmjm)
- new: Dutch translation (thanks @gHeimen Stoffels)
- new: adaptive icon

### v 5.8
- new: "do not track" header
- new: + button in tab preview
- new: save websites as PDF
- new: show link in context menu
- fix: not applying cookie whitelist when switching tabs
- fix: scrolling issue
- fix: screen rotation issues
- updated: UI + dialogs
- updated: Spanish translation (thanks to @Herman Nuñez)
- updated: Chinese translation (thanks to @smallg0at)

### v 5.7
- new: delete indexed databases and local web storage
- new: Spanish translation (thanks to Herman Nunez)
- new: confirmation dialog before making backup
- new: delete separate lists (Startpage, history, ...)
- new: show unsecured connections and try reloading secure
- new: search engines (Startpage DE, Searx)
- new: notification when download or screenshot complete
- new: block DOM content
- improved Chinese translation (thanks: lishoujun)
- removed: Snackbar (replaced with toasts)
- removed: request desktop site
- removed: build in file manager
- fix: some strings (thanks: gr1sh)
- fix: some urls opening search results

### v 5.6
- new: increase font size
- new: close all websites from notification
- new: desktop mode in "Fast toggle dialog"
- improved: link sharing
- improved: light theme
- improved: UI
- fix: some force closes

### v 5.5
- new: option to disable confirmation dialogs on exit (thanks: element54)
- improved: light theme
- improved: startpage
- fix: dark background on some websites
- fix: ok button on "Fast toggle dialog"
- fix: toolbar not showing title
- fix: back handling

### v 5.4
- new: new app name "F|L|OSS Browser"
- new: dark and light theme
- new: startpage with all contents
- new: full support for cookie whitelist
- new: more options for fullscreen browsing
- new: more options visibility Navigation Button
- new: night mode only while browsing
- updated: help dialog
- removed: different light themes
- fix: double entries in history
- fix: toolbar does not work on start
- fix: keyboard issues in some cases (thanks: element54)

### v 5.3.1
- new: initial support for cookie whitelist (fast toggle)

### v 5.3
- improved: tab opening/removing
- improved: back handling
- improved: enter/exit fullscreen
- other improvements and bug fixes

### v 5.2
- new: decide which tab to open on start
- new: backup complete data and settings
- new: double tap "Navigation Button" to hide
- new: option to disable history (settings and fast toggle)
- new: option to hide/show "Navigation Button"
- new: change position of "Navigation Button"
- new: moved menus in bottom dialog
- new: Baidu as default search engine for Chinese users
- new: Indonesian translation (thanks: Secangkir Kopi)
- changed: backups on root of sd-card
- updated: Help dialog (ENG, DE)
- improved: applying settings from fast toggle dialog
- improved: Chinese translation (thanks: lishoujun)

### v 5.1
- new: Chinese translation (thanks: lishoujun)
- new: close current tab in menu
- new: share text to browser
- improved: hide/show toolbar
- fix: night mode (now in UI settings)
- fix: force close when clicking direct download link
- fix: screenshot, when started via holder service
- fix: some strings
- fix: possible force close on Android > Nougat

### v 5.0

With this update "Ninja Browser" is used as base for "Browser". The 
concept remains the old: simple but powerful with a nice looking user interface. 
Main advantage of this step are a better implementation of tabs. Now you can open 
as many tabs as you wish. Also you have a new startpage. Please read the new "Help dialog" 
for more information.
    
- full oreo support


### v 4.5
- new: Chinese translation (Thanks: Jumping Yang)
- new: keyboard go button actions
- new: settings icon in toolbar (click for toggle/long click for main settings)
- new: possibility to temporally hide navigation arrows
- new: auto fill (authentication dialog)
- improved: tab behavior
- fix: load default settings on start
- fix: force close when sharing screenshot
- fix: not showing website title

### v 4.4
- fix: save screenshot
- fix: saving entries containing an apostrophe
- fix: option to restart app to apply swipe gesture
- new: http basic authentication
- improved: behavior of tab preview/behavior

### v 4.3
- fix: title of setting subpages
- fix: crash when selected list at startup
- new: swipe to switch tabs optional (settings/popup settings)

### v 4.2
- removed: backup/restore of passStorage
- fix: hiding keyboard after searching in lists
- fix: history - scroll to latest entry
- improved: code and UI
- new: swipe to switch tabs
- new: settings on different subpages
- new: auto orientation (sensor/device)
- new: offer restart to apply some settings
- new: theme support

### v 4.1
- removed: offline support (use screenshot for saving)
- removed: unnecessary permissions
- fix: reset menu after editing file name
- fix: overwriting of files while renaming
- fix: several code improvements
- fix: delete passStorage
- improved: layout close button
- improved: bundled Notifications
- new: Google encrypted search (override AMP-links)
- new: advanced backup/restore data

### v 4.0
- removed: donation link on Github
- removed: video thumbnail
- improved: file manager (icons, image preview)
- new: scroll to end of website arrow

### v 3.9
- removed: notification actions (to buggy)
- removed: direct opening a donation website&lt;br>
- fix: notification behavior (open multiple links)
- fix: force close on toolbar click
- fix: website partially not visible
- improved: refresh website (long click "history icon")
- improved: help dialog (menu -> more -> Help)
- new: switched to Picasso library to load images
- new: homepage setup (bookmark list)
- new: open links directly (optional)
- new: moved from activities to fragments
- new: bookmarks, readLater, history as startpage (settings)

### v 3.8
- removed: swipe to refresh
- fix: some random force closes
- fix: notifications on Lollipop/Marshmallow devices
- fix: do not scroll to list end after editing entry
- improved: taking screenshots
- improved: long click menu in lists
- new: menu -> reload website
- new: Russian translation
- new: show current url when starting editing mode in toolbar
- new: close tabs from tab preview
- new: set empty page as favorite

### v 3.7
- new: changelog after update
- new: long click on toolbar opens tab overview
- new: click on toolbar opens search/enter URL
- fix: toolbar swipe (lists)
- fix: hide navigation buttons
- fix: contributor title
- fix: always loading homepage when closing settings
- fix: cancel search on site
- improved: cookie settings
- improved: open links in new tab

### v 3.6
- new: always hide statusbar on fullscreen videos
- new: five tabs (@CGSLURP LLC)
- new: toolbar and button animations
- new: toolbar gestures in lists
- new: save link destination
- fix: download pictures
- fix: startpage on javascript whitelist
- improved: portrait layout
- improved: Adblock integration
- improved: Desktop site request
- improved: sorting of lists
- improved: code simplified
- improved: UI (colors, strings, layouts)
- updated: help dialog, introscreen

### v 3.5
- fix: keyboard issue
- new: request desktop site (@CGSLURP LLC)
- new: adblocker (@CGSLURP LLC)

### v 3.4
- improved: sorting of list entries
- fix: keyboard not open (landscape)

### v 3.3
- removed: swipe to navigate
- improved:opening urls
- fixed: pin screen not showing

### v 3.1 - v 3.2
- fix: possible crash an Android < Lollipop when opening settings
- fix: search from toolbar
- fix: crash when website title contains apostrophe

### v 3.0
- fix: F-Droid build error
- lint: disable missing translation
- updated: support libraries

### v 2.8 - 2.9
- new: video thumbnails
- fix: open links from readLater list (opened from notifications)
- fix: error message on start

### v 2.7
- fix: directory up icon
- fix: saving all entries lowercase

### v 2.4 - 2.6
- new: new file manager
- new: sub menus
- removed: toolbar long click
- improved: toolbar in lists
- improved: removed unnecessary code
- fix: sort readLater by date
- fix: sort by title (needs uppercase on first letter in the entries)
- fix: double entries in history
- fix: app icon color
- fix: open shortcuts
- fix: open links from notification
- fix: delete data on exit

### v 2.3
- new: search in lists
- new: no duplicate bookmarks
- improved: UI (lists, colors, buttons)
- improved: database model

### v 2.2
- new: about screen
- new: intro screen
- fixed: save website (passStorage): set title
- fixed: notification not dismissed

### v 2.1
- new: bundled notifications

### v 2.0
- improved: encryption of passStore databases
- fixed: F-Droid build error

### v 1.9
- new: encryption of passStore databases

### v 1.8.1
- fixed: f-droid build failure

### v 1.8
- improved: pin screen layout
- improved: sort dialog behavior
- improved: wsitched to xml icons
- removed: bookmark screen
- new: second tab
- new: set bookmark as start site (long click)
- new: cancel button on some dialogs
- new: cancel dialog when clearing whitelist
- fixed: force close (links without "/")

### v 1.7:
- fixed: F-Droid build error

### v 1.6:
- fixed: some strings
- improved: backup and restore databases

### v 1.0+ (first public release):
- improved: readLater notification (v1.1)
- improved: search results in German
- improved: settings screen
- improved: license dialog
- improved: minor ui/code tweaks
- new: websearch (from shared text)
- new: donate (settings)
- new: changelog (settings) (v1.4)
- new: sort lists by title and date (v1.5)
- fixed: navigation settings (v1.2)
- fixed: screenshot (v1.3)