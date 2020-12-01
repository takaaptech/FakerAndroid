package faker.android.decoder.pipeline;

import faker.android.decoder.smali.DexToSmaliException;

public abstract class Transform {
    protected Apk apk;
    protected AndroidProject androidProject;
    public Transform(Apk apk, AndroidProject androidProject){
        this.apk = apk;
        this.androidProject = androidProject;
    }
    public abstract void transform(TransformInvocation transformInvocation);
}
