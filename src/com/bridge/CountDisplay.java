package com.bridge;

/**
 * Created by lifz on 2017/07/15.
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for(int i=0; i < times; i++) {
            print();
        }
        close();
    }
}
