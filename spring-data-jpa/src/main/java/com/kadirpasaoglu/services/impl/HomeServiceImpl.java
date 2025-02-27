package com.kadirpasaoglu.services.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadirpasaoglu.dto.DtoHome;
import com.kadirpasaoglu.dto.DtoRoom;
import com.kadirpasaoglu.entities.Home;
import com.kadirpasaoglu.entities.Room;
import com.kadirpasaoglu.repository.IHomeRepository;
import com.kadirpasaoglu.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    IHomeRepository homeRepository;

    @Override
    public List<DtoHome> getAllHomes() {
        List<DtoHome> dtoHomeList= new ArrayList<>();
        List<Home> homeList= homeRepository.findAll();

        for(Home home : homeList){
            DtoHome dto= new DtoHome();
            BeanUtils.copyProperties(home, dto);
            dtoHomeList.add(dto);
        }
        return dtoHomeList;
        
    }
    
    @Override
    public DtoHome getHomeByID(Long id) {
        DtoHome dtoHome=new DtoHome();
        Optional<Home> optional= homeRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Home dbhome = optional.get();
        List<Room> dbRooms =optional.get().getRooms();
        
        dbhome.setRooms(dbRooms);
        
        BeanUtils.copyProperties(dbhome, dtoHome);
        if(dbRooms!=null && !dbRooms.isEmpty()){
            for(Room room :dbRooms){
                DtoRoom dtoRoom =new DtoRoom();
                BeanUtils.copyProperties(room, dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }
        }
        return dtoHome;

    }
     /*   
    
    @Override
        public DtoHome getHomeByID(Long id) {               temiz kod
         return homeRepository.findById(id)
         .map(home -> new DtoHome(
            home.getId(),
            home.getPrice(),
            home.getRooms().stream()
                .map(room -> new DtoRoom(room.getId(), room.getName()))
                .toList()
        ))
        .orElse(null);
        }
    */
}
