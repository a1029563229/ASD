package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class FileSplitter {
    private int size = 0;
    private List<Progress> progressList = new ArrayList<Progress>();

    public FileSplitter(int s) {
        size = s;
    }

    public void split() {
        FileSplitter splitter = this;
        final int[] schedule = {0};
        final Timer[] timerTask = {new Timer()};
        timerTask[0].schedule(new TimerTask() {
            @Override
            public void run() {
                schedule[0]++;
                splitter.onProgress(schedule[0] / (float)splitter.size);
                if (schedule[0] == size) {
                    timerTask[0].cancel();
                    timerTask[0] = null;
                }
            }
        }, 0, 1000);
    }

    public void addProgress(Progress progress) {
        this.progressList.add(progress);
    }

    private void onProgress(float schedule) {
        for (Progress progressIns: progressList) {
            progressIns.onProgress(schedule);
        }
    }
}
