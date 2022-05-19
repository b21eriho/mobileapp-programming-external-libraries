# Report

Firstly the internet was searched to find an interesting external library. The library "StyleableToast" was chosen (available at https://github.com/Muddz/StyleableToast)

The given gradle-line from the github page was added to the projects build.gradle.

Styles were created in the project-values xml-file styles. Example below.

Lastly a button was added to the mainactivity and an onclicklistener that creates two toasts according to the tutorial in the libraries
github-page.

```
<style name="CustomRedToast">
    <item name="stTextBold">true</item>
    <item name="stTextSize">25sp</item>
    <item name="stColorBackground">#FF0000</item>
    <item name="stTextColor">#000000</item>
</style>
```
![](Screenshot.png)
