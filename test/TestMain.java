
import dao.DataBaseManager;
import dao.UserDAO;
import java.util.Scanner;
import model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class TestMain {
    
    
    public static void main(String[] args) {
        
        
        
        
        
        // ------------    CONFIG     ------------
        User user = new User("mbampi", "matt@email.com", "123123", "Matheus D Bampi");
        User user1 = new User("mario", "mario@email.com", "234234", "Mario Kart");
        UserDAO user_dao = new UserDAO();
        DataBaseManager.createDataBase();
        
        Scanner scan = new Scanner(System.in);
        // ------------    end CONFIG     ------------
        
//        HikeDAO hike_dao = new HikeDAO();
        //DATA POP
//        ArrayList<Hike> hikes = new ArrayList<>();
//        
//        hikes.add(new Hike("h1","Abby Grind","4km","1.5 hours","Intermediate","Fraser Valley East East","49.080516,-122.160234",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/hikes/abby-grind.jpg"));
//hikes.add(new Hike("h2","Admiralty Point","5km","1.5 hours","Easy","Tri Cities","49.312451,-122.925521",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos/admiralty-point-6.jpg"));
//hikes.add(new Hike("h3","Al's Habrich Ridge Trail","7km","5 hours","Intermediate","Howe Sound","49.67135,-123.130066",4,"July - October",false,false,false,"https://www.vancouvertrails.com/images/photos/al-habrich-ridge-trail-5.jpg"));
//hikes.add(new Hike("h4","Aldergrove Regional Park","5km","2 hours","Easy","Surrey and Langley","49.011783,-122.465557",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/aldergrove-regional-park-1.jpg"));
//hikes.add(new Hike("h5","Alice Lake","6km","2 hours","Easy","Howe Sound","49.780544,-123.124294",4,"April - November",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/alice-lake-5.jpg"));
//hikes.add(new Hike("h6","Ancient Cedars Trail","5km","2 hours","Intermediate","Whistler","50.194512,-122.959607",4,"June - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/ancient-cedars-1.jpg"));
//hikes.add(new Hike("h7","Baden Powell Deep Cove to Lynn Canyon","12km","5hours","Intermediate","The North Shore","49.329989,-122.949564",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/baden-powell-deep-cove-to-lynn-canyon-6.jpg"));
//hikes.add(new Hike("h8","Baden Powell Lynn Canyon to Grouse","10km","5 hours","Intermediate","The North Shore","49.358345,-123.028014",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/baden-powell-lynn-canyon-to-grouse-1.jpg"));
//hikes.add(new Hike("h9","BCMC Trail","3km","1.5 hours","Difficult","The North Shore","49.371357,-123.098792",4,"June - September",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/bcmc-trail-2.jpg"));
//hikes.add(new Hike("h10","Bert Flinn Park","2.6km","1 hour","Easy","Tri Cities","49.298496,-122.84375",0,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/bert-flinn-4.jpg"));
//hikes.add(new Hike("h11","Big Cedar and Kennedy Falls Trail","10km","5 hours","Intermediate","The North Shore","49.359179,-123.035502",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/big-cedar-and-kennedy-falls-trail-5.jpg"));
//hikes.add(new Hike("h12","Black Tusk","29km","11 hours","Difficult","Whistler","49.957722,-123.120292",5,"July - October",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/black-tusk-1.jpg"));
//hikes.add(new Hike("h13","Blackcomb Meadows","8km","3 hours","Intermediate","Whistler","50.09589,-122.899666",3,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/blackcomb-meadows-1.jpg"));
//hikes.add(new Hike("h14","Bosumarne Falls","2.5km","1 hour","Easy","Fraser Valley East","49.101534,-121.493315",5,"April - November",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/bosumarne-falls-2.jpg"));
//hikes.add(new Hike("h15","Boundary Bay Regional Park","5km","2 hours","Easy","Tsawwassen and Delta","49.014723,-123.04121",4,"year-round",true,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/boundary-bay-5.jpg"));
//hikes.add(new Hike("h16","Brae Island Regional Park","4.2km","1 hour","Easy","Surrey and Langley","49.173368,-122.575375",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/brae-island-regional-park-4.jpg"));
//hikes.add(new Hike("h17","Brandywine Falls","1km","0.5 hours","Easy","Whistler","50.037903,-123.122406",4,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/brandywine-falls-5.jpg"));
//hikes.add(new Hike("h18","Brandywine Meadows","6km","3.5 hours","Difficult","Whistler","50.077909,-123.185363",4,"July - October",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/brandywine-meadows-5.jpg"));
//hikes.add(new Hike("h19","Bridal Veil Falls","0.8km","0.25 hours","Easy","Fraser Valley East","49.184298,-121.742828",4,"May - October",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/bridal-veil-falls-1.jpg"));
//hikes.add(new Hike("h20","Brohm Lake","7.5km","5 hours","Intermediate","Howe Sound","49.822182,-123.13351",4,"April - October",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/brohm-lake-2.jpg"));
//hikes.add(new Hike("h21","Brothers Creek Loop","7km","4 hours","Intermediate","The North Shore","49.357606,-123.141643",4,"April - November",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/brothers-creek-loop-5.jpg"));
//hikes.add(new Hike("h22","Brunswick Point","8km","2 hours","Easy","Tsawwassen and Delta","49.068125,-123.151886",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/brunswick-point-1.jpg"));
//hikes.add(new Hike("h23","Buntzen Lake","8km","3.5 hours","Easy","Tri Cities","49.338546,-122.857361",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/buntzen-lake-2.jpg"));
//hikes.add(new Hike("h24","Burnaby Lake","10km","2 hours","Easy","Vancouver City","49.25177,-122.963963",3,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/burnaby-lake-2.jpg"));
//hikes.add(new Hike("h25","Burnaby Mountain","7.5km","3 hours","Easy","Vancouver City","49.270134,-122.894027",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/burnaby-mountain-6.jpg"));
//hikes.add(new Hike("h26","Burns Bog Delta Nature Reserve","3km","1.5 hours","Easy","Tsawwassen and Delta","49.149005,-122.935381",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/burns-bog-delta-nature-reserve-6.jpg"));
//hikes.add(new Hike("h27","Campbell Valley Regional Park","4km","1.5 hours","Easy","Surrey and Langley","49.029494,-122.66091",4,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/campbell-valley-regional-park-4.jpg"));
//hikes.add(new Hike("h28","Capilano Canyon","2.6km","1 hour","Easy","The North Shore","49.359137,-123.107386",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/capilano-canyon-6.jpg"));
//hikes.add(new Hike("h29","Capilano Pacific Trail","15km","4 hours","Easy","The North Shore","49.321881,-123.140219",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/capilano-pacific-trail-6.jpg"));
//hikes.add(new Hike("h30","Cascade Falls","0.75km","0.5 hours","Easy","Fraser Valley East","49.273986,-122.216066",4,"April - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/cascade-falls-4.jpg"));
//hikes.add(new Hike("h31","Cheakamus Lake","16km","5 hours","Easy","Whistler","50.042258,-122.989197",4,"May - November",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/cheakamus-lake-4.jpg"));
//hikes.add(new Hike("h32","Cheam Lake Wetlands","2.3km","1 hour","Easy","Fraser Valley East","49.197347,-121.750638",5,"year-round",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/cheam-lake-wetlands-4.jpg"));
//hikes.add(new Hike("h33","Conflict Lake","12km","5 hours","Intermediate","Whistler","50.190799,-123.182168",4,"June - September",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/conflict-lake-4.jpg"));
//hikes.add(new Hike("h34","Coquitlam Crunch","4.5km","1.5 hours","Intermediate","Tri Cities","49.28528,-122.815357",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/coquitlam-crunch-3.jpg"));
//hikes.add(new Hike("h35","Crater Rim Trail","4.5km","2 hours","Intermediate","Whistler","50.063286,-123.032615",0,"May - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/crater-rim-trail-2.jpg"));
//hikes.add(new Hike("h36","Crown Mountain","9.8km","7 hours","Difficult","The North Shore","49.379565,-123.082817",5,"July - October",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/crown-mountain-4.jpg"));
//hikes.add(new Hike("h37","Crystal Falls","7km","2 hours","Easy","Tri Cities","49.295609,-122.77072",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/crystal-falls-1.jpg"));
//hikes.add(new Hike("h38","Cypress Falls","3km","1.5 hours","Easy","The North Shore","49.352092,-123.241174",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/cypress-falls-1.jpg"));
//hikes.add(new Hike("h39","Dam Mountain","5km","2 hours","Easy","The North Shore","49.379565,-123.082817",4,"July - September",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/dam-mountain-1.jpg"));
//hikes.add(new Hike("h40","Deas Island Regional Park","4.5km","2 hours","Easy","Tsawwassen and Delta","49.122632,-123.064277",3,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/deas-island-regional-park-2.jpg"));
//hikes.add(new Hike("h41","Deer Lake","5km","1 hours","Easy","Vancouver City","49.235898,-122.965271",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/deer-lake-2.jpg"));
//hikes.add(new Hike("h42","Derby Reach Regional Park","8km","2.5 hours","Easy","Surrey and Langley","49.2081,-122.6174",3,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/derby-reach-regional-park-2.jpg"));
//hikes.add(new Hike("h43","Dilly Dally Loop","25km","12 hours","Difficult","Tri Cities","49.338546,-122.857361",5,"July - October",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/dilly-dally-loop-2.jpg"));
//hikes.add(new Hike("h44","Dog Mountain","5km","2 hours","Easy","The North Shore","49.368541,-122.949114",4,"June - October",false,true,false,"https://www.vancouvertrails.com/images/photos/dog-mountain-1.jpg"));
//hikes.add(new Hike("h45","Dorman Point","2.5km","1 hour","Easy","Howe Sound","49.379609,-123.333468",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/dorman-point-1.jpg"));
//hikes.add(new Hike("h46","Downes Bowl Trail","3km","1 hour","Easy","Fraser Valley East","49.069536,-122.33632",5,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/downes-bowl-3.jpg"));
//hikes.add(new Hike("h47","Eagle Bluffs","8km","4 hours","Intermediate","The North Shore","49.394315,-123.202915",4,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/eagle-bluffs-2.jpg"));
//hikes.add(new Hike("h48","Elfin Lakes","22km","6 hours","Intermediate","Howe Sound","49.750218,-123.053741",5,"July - October",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/elfin-lakes-3.jpg"));
//hikes.add(new Hike("h49","Elk Mountain","7km","4 hours","Intermediate","Fraser Valley East","49.104963,-121.820698",5,"June - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/elfin-lakes-3.jpg"));
//hikes.add(new Hike("h50","Foreshore Trail","5km","3 hours","Easy","Vancouver City","49.350394,-123.013996",4,"year-round",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/foreshore-trail-6.jpg"));
//hikes.add(new Hike("h51","Garibaldi Lake","18km","5 hours","Intermediate","Whistler","49.957722,-123.120292",5,"July - October",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/garibaldi-lake-6.jpg"));
//hikes.add(new Hike("h52","Goat Mountain","8km","4 hours","Intermediate","The North Shore","49.379565,-123.082817",4,"July - October",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/goat-mountain-1.jpg"));
//hikes.add(new Hike("h53","Gold Creek Falls","5.5km","2 hours","Easy","Ridge Meadows","49.332841,-122.457047",4,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/gold-creek-falls-6.jpg"));
//hikes.add(new Hike("h54","Golden Ears","24km","12 hours","Difficult","Ridge Meadows","49.327293,-122.463072",4,"July - September",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/golden-ears-2.jpg"));
//hikes.add(new Hike("h55","Goldie Lake","3km","2 hours","Easy","The North Shore","49.368541,-122.94911",3,"June - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/goldie-lake-2.jpg"));
//hikes.add(new Hike("h56","Grouse Grind","2.9km","1.5 - 2 hours","Difficult","The North Shore","49.371357,-123.098792",4,"June - September",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/grouse-grind-3.jpg"));
//hikes.add(new Hike("h57","Hanes Valley Trail","16km","8.5 hours","Difficult","The North Shore","49.359842,-123.027944",4,"July - September",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/hanes-valley-trail-2.jpg"));
//hikes.add(new Hike("h58","Harrison Grind","7km","6 hours","Difficult","Fraser Valley East","49.296314,-121.784837",4,"March - November",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/harrison-grind-4.jpg"));
//hikes.add(new Hike("h59","Hayward Lake","17km","5.5 hours","Easy","Fraser Valley East","49.222292,-122.359167",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/hayward-lake-3.jpg"));
//hikes.add(new Hike("h60","Helm Lake","26km","9 hours","Difficult","Whistler","50.042258,-122.989197",5,"July - October",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/helm-lake-1.jpg"));
//hikes.add(new Hike("h61","Hicks Lake","6km","2 hours","Easy","Fraser Valley East","49.349513,-121.706446",3,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/hicks-lake-4.jpg"));
//hikes.add(new Hike("h62","High Falls Creek","12 km","5 hours","Intermediate","Howe Sound","49.937984,-123.299797",4,"May - October",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/high-creek-falls-6.jpg"));
//hikes.add(new Hike("h63","High Note Trail","9.5km","4 hours","Intermediate","Whistler","50.1040637,-123.1422843",4,"July - October",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/high-note-trail-6.jpg"));
//hikes.add(new Hike("h64","Hollyburn Mountain","7km","3.5 hours","Intermediate","The North Shore","49.379118,-123.191521",4,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/hollyburn-mountain-3.jpg"));
//hikes.add(new Hike("h65","Iona Beach Regional Park","6km","1.5 hours","Easy","Vancouver City","49.218976,-123.21334",5,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/iona-beach-regional-park-2.jpg"));
//hikes.add(new Hike("h66","Joffre Lakes","10km","4 hours","Intermediate","Pemberton","49.312451,-122.925521",5,"June - September",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/joffre-lakes-1.jpg"));
//hikes.add(new Hike("h67","Jug Island Beach","5.5km","2.5 hours","Intermediate","Tri Cities","49.312451,-122.925521",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/jug-island-beach-3.jpg"));
//hikes.add(new Hike("h68","Kanaka Creek Cliff Falls","4km","2 hours","Easy","Ridge Meadows","49.212758,-122.526333",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/kanaka-creek-cliff-falls-2.jpg"));
//hikes.add(new Hike("h69","Kanaka Creek Riverfront","2.5km","1 hour","Easy","Ridge Meadows","49.200123,-122.579699",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/kanaka-creek-riverfront-1.jpg"));
//hikes.add(new Hike("h70","Killarney Lake","9km","2 hours","Easy","Howe Sound","49.380648,-123.333873",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/killarney-lake-3.jpg"));
//hikes.add(new Hike("h71","Levette Lake Loop","11km","5 hours","Intermediate","Howe Sound","49.815336,-123.168669",2,"May - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/levette-lake-loop-3.jpg"));
//hikes.add(new Hike("h72","Lighthouse Park","up to 6km","2 hours","Easy","The North Shore","49.336791,-123.262836",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/lighthouse-park-6.jpg"));
//hikes.add(new Hike("h73","Lindeman Lake","3.4km","2 hours","Intermediate","Fraser Valley East","49.097858,-121.458423",5,"May - October",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/lindeman-lake-2.jpg"));
//hikes.add(new Hike("h74","Lions Bay Loop","4.5km","2 hours","Easy","Howe Sound","49.460133,-123.23618",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/lions-bay-loop-3.jpg"));
//hikes.add(new Hike("h75","Little Goat Mountain","5.5km","2.5 hours","Easy","The North Shore","49.379565,-123.082817",4,"July - September",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/little-goat-mountain-1.jpg"));
//hikes.add(new Hike("h76","Lost Lake Nature Trail","5km","1.5 hours","Easy","Whistler","50.120044,-122.947922",5,"March -October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/lost-lake-nature-trail-2.jpg"));
//hikes.add(new Hike("h77","Lower Hollyburn","10km","4.5 hours","Intermediate","The North Shore","49.353709,-123.177059",4,"June - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/lower-hollyburn-1.jpg"));
//hikes.add(new Hike("h78","Lynn Loop","5.1km","1.5 hours","Easy","The North Shore","49.815336,-123.168669",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/lynn-loop-1.jpg"));
//hikes.add(new Hike("h79","Lynn Peak","9km","4 hours","Intermediate","The North Shore","49.359842,-123.027944",4,"June - October",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/lynn-peak-6.jpg"));
//hikes.add(new Hike("h80","Maplewood Flats","2.5km","0.75 hours","Easy","The North Shore","49.306563,-123.001951",4,"year-round",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/maplewood-flats-4.jpg"));
//hikes.add(new Hike("h81","Mike Lake","2km","0.75 hours","Easy","Ridge Meadows","49.273135,-122.539648",5,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/mike-lake-3.jpg"));
//hikes.add(new Hike("h82","Minnekhada Regional Park","10km","2.5 hours","Easy","Tri Cities","49.299802,-122.707329",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/minnekhada-regional-park-5.jpg"));
//hikes.add(new Hike("h83","Mount Cheam","9.5km","4.5 hours","Intermediate","Fraser Valley East","49.167949,-121.69414",5,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/mount-cheam-1.jpg"));
//hikes.add(new Hike("h84","Mount Fromme","10km","5 hours","Intermediate","The North Shore","49.348811,-123.068526",4,"July - October",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/mount-fromme-5.jpg"));
//hikes.add(new Hike("h85","Mount Gardner","17km","7 hours","Intermediate","Howe Sound","49.39252,-123.361573",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/mount-gardner-1.jpg"));
//hikes.add(new Hike("h86","Mount Seymour","9km","5 hours","Intermediate","The North Shore","49.368541,-122.949114",4,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/mount-seymour-3.jpg"));
//hikes.add(new Hike("h87","Mount Strachan","10.5km","5.5 hours","Intermediate","The North Shore","49.395327,-123.202293",4,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/mount-strachan-1.jpg"));
//hikes.add(new Hike("h88","Mount Thom","10km","2.5 hours","Intermediate","Fraser Valley East","49.104542,-121.919644",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/mount-thom-5.jpg"));
//hikes.add(new Hike("h89","Mundy Park","6km","2 hours","Easy","Tri Cities","49.255643,-122.816441",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/mundy-park-3.jpg"));
//hikes.add(new Hike("h90","Mystery Lake","3km","1.25 hours","Easy","The North Shore","49.368541,-122.949114",4,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/mystery-lake-6.jpg"));
//hikes.add(new Hike("h91","Nairn Falls","3km","1.5 hours","Easy","Pemberton","50.296851,-122.820196",5,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/nairn-falls-3.jpg"));
//hikes.add(new Hike("h92","Norvan Falls","14 km","5 hours","Intermediate","The North Shore","49.359842,-123.027944",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/norvan-falls-5.jpg"));
//hikes.add(new Hike("h93","Pacific Spirit Regional Park","10km","3 hours","Easy","Vancouver City","49.258072,-123.203398",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/pacific-spirit-regional-park-3.jpg"));
//hikes.add(new Hike("h94","Panorama Ridge","30km","11 hours","Difficult","Whistler","49.957722,-123.120292",5,"July - October",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/panorama-ridge-3.jpg"));
//hikes.add(new Hike("h95","Petgill Lake","11.5km","6 hours","Intermediate","Howe Sound","49.648196,-123.201886",4,"March - October",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/petgill-lake-3.jpg"));
//hikes.add(new Hike("h96","Pitt River Regional Greenway","17.2km","5 hours","Easy","Ridge Meadows","49.240955,-122.734173",0,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/pitt-river-regional-greenway-1.jpg"));
//hikes.add(new Hike("h97","Pitt Wildlife Loop","up to 15km","4 hours","Easy","Ridge Meadows","49.348863,-122.615962",3,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/pitt-wildlife-loop-4.jpg"));
//hikes.add(new Hike("h98","Quarry Rock","3.8km","1.5 hours","Easy","The North Shore","49.329989,-122.949564",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/quarry-rock-4.jpg"));
//hikes.add(new Hike("h99","Rainbow Lake","16km","6 hours","Intermediate","Whistler","50.13013,-122.985723",4,"July - September",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/rainbow-lake-6.jpg"));
//hikes.add(new Hike("h100","Reifel Bird Sanctuary","5km","1 hour","Easy","Tsawwassen and Delta","49.098097,-123.178588",5,"year-round",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/reifel-bird-sanctuary-1.jpg"));
//hikes.add(new Hike("h101","Rice Lake","3km","1 hours","Easy","The North Shore","49.3511,-123.016448",4,"year-round",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/rice-lake-6.jpg"));
//hikes.add(new Hike("h102","Rolley Lake","5km","2 hours","Easy","Fraser Valley East","49.241537,-122.388961",4,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/rolley-lake-4.jpg"));
//hikes.add(new Hike("h103","Sasamat Lake","8km","3 hours","Easy","Tri Cities","49.324633,-122.886608",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/sasamat-lake-4.jpg"));
//hikes.add(new Hike("h104","Sea To Summit Trail","7.5km","3.5 hours","Intermediate","Howe Sound","49.675122,-123.155983",4,"March - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/sea-to-summit-5.jpg"));
//hikes.add(new Hike("h105","Sendero Diez Vistas","15km","6 - 7 hours","Intermediate","Tri Cities","49.338546,-122.857361",4,"April - November",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/sendero-diez-vistas-6.jpg"));
//hikes.add(new Hike("h106","Serpentine Fen Nature Trail","3.5km","1.5 hours","Easy","Surrey and Langley","49.086477,-122.81929",2,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/serpentine-fen-nature-trail-4.jpg"));
//hikes.add(new Hike("h107","Seven Sisters Trail","3km","1 hour","Easy","Fraser Valley East","49.055145,-121.967856",3,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/seven-sisters-trail-4.jpg"));
//hikes.add(new Hike("h108","Shadow Lake","5km","2 hours","Easy","Pemberton","50.220275,-122.881737",1,"June - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/shadow-lake-4.jpg"));
//hikes.add(new Hike("h109","Shoreline Trail","6km","2 hours","Easy","Tri Cities","49.281603,-122.849851",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/shoreline-trail-4.jpg"));
//hikes.add(new Hike("h110","Skyline Trail","5km","3 hours","Intermediate","The North Shore","49.35755,-123.082312",3,"April - November",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/skyline-trail-1.jpg"));
//hikes.add(new Hike("h111","St Mark's Summit","11km","5 hours","Intermediate","The North Shore","49.394315,-123.202915",4,"July - October",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/st-marks-summit-1.jpg"));
//hikes.add(new Hike("h112","Stanley Park","6.5km","2 hours","Easy","Vancouver City","49.298515,-123.135656",5,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/stanley-park-2.jpg"));
//hikes.add(new Hike("h113","Stawamus Chief","11km","6 hours","Intermediate","Howe Sound","49.671412,-123.160729",4,"March - November",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/stawamus-chief-3.jpg"));
//hikes.add(new Hike("h114","Sumas Mountain","13.5km","6.5 hours","Intermediate","Fraser Valley East","49.122236,-122.188343",4,"May - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/sumas-mountain-6.jpg"));
//hikes.add(new Hike("h115","Swan Falls Viewpoint","10km","3.5 hours","Intermediate","Tri Cities","49.338546,-122.857361",4,"year-round",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/swan-falls-viewpoint-1.jpg"));
//hikes.add(new Hike("h116","Teapot Hill","5km","2 hours","Easy","Fraser Valley East","49.042425,-121.983604",4,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/teapot-hill-2.jpg"));
//hikes.add(new Hike("h117","The Lions Binkert Trail","16km","8 hours","Difficult","Howe Sound","49.470836,-123.23478",5,"July - October",false,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/the-lions-binkert-trail-3.jpg"));
//hikes.add(new Hike("h118","Thunderbird Ridge","6km","2.5 hours","Easy","The North Shore","49.379565,-123.082817",0,"July - September",false,false,true,"https://www.vancouvertrails.com/images/photos-thumbnails/thunderbird-ridge-5.jpg"));
//hikes.add(new Hike("h119","Tunnel Bluffs","8km","4.5 hours","Intermediate","Howe Sound","49.484952,-123.247768",4,"May - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/tunnel-bluffs-5.jpg"));
//hikes.add(new Hike("h120","Twin Falls","1.5km","1 hour","Easy","The North Shore","49.343492,-123.018452",3,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/twin-falls-1.jpg"));
//hikes.add(new Hike("h121","Two Canyon Loop","8km","3 hours","Intermediate","The North Shore","49.350394,-123.013996",4,"February - November",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/two-canyon-loop-6.jpg"));
//hikes.add(new Hike("h122","Tynehead Regional Park","4.5km","1.5 hours","Easy","Surrey and Langley","49.177804,-122.761311",5,"year-round",true,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/tynehead-regional-park-3.jpg"));
//hikes.add(new Hike("h123","UBC Malcolm Knapp Research Forest","8km","3 hours","Intermediate","Ridge Meadows","49.263086,-122.573347",4,"February - November",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/ubc-malcolm-knapp-research-forest-5.jpg"));
//hikes.add(new Hike("h124","Velodrome Trail","3km","1 hour","Intermediate","Vancouver City","49.289521,-122.94024",4,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/velodrome-trail-2.jpg"));
//hikes.add(new Hike("h125","Watersprite Lake","17km","7 hours","Intermediate","Howe Sound","49.752306,-122.934378",1,"July - September",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/watersprite-lake-5.jpg"));
//hikes.add(new Hike("h126","Wedgemount Lake","14km","7 hours","Difficult","Whistler","50.171566,-122.866158",5,"July - September",true,false,false,"https://www.vancouvertrails.com/images/photos-thumbnails/wedgemount-lake-5.jpgg"));
//hikes.add(new Hike("h127","Whippoorwill Point Trail","4km","1.5 hours","Easy","Fraser Valley East","49.304122,-121.789987",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/whippoorwill-point-trail-2.jp"));
//hikes.add(new Hike("h128","Whistler Train Wreck","2km","1 hour","Easy","Whistler","50.08087,-123.045262",5,"May - November",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/whistler-train-wreck-3.jpg"));
//hikes.add(new Hike("h129","Whyte Lake","5km","2 hours","Easy","The North Shore","49.360746,-123.258769",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/whyte-lake-3.jpg"));
//hikes.add(new Hike("h130","Whytecliff Park","2km","1.5 hours","Easy","The North Shore","49.373942,-123.288671",3,"year-round",false,true,true,"https://www.vancouvertrails.com/images/photos-thumbnails/whytecliff-park-2.jpg"));
//hikes.add(new Hike("h131","Widgeon Falls","6km","5 hours","Easy","Ridge Meadows","49.348863,-122.615962",4,"year-round",true,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/widgeon-falls-5.jpg"));
//hikes.add(new Hike("h132","Woodland Walk Trail","8km","3 hours","Easy","Tri Cities","49.31361,-122.749288",4,"year-round",false,true,false,"https://www.vancouvertrails.com/images/photos-thumbnails/woodland-walk-trail-2.jpg"));
//        
//
//    for(Hike hike : hikes){    
//        hike_dao.insertHike(hike, new HikeDAO.messageCallback() {
//            @Override
//            public void done(String message) {
//                System.out.println(message);
//            }
//        });
//    }     
        
        
        
        
//        // ------------    SIGNUP     ------------
//        user_dao.insertUser(user, new UserDAO.messageCallback() {
//            @Override
//            public void done(String message) {
//                System.out.println(message);
//            }
//        });
//        // ------------    end SIGNUP     ------------
//        
//        
//        
//        
//        // ------------    LOGIN     ------------
//        System.out.println("username: ");
//        String username = scan.next().trim();
//        System.out.println("password: ");
//        String password = scan.next();
//        
//        user_dao.getUserByUsername(username, new UserDAO.userCallback() {
//            @Override
//            public void done(User user) {
//                if(user.getPassword().equals(password)){
//                    System.out.println("LOGIN");
//                }else{
//                    System.out.println("INCORRECT PASSWORD");
//                }
//            }
//        });
//        // ------------    end LOGIN     ------------
//        
//        
//        
//        
//        
//        // ------------    DELETE ACCOUNT     ------------
//        System.out.println("delete username: ");
//        username = scan.next().trim();
//        user_dao.deleteUser(username, new UserDAO.messageCallback() {
//            @Override
//            public void done(String message) {
//                System.out.println(message);
//            }
//        });
//        // ------------    end DELETE ACCOUNT     ------------
//        // ------------    DELETE ACCOUNT     ------------
//        System.out.println("delete username: ");
//        username = scan.next().trim();
//        user_dao.deleteUser(username, new UserDAO.messageCallback() {
//            @Override
//            public void done(String message) {
//                System.out.println(message);
//            }
//        });
//        // ------------    end DELETE ACCOUNT     ------------
        
        
        
        
        //LOAD GEOLOCATION IN WEBVIEW
//        System.out.println("wait...");
//        
//        
//        HikeDAO hike_dao = new HikeDAO();
//        
//        
//        hike_dao.getHikeByHike_id("asdasd", new HikeDAO.hikeCallback() {
//            @Override
//            public void done(Hike hike) {
//                String geoloc = hike.getLocation();
//                
//                
//                WebView browser = new WebView();
//                WebEngine webEngine = browser.getEngine();
//                String start = "";
//                String end = geoloc;
//                webEngine.load("https://www.google.ca/maps/dir/"+start+"/"+end+"?hl=en&hl=en");
//                scene = new Scene(browser,750,500, Color.web("#666970"));
//                primaryStage.setScene(scene);
//                scene.getStylesheets().add("webviewsample/BrowserToolbar.css");
//                primaryStage.show();
//                
//                
//                
//            }
//        });
    }
    
    
    //  ----------      GOOGLEMAPTEST       ----------
    
    
//    public class Main extends Application {
//        private Scene scene;
//        @Override
//        public void start(Stage primaryStage) throws Exception{
//    //        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//    //        primaryStage.setTitle("Hello World");
//    //        primaryStage.setScene(new Scene(root, 300, 275));
//    //        primaryStage.show();
//
//
//
//
//            WebView browser = new WebView();
//            WebEngine webEngine = browser.getEngine();
//            String start = "";
//            String end = "trailway";
//            webEngine.load("https://www.google.ca/maps/dir/"+start+"/"+end+"?hl=en&hl=en");
//            scene = new Scene(browser,750,500, Color.web("#666970"));
//            primaryStage.setScene(scene);
//            scene.getStylesheets().add("webviewsample/BrowserToolbar.css");
//            primaryStage.show();
//        }
//        public static void main(String[] args) {
//            launch(args);
//        }
//    }
}
