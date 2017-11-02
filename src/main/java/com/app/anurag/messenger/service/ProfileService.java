package com.app.anurag.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.app.anurag.messenger.database.DatabaseClass;
import com.app.anurag.messenger.model.Profile;

public class ProfileService {
	
	public ProfileService(){
		profiles.put("Anurag", new Profile(1, "Anurag", "Anurag", "Gupta"));
		profiles.put("Gopal", new Profile(2 , "Gopal", "Venu", "Gupta"));
	}

	private static Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty() ){
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
	
	
}
