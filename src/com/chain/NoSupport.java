package com.chain;

/**
 * Created by lifz on 2017/07/08.
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    // 解決用メソッド
    protected boolean resolve(Trouble trouble) {

        // 何も処理しない
        return false;
    }
}
