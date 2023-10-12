package com.lfg.xlapisdk.service.impi;

import com.lfg.xlapisdk.client.QiApiClient;
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
 * @Author: QiMu
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
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(QiApiClient qiApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(qiApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(QiApiClient qiApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(QiApiClient qiApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(QiApiClient qiApiClient, HoroscopeRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(QiApiClient qiApiClient, IpInfoRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(QiApiClient qiApiClient, WeatherRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
