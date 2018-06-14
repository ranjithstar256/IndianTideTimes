package com.droidmanifester.indiantidetimes;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng haladia = new LatLng(22.011,88.074);
        mMap.addMarker(new MarkerOptions().position(haladia).title("Haladia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(haladia));

        LatLng sagarisland = new LatLng(21.613,88.049);
        mMap.addMarker(new MarkerOptions().position(sagarisland).title("Sagar Island"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sagarisland));

        LatLng digha = new LatLng(21.608,87.516);
        mMap.addMarker(new MarkerOptions().position(digha).title("Digha"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(digha));

        LatLng chandipur = new LatLng(21.374,86.961);
        mMap.addMarker(new MarkerOptions().position(chandipur).title("Chandipur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chandipur));

        LatLng dhamara = new LatLng(20.863,87.005);
        mMap.addMarker(new MarkerOptions().position(dhamara).title("Dhamara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dhamara));

        LatLng paradeep = new LatLng(20.238,86.620);
        mMap.addMarker(new MarkerOptions().position(paradeep ).title("Paradeep"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paradeep));

                LatLng konark = new LatLng(19.944,86.372);
        mMap.addMarker(new MarkerOptions().position(konark).title("Konark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(konark));

        LatLng puri = new LatLng(19.794,85.825);
        mMap.addMarker(new MarkerOptions().position(puri).title("Puri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puri));

        LatLng chilika = new LatLng(19.648,85.488);
        mMap.addMarker(new MarkerOptions().position(chilika).title("Chilika"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chilika));

        LatLng gopalpur = new LatLng( 19.252,84.913);
        mMap.addMarker(new MarkerOptions().position(gopalpur).title("Gopalpur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gopalpur));

        LatLng palasa= new LatLng(18.743,84.547);
        mMap.addMarker(new MarkerOptions().position(palasa).title("Palasa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(palasa));

        LatLng srikakulam= new LatLng(18.262,84.040);
        mMap.addMarker(new MarkerOptions().position(srikakulam).title("Srikakulam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(srikakulam));

        LatLng vishakhapatnam= new LatLng(17.658,83.280);
        mMap.addMarker(new MarkerOptions().position(vishakhapatnam).title("Vishakhapatnam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vishakhapatnam));

        LatLng kakinada= new LatLng(17.131,82.396);
        mMap.addMarker(new MarkerOptions().position(kakinada).title("Kakinada"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kakinada));

        LatLng machilipattanam= new LatLng(16.107,81.190);
        mMap.addMarker(new MarkerOptions().position(machilipattanam).title("Machilipattanam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(machilipattanam));

        LatLng ongole= new LatLng(15.447,80.192);
        mMap.addMarker(new MarkerOptions().position(ongole).title("Ongole"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ongole));

        LatLng nallore= new LatLng(14.400,80.173);
        mMap.addMarker(new MarkerOptions().position(nallore).title("Nallore"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nallore));

        LatLng pulicat= new LatLng(13.425,80.331);
        mMap.addMarker(new MarkerOptions().position(pulicat).title("Pulicat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pulicat));

        LatLng chennai = new LatLng(12.925,80.259);
        mMap.addMarker(new MarkerOptions().position(chennai).title("Chennai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chennai));

        LatLng mahabalipuram= new LatLng(12.639,80.204);
        mMap.addMarker(new MarkerOptions().position(mahabalipuram).title("Mahabalipuram"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mahabalipuram));

        LatLng kadalur= new LatLng(12.375,80.090);
        mMap.addMarker(new MarkerOptions().position(kadalur).title("Kadalur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kadalur));

        LatLng puduchery= new LatLng(11.748,79.789);
        mMap.addMarker(new MarkerOptions().position(puduchery).title("Puduchery"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(puduchery));

        LatLng pompuhar =  new LatLng(11.158,79.857);
        mMap.addMarker(new MarkerOptions().position(pompuhar).title("Pompuhar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pompuhar));

        LatLng nagapattinam= new LatLng(10.736,79.852);
        mMap.addMarker(new MarkerOptions().position(nagapattinam).title("Nagapattinam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nagapattinam));

        LatLng vedaranyam= new LatLng(10.302,79.881);
        mMap.addMarker(new MarkerOptions().position(vedaranyam).title("Vedaranyam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vedaranyam));

        LatLng kottaippattinam= new LatLng(9.984,79.205);
        mMap.addMarker(new MarkerOptions().position(kottaippattinam).title("Kottaippattinam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kottaippattinam));

        LatLng keelakarai= new LatLng(9.229,78.795);
        mMap.addMarker(new MarkerOptions().position(keelakarai).title("Keelakarai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(keelakarai));

        LatLng rameswaran= new LatLng(9.193,79.390);
        mMap.addMarker(new MarkerOptions().position(rameswaran).title("Rameswaran"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rameswaran));

        LatLng vembar= new LatLng(9.058,78.377);
        mMap.addMarker(new MarkerOptions().position(vembar).title("Vembar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vembar));

        LatLng thoothukodi= new LatLng(8.745,78.200);
        mMap.addMarker(new MarkerOptions().position(thoothukodi).title("Thoothukodi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(thoothukodi));

        LatLng manshad= new LatLng(8.372,78.069);
        mMap.addMarker(new MarkerOptions().position(manshad).title("Manshad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(manshad));

        LatLng kanyakumari= new LatLng(8.077	,77.550);
        mMap.addMarker(new MarkerOptions().position(kanyakumari).title("Kanyakumari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kanyakumari));

        LatLng muttom= new LatLng(8.120,77.317);
        mMap.addMarker(new MarkerOptions().position(muttom).title("Muttom"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(muttom));

        LatLng port_blair= new LatLng(11.593,92.834);
        mMap.addMarker(new MarkerOptions().position(port_blair).title("Port Blair"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(port_blair));

        LatLng vizhinjam= new LatLng(8.374,76.988);
        mMap.addMarker(new MarkerOptions().position(vizhinjam).title("Vizhinjam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vizhinjam));

        LatLng perumathura= new LatLng(8.622	,76.792);
        mMap.addMarker(new MarkerOptions().position(perumathura).title("Perumathura"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(perumathura));

        LatLng kollam= new LatLng(8.839,76.572);
        mMap.addMarker(new MarkerOptions().position(kollam).title("Kollam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kollam));

        LatLng alappad= new LatLng(9.124,76.466);
        mMap.addMarker(new MarkerOptions().position(alappad).title("Alappad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alappad));

        LatLng alappuza= new LatLng(9.490,76.317);
        mMap.addMarker(new MarkerOptions().position(alappuza).title("Alappuza"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alappuza));

        LatLng kochi= new LatLng(9.964,76.233);
        mMap.addMarker(new MarkerOptions().position(kochi).title("Kochi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kochi));

        LatLng ponnani= new LatLng(10.783,75.911);
        mMap.addMarker(new MarkerOptions().position(ponnani).title("Ponnani"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ponnani));

        LatLng kojhikote= new LatLng(11.224,75.777);
        mMap.addMarker(new MarkerOptions().position(kojhikote).title("Kojhikote"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kojhikote));

        LatLng koyilandy= new LatLng(11.430,75.692);
        mMap.addMarker(new MarkerOptions().position(koyilandy).title("Koyilandy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(koyilandy));

        LatLng mahe= new LatLng(11.703,75.526);
        mMap.addMarker(new MarkerOptions().position(mahe).title("Mahe"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mahe));

        LatLng kannur= new LatLng(11.852,75.371);
        mMap.addMarker(new MarkerOptions().position(kannur).title("Kannur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kannur));

        LatLng ettikulam= new LatLng(12.016,75.230);
        mMap.addMarker(new MarkerOptions().position(ettikulam).title("Ettikulam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ettikulam));

        LatLng kanhangar= new LatLng(12.306,75.070);
        mMap.addMarker(new MarkerOptions().position(kanhangar).title("Kanhangar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kanhangar));

        LatLng mangalore= new LatLng(12.924,74.804);
        mMap.addMarker(new MarkerOptions().position(mangalore).title("Mangalore"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mangalore));

        LatLng malpe= new LatLng(13.351,74.694);
        mMap.addMarker(new MarkerOptions().position(malpe).title("Malpe"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malpe));

        LatLng mavakurve= new LatLng(12.92,80.25);
        mMap.addMarker(new MarkerOptions().position(mavakurve).title("Mavakurve"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mavakurve));

        LatLng honnavar= new LatLng(14.295,74.420);
        mMap.addMarker(new MarkerOptions().position(honnavar).title("Honnavar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(honnavar));

        LatLng karwar= new LatLng(14.826,74.107);
        mMap.addMarker(new MarkerOptions().position(karwar).title("Karwar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(karwar));

        LatLng betul= new LatLng(15.146,73.945);
        mMap.addMarker(new MarkerOptions().position(betul).title("Betul"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(betul));

        LatLng panjim= new LatLng(15.487,73.801);
        mMap.addMarker(new MarkerOptions().position(panjim).title("Panjim"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(panjim));

        LatLng tiracol= new LatLng(15.720,73.687);
        mMap.addMarker(new MarkerOptions().position(tiracol).title("Tiracol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tiracol));

        LatLng malvan= new LatLng(16.044,73.467);
        mMap.addMarker(new MarkerOptions().position(malvan).title("Malvan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malvan));

        LatLng devgad= new LatLng(16.391,73.367);
        mMap.addMarker(new MarkerOptions().position(devgad).title("Devgad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(devgad));

        LatLng ratnagiri= new LatLng(16.977,73.283);
        mMap.addMarker(new MarkerOptions().position(ratnagiri).title("Ratnagiri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ratnagiri));

        LatLng dabhol= new LatLng(17.582,73.136);
        mMap.addMarker(new MarkerOptions().position(dabhol).title("Dabhol"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dabhol));

        LatLng murud= new LatLng(18.302,72.952);
        mMap.addMarker(new MarkerOptions().position(murud).title("Murud"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(murud));

        LatLng alibag= new LatLng(18.645,72.849);
        mMap.addMarker(new MarkerOptions().position(alibag).title("Alibag"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alibag));

        LatLng mumbai_byculla= new LatLng(18.958,72.867);
        mMap.addMarker(new MarkerOptions().position(mumbai_byculla).title("Mumbai Byculla"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mumbai_byculla));

        LatLng andheri_mumbai= new LatLng(19.135,72.801);
        mMap.addMarker(new MarkerOptions().position(andheri_mumbai).title("Andheri Mumbai"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(andheri_mumbai));

        LatLng virar= new LatLng(19.482,72.728);
        mMap.addMarker(new MarkerOptions().position(virar).title("Virar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(virar));

        LatLng dahanu= new LatLng(19.983,72.704);
        mMap.addMarker(new MarkerOptions().position(dahanu).title("Dahanu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dahanu));

        LatLng diu= new LatLng(20.720,70.990);
        mMap.addMarker(new MarkerOptions().position(diu).title("Diu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(diu));

        LatLng billimora= new LatLng(20.739,72.820);
        mMap.addMarker(new MarkerOptions().position(billimora).title("Billimora"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(billimora));

        LatLng veraval= new LatLng(20.894,70.378);
        mMap.addMarker(new MarkerOptions().position(veraval).title("Veraval"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(veraval));

        LatLng pippavav= new LatLng(20.898,71.502);
        mMap.addMarker(new MarkerOptions().position(pippavav).title("Pippavav"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pippavav));

        LatLng hazira= new LatLng(21.048,72.680);
        mMap.addMarker(new MarkerOptions().position(hazira).title("Hazira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hazira));

        LatLng mahuva= new LatLng(21.052,71.830);
        mMap.addMarker(new MarkerOptions().position(mahuva).title("Mahuva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mahuva));

        LatLng along= new LatLng(21.387,72.204);
        mMap.addMarker(new MarkerOptions().position(along).title("Along"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(along));

        LatLng porbandar= new LatLng(21.610,69.606);
        mMap.addMarker(new MarkerOptions().position(porbandar).title("Porbandar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(porbandar));

        LatLng dahej= new LatLng(21.643,72.565);
        mMap.addMarker(new MarkerOptions().position(dahej).title("Dahej"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dahej));

        LatLng bhavnagar= new LatLng(12.92,80.25);
        mMap.addMarker(new MarkerOptions().position(bhavnagar).title("Bhavnagar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bhavnagar));

        LatLng okha= new LatLng(22.478,69.049);
        mMap.addMarker(new MarkerOptions().position(okha).title("Okha"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(okha));

        LatLng jamanagar= new LatLng(22.580,69.933);
        mMap.addMarker(new MarkerOptions().position(jamanagar).title("Jamanagari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jamanagar));

        LatLng mundra= new LatLng(22.735,69.730);
        mMap.addMarker(new MarkerOptions().position(mundra).title("Mundra"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mundra));

        LatLng mandvi= new LatLng(22.814,69.352);
        mMap.addMarker(new MarkerOptions().position(mandvi).title("Mandvi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mandvi));

        LatLng jakhaui= new LatLng(23.228,68.571);
        mMap.addMarker(new MarkerOptions().position(jakhaui).title("Jakhau"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jakhaui));

        LatLng koteshvar= new LatLng(23.690,68.521);
        mMap.addMarker(new MarkerOptions().position(koteshvar).title("Koteshvar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(koteshvar));

        LatLng navlakhi = new LatLng(22.960,70.410);
        mMap.addMarker(new MarkerOptions().position(navlakhi).title("Navlakhi port"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(navlakhi));

        LatLng minicoy= new LatLng(8.286,73.070);
        mMap.addMarker(new MarkerOptions().position(minicoy).title("Minicoy"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(minicoy));

        LatLng daman= new LatLng(20.400,72.820);
        mMap.addMarker(new MarkerOptions().position(daman).title("Daman"));
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker m) {


                InfoWindowData info = new InfoWindowData();
                info.setImage("snowqualmie");
                info.setHotel("Hotel : excellent hotels available");
                info.setFood("Food : all types of restaurants available");
                info.setTransport("Reach the site by bus, car and train.");

                m.setTag(info);
                m.showInfoWindow();
                return false;
            }
        });

        mMap.moveCamera(CameraUpdateFactory.newLatLng(daman));


      /*  MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(daman)
                .title("Snowqualmie Falls")
                .snippet("Snoqualmie Falls is located 25 miles east of Seattle.")

                .icon(BitmapDescriptorFactory.defaultMarker( BitmapDescriptorFactory.HUE_BLUE));


        CustomInfoWindowGoogleMap customInfoWindow = new CustomInfoWindowGoogleMap(this);
        mMap.setInfoWindowAdapter(customInfoWindow);*/


        //mMap.moveCamera(CameraUpdateFactory.newLatLng(snowqualmie));

    }
}
