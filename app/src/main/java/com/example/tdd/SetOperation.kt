package com.example.tdd

class SetOperation : SetImpl{
    private var mySet = mutableSetOf<Int>()
    
    override fun getSize(): Int {
        return mySet.size
    }

    override fun getCount(): Int {
        return mySet.count()
    }

    override fun addItem(i:Int) {
        mySet.add(i)
    }
}