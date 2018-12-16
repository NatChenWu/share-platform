package com.example.shareplatform;

import com.example.shareplatform.api.common.config.MpGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class SharePlatformApplicationTests {

    @Test
    public void contextLoads() {
        MpGenerator gse = new MpGenerator();
        //要给那些表生成
        gse.generateByTables("user");

    }

}

