
David Vignoni's Nuvola icon set
-------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/nuvolaicons-javafx](http://artifacts.griffon-framework.org/plugin/nuvolaicons-javafx)


Provides a shortcut for adding icons based on David Vignoni's [Nuvola icon set][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*         | *Node*                        | *Property* | *Type* | *Default*   | *Bindable* |
| -------------- | ----------------------------- | ---------- | ------ | ----------- | ---------- |
| nuvolaIcon     | `javax.scene.image.Image`     | icon       | String |             | no         |
|                |                               | size       | int    | `16`        | no         |
|                |                               | category   | String | `actions`   | no         |
| nuvolaIconView | `javax.scene.image.ImageView` | icon       | String |             | no         |
|                |                               | size       | int    | `16`        | no         |
|                |                               | category   | String | `actions`   | no         |

Valid values for `icon` can be obtained by running **nuvola-icon-selector** and inspecting the tooltip of the chosen icon.

Valid values for `size` property are: 16, 22, 32, 48, 64, 128.

Valid values for `category` property are: actions, apps, devices, filesystems, mimetypes.

Scripts
-------

 * **nuvola-icon-selector** - launches a window that displays all available icons (Hover an icon to see the icon name)

[1]: http://www.icon-king.com/projects/nuvola/

