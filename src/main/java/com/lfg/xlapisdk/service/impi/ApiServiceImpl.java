package com.lfg.xlapisdk.service.impi;

import com.lfg.xlapisdk.client.XlApiClient;
import com.lfg.xlapisdk.exception.ApiException;
import com.lfg.xlapisdk.model.request.*;
import com.lfg.xlapisdk.model.response.LoveResponse;
import com.lfg.xlapisdk.model.response.PoisonousChickenSoupResponse;
import com.lfg.xlapisdk.model.response.RandomWallpaperResponse;
import com.lfg.xlapisdk.model.response.ResultResponse;
import com.lfg.xlapisdk.service.ApiService;
import com.lfg.xlapisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: XiaoLiu
 * @Date: 2023年09月17日 08:42
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(XlApiClient xlApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(xlApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(XlApiClient xlApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(xlApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(XlApiClient xlApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(xlApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(XlApiClient xlApiClient, HoroscopeRequest request) throws ApiException {
        return request(xlApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(XlApiClient xlApiClient, IpInfoRequest request) throws ApiException {
        return request(xlApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(XlApiClient xlApiClient, WeatherRequest request) throws ApiException {
        return request(xlApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
