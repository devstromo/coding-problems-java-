package com.devstromo.medium.p901

class StockSpannerKt() {
    private var top: NodeKt? = null

    fun next(price: Int): Int {
        val nn: NodeKt?
        var span = 1
        while (top != null && top!!.price <= price) {
            span += top!!.span
            top = top!!.next
        }
        nn = NodeKt(price, span)
        nn.next = top
        top = nn
        return top!!.span
    }


    internal class NodeKt(var price: Int, var span: Int) {
        var next: NodeKt? = null
    }

}