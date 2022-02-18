package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Weather;

@Api(value = "WeatherController", description = "REST Apis related to weather Entity!!!!")
@RestController
public class WeatherController {

	static List<Weather> weatherList = new ArrayList<Weather>();
	static{
		weatherList.add(new Weather("Nice","France","06000",18));
		weatherList.add(new Weather("Monaco","France","98000",19));
		weatherList.add(new Weather("Cannes","France","06400",17));
		weatherList.add(new Weather("Birmingham","Angleterre","75433",3));
		weatherList.add(new Weather("Bibao","Espagne","09800",16));
		weatherList.add(new Weather("Faro","Portugal","55880",23));
	}
	@RequestMapping("/")
    public List<Weather> getWeathers()
    {
		return weatherList;
    }
	@ApiOperation(value = "Get list of weather by pays ", response = Iterable.class, tags = "TempByPays")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"),
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(value = "/getTempByPays/{pays}")
	public List<Weather> TempByPays(@PathVariable(value = "pays") String pays) {
		return weatherList.stream().filter(x -> x.getPays().equalsIgnoreCase(pays)).collect(Collectors.toList());
	}

	@RequestMapping(value = "/getTempByVille/{ville}")
	public List<Weather> TempByVille(@PathVariable(value = "ville") String ville) {
		return weatherList.stream().filter(x -> x.getVille().equalsIgnoreCase(ville)).collect(Collectors.toList());
	}

	@RequestMapping(value = "/getTempByCodePostal/{codePostal}")
	public List<Weather> TempByCodePostal(@PathVariable(value = "codePostal") String codePostal) {
		return weatherList.stream().filter(x -> x.getCodePostal().equalsIgnoreCase(codePostal)).collect(Collectors.toList());
	}

}
