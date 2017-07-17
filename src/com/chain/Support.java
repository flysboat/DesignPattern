package com.chain;

/**
 * Created by lifz on 2017/07/08.
 */
public abstract class Support {
    private String name;
    private Support next;   // たらい回しの先

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // トラブル解決の手順
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }

    }

    // 文字列表現
    public String toString() {
        return "[" + name + "]";
    }

    // 解決用メッソド
    protected abstract boolean resolve(Trouble trouble);

    // 解決
    protected void done(Trouble trouble) {
        System.out.println(trouble + "is resolved by " + this + ".");
    }

    // 未解決
    protected  void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
