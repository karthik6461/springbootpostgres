package org.jug.algeria.controller;

import org.jug.algeria.domain.*;
import org.jug.algeria.repository.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    @Inject
    UserRepository userRepository;
    
    @Inject
    AssetRepository assetRepository;
    
    @Inject
    SegmentRepository segmentRepository;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello there !";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public AppTest create(@PathVariable String username) {
        return userRepository.save(new AppTest(username));
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AppTest> findAll() {
        final List<AppTest> resultList = new ArrayList<>();
        final Iterable<AppTest> all = userRepository.findAll();
        all.forEach(new Consumer<AppTest>() {
            @Override
            public void accept(AppTest appUser) {
                resultList.add(appUser);
            }
        });
        return resultList;
    }
    
    @RequestMapping(value = "/asset", method = RequestMethod.POST)
    public Asset createAsset(@RequestBody Asset asset) {
    	return assetRepository.save(asset);
    }
    /*@RequestMapping(value = "/asset/{id}/{accessid}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Asset createAsset(@PathVariable String id,@PathVariable String accessid) {
        return assetRepository.save(new Asset(id,accessid));
    }*/

    @RequestMapping(value = "/asset", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Asset> findAllAssets() {
        final List<Asset> resultList = new ArrayList<>();
        final Iterable<Asset> all = assetRepository.findAll();
        all.forEach(new Consumer<Asset>() {
            @Override
            public void accept(Asset asset) {
                resultList.add(asset);
            }
        });
        return resultList;
    }
    
    
    @RequestMapping(value = "/segment/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Segment createSegment(@PathVariable String id) {
        return segmentRepository.save(new Segment(id));
    }

    @RequestMapping(value = "/segment", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Segment> findAllSegments() {
        final List<Segment> resultList = new ArrayList<>();
        final Iterable<Segment> all = segmentRepository.findAll();
        all.forEach(new Consumer<Segment>() {
            @Override
            public void accept(Segment segment) {
                resultList.add(segment);
            }
        });
        return resultList;
    }

}
