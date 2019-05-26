package com.pagepetty.notesnav

import android.media.Image
import android.nfc.tech.NfcBarcode

class Item {
    var itemID: Int? = null
    var itemName: String? = null
    var itemImage: Image? = null
    var itemBarcode: NfcBarcode? = null
    var itemDes: String? = null

    constructor(
        itemID: Int,
        itemName: String,
        itemImage: Image,
        itemBarcode: NfcBarcode,
        itemDes: String
    ) {
        this.itemID = itemID
        this.itemName = itemName
        this.itemImage = itemImage
        this.itemBarcode = itemBarcode
        this.itemDes = itemDes
    }
}