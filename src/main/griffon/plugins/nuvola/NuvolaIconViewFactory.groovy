/*
 * griffon-nuvolaicons-javafx: Nuvola icons Griffon plugin for Javafx
 * Copyright 2012 and beyond, Andres Almiray
 *
 * griffon-nuvola is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package griffon.plugins.nuvola

import groovyx.javafx.factory.ImageViewFactory

/**
 * @author Andres Almiray
 */
class NuvolaIconViewFactory extends ImageViewFactory {
    private final NuvolaIconFactory iconFactory = new NuvolaIconFactory()

    Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) {
        def image = iconFactory.newInstance(builder, name, value, attributes)
        super.newInstance(builder, name, image, attributes)
    }
}
