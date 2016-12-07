import com.automation.remarks.junit.VideoRule;
import com.automation.remarks.video.annotations.Video;
import org.junit.Rule;
import org.junit.Test;

public class VideoTest {
    @Rule
    public VideoRule videoRule = new VideoRule();

    @Test
    @Video
    public void failTest(){

    }
}
