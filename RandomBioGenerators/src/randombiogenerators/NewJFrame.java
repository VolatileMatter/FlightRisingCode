/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randombiogenerators;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isabel
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public String[] fear = {"Abbreviatophobia", "Abductophobia", "Ablutophobia", "Abstracophobia", "Acarophobia", "Acerophobia", "Achluophobia", "Achondroplasiaphobia", "Acousticophobia", "Acrisophobia", "Acrophobia", "Actiophobia", "Adamophobia", "Additionphobia", "Adventophobia", "Aelosaccophobia", "Aeriophobia", "Aeroacrophobia", "Aerodromophobia", "Aeronausiphobia", "Aerophobia", "Aerosakaphobia", "Aerostatiophobia", "Aerosynodophobia", "Aerozoophobia", "Aestophobia", "Afairophobia", "Afentikophobia", "Aftiphobia", "Agateophobia", "Agerozoophobia", "Agkonaphobia", "Agliophobia", "Agnostophobia", "Agoraphobia", "Agraphobia", "Agripyrophobia", "Agrizoophobia", "Agrostophobia", "Agyrophobia", "Aibohphobia", "Aichmophobia", "Aigialophobia", "Ailurophobia", "Aircophobia", "Airuniphobia", "Alabamaphobia", "Aladdinphobia", "Alatiphobia", "Albanophobia", "Albuminurophobia", "Alektorophobia", "Aletheiaphobia", "Algophobia", "Alienabductophobia", "Alienophobia", "Allergiphobia", "Alliumphobia", "Allocotophobia", "Allodoxaphobia", "Alphaphobia", "Altocelarophobia", "Altophobia", "Amansophobia", "Amathophobia", "Amaxophobia", "Ambulophobia", "Americanophobia", "Amicophobia", "Amitaphobia", "Ammophobia", "Amnesiphobia", "Amychophobia", "Anablephobia", "Anagnosmaphobia", "Anaphylaxophobia", "Anapsytikophobia", "Anatidaephobia", "Anatolephobia", "Ancraophobia", "Anditchophobia", "Androgynophobia", "Androphobia", "Anemistiraphobia", "Anemophobia", "Anepsiaphobia", "Angelophobia", "Anginophobia", "Anglophobia", "Angrophobia", "Animaphobia", "Animophobia", "Animotophobia", "Anipsiophobia", "Ankylophobia", "Anoixiphobia", "Anopheliphobia", "Antarcticaphobia", "Antennaphobia", "Anthophobia", "Anthropariophobia", "Anthrophobia", "Anthropophobia", "Antikheirphobia", "Antlophobia", "Anuptaphobia", "Apeirophobia", "Aphenphosmphobia", "Apiphobia", "Apollymophobia", "Apostasiphobia", "Apotemnophobia", "Aquaphobia", "Arachibutyrophobia", "Arachnephobia", "Arachnophobia", "Arakaphobia", "Arcadephobia", "Archeiothikiphobia", "Archephobia", "Argyrophobia", "Ariditaphobia", "Arithmophobia", "Arkansasphobia", "Arkoudaphobia", "Armarophobia", "Aromaphobia", "Arpaphobia", "Arrhenphobia", "Arsonphobia", "Artemophobia", "Artophobia", "Aschemegynephobia", "Aschimophobia", "Asfaleiaskopophobia", "Asianophobia", "Asimiphobia", "Asthenophobia", "Astralplanephobia", "Astraphobia", "Astrapophobia", "Astrophobia", "Astynomiaphobia", "Asymmetriphobia", "Ataxaphobia", "Ataxiophobia", "Ataxophobia", "Atelophobia", "Atephobia", "Athazagoraphobia", "Atheophobia", "Athlemaphobia", "Atomosophobia", "Atychiphobia", "Auditoriphobia", "Aulophobia", "Aurophobia", "Auroraphobia", "Autodysomophobia", "Autokeraphobia", "Autokinetodromophobia", "Automatonophobia", "Automysophobia", "Autophobia", "Autoplenophobia", "Aviatophobia", "Aviophobia", "Avuncrophobia", "Avunculusphobia", "Bacillophobia", "Bacteriophobia", "Bagelphobia", "Bahnubophobia", "Ballistophobia", "Balteusphobia", "Balticophobia", "Bananaphobia", "Banmaxianphobia", "Barneyphobia", "Barophobia", "Bartenderphobia", "Basiphobia", "Basophobia", "Bathmophobia", "Bathophobia", "Batmanphobia", "Batophobia", "Batrachophobia", "Batterophobia", "Bayuephobia", "Beepophobia", "Beikonphobia", "Belonephobia", "Benziphobia", "Betaphobia", "Biblephobia", "Bibliophobia", "Bicentumphobia", "Biftekiphobia", "Bigbirdphobia", "Bindaphobia", "Binoculophobia", "Biochronophobia", "Biophobia", "Biotriocularmechanophobia", "Biphobia", "Biskotophobia", "Blenderphobia", "Blennophobia", "Bogyphobia", "Boitephobia", "Bolshephobia", "Boophobia", "Botanophobia", "Boulntozaphobia", "Bovinophobia", "Bowlingphobia", "Bracesphobia", "Bromidrophobia", "Bromidrosiphobia", "Brontophobia", "Browniephobia", "Bufonophobia", "Bufuphobia", "Buhuajiphobia", "Bumuphobia", "Burritophobia", "Burusuphobia", "Bustrophobia", "Buzzophobia", "Cacohydrophobia", "Cacomorphobia", "Cacophobia", "Caecophobia", "Caelophobia", "Cafephobia", "Cafeteriphobia", "Cainophobia", "Cainotophobia", "Calamusphobia", "Calculaphobia", "Californiaphobia", "Caligynephobia", "Callophobia", "Cameraphobia", "Cammaphobia", "Cancerophobia", "Candymanphobia", "Capiophobia", "Capnophobia", "Capraphobia", "Caramelaphobia", "Carcerophobia", "Carcinophobia", "Cardiophobia", "Carnophobia", "Carpophobia", "Casadastraphobia", "Cassettophobia", "Catagelophobia", "Catapedaphobia", "Catastolephobia", "Catastrophobia", "Catdogphobia", "Cathedraphobia", "Cathisophobia", "Catoptrophobia", "Cauponaphobia", "Cedeiaphobia", "Celarophobia", "Cenophobia", "Centophobia", "Centummegaphobia", "Centummillephobia", "Ceraunophobia", "Chaetophobia", "Chapitgoephobia", "Charakaphobia", "Chartiphobia", "Chayiphobia", "Cheilophobia", "Cheimaphobia", "Cheimatophobia", "Chelonaphobia", "Chemophobia", "Cherophobia", "Chicagophobia", "Chiclephobia", "Chiliphobia", "Chionophobia", "Chionothyellaphobia", "Chiraptophobia", "Chirophobia", "Chiroptophobia", "Chloephobia", "Choirinophobia", "Choiromeriphobia", "Cholerophobia", "Choreftikophobia", "Chorophobia", "Chotdonkphobia", "Chrematophobia", "Chreostikikartaphobia", "Christianophobia", "Christougenniatikophobia", "Chromatophobia", "Chrometophobia", "Chromophobia", "Chronohodophobia", "Chronomentrophobia", "Chronophobia", "Chrysophobia", "Cibofestinaphobia", "Cibophobia", "Cinderellaphobia", "Cinematophobia", "Cinephobia", "Cistulaphobia", "Citharaphobia", "Claustrophobia", "Cleisiophobia", "Cleithrophobia", "Cleptophobia", "Climacophobia", "Clinephobia", "Clinophobia", "Clithrophobia", "Cloacaphobia", "Cnidophobia", "Coasterphobia", "Coimetrophobia", "Coitophobia", "Colimbophobia", "Collegiphobia", "Cometophobia", "Compassphobia", "Compustitusnumerophobia", "Concertophobia", "Consecotaleophobia", "Contreltophobia", "Controsoffittophobia", "Convertiblephobia", "Coprastasophobia", "Coprophobia", "Corephobia", "Cosmophobia", "Coulrophobia", "Counterphobia", "Coupephobia", "Couragephobia", "Coyotephobia", "Cranophobia", "Cremnophobia", "Crustumphobia", "Cryophobia", "Crystallophobia", "Cubranchiophobia", "Culpaphobia", "Cunniphobia", "Cupcakephobia", "Cuprolaminophobia", "Cuprophobia", "Cyanophobia", "Cyberphobia", "Cyclonophobia", "Cyclophobia", "Cymophobia", "Cynophobia", "Cyprianophobia", "Cypridophobia", "Cyprinophobia", "Cypriphobia", "Daemonophobia", "Daknophobia", "Dakrophobia", "Dakulophobia", "Decannophobia", "Decaphobia", "Decemmegaphobia", "Decemmillephobia", "Decidophobia", "Deephobia", "Defecaloesiophobia", "Defenestraphobia", "Deinophobia", "Deipnophobia", "Dekaenneaoraphobia", "Dekaeptaoraphobia", "Dekaexioraphobia", "Dekaoktooraphobia", "Dekaoraphobia", "Dekapenteoraphobia", "Dekatesseraphobia", "Dekatriaoraphobia", "Delfiniphobia", "Deltaphobia", "Dementophobia", "Demonophobia", "Demophobia", "Dendrophobia", "Dengpaophobia", "Dentohygienophobia", "Dentophobia", "Dependophobia", "Deprecorophobia", "Dermatopathophobia", "Dermatophobia", "Dermatosiophobia", "Deuterophobia", "Devwahrphobia", "Dextrophobia", "Diabetophobia", "Diakosioihekkaidekaphobia", "Diakosioipentekontaphobia", "Dianoiphobia", "Diaperphobia", "Diastimaphobia", "Didaskaleinophobia", "Didaskalophobia", "Digitusphobia", "Dikephobia", "Dimephobia", "Dimotikophobia", "Dingophobia", "Dinophobia", "Diplophobia", "Dipsophobia", "Dishabiliophobia", "Dishleprophobia", "Disneyphobia", "Disongchephobia", "Disposophobia", "Dochogophobia", "Dodecaphobia", "Dodekaoraphobia", "Dolorophobia", "Domatophobia", "Domestozoophobia", "Dontineraiphobia", "Doorbellphobia", "Doraphobia", "Doronophobia", "Doxophobia", "Dracophobia", "Dramaphobia", "Drogerphobia", "Dromophobia", "Duismalophobia", "Dulciphobia", "Dulunchephobia", "Dumasaphobia", "Dumpsterphobia", "Duooraphobia", "Duophobia", "Durumphobia", "Dusiphobia", "Dutchphobia", "Dvdphobia", "Dyophobia", "Dysiphobia", "Dyskolophobia", "Dysmorphophobia", "Dystychiphobia", "Eapalliophobia", "Earmuffphobia", "Ebulliophobia", "Ecclesiophobia", "Ecophobia", "Ecothermophobia", "Effophobia", "Efkolophobia", "Ehsanophobia", "Eicophobia", "Eikosidyooraphobia", "Eikosienaoraphobia", "Eikosihexaphobia", "Eikosioraphobia", "Eikositreisoraphobia", "Eikositriophobia", "Eisoptrophobia", "Ekrixiphobia", "Elafiphobia", "Electrophobia", "Eleutherophobia", "Elevatophobia", "Elmophobia", "Elurophobia", "Emetophobia", "Emotaophobia", "Enaoraphobia", "Encavmaphobia", "Enenekontenneaphobia", "Energyphobia", "Enetophobia", "Enissophobia", "Enkefalophobia", "Enkhenumerophobia", "Enneaoraphobia", "Enneaphobia", "Enniakosioenenekontenneaphobia", "Enniakosioihendecaphobia", "Enochlophobia", "Enosiophobia", "Entamaphobia", "Entekaphobia", "Entomophobia", "Enydreiophobia", "Eosophobia", "Ephebiphobia", "Epiplaphobia", "Episcophobia", "Epistaxiophobia", "Epistegophobia", "Epistemophobia", "Epsilonphobia", "Eptaoraphobia", "Equinophobia", "Eremophobia", "Ereuthophobia", "Ereuthrophobia", "Ergaleiophobia", "Ergaleophobia", "Ergasiophobia", "Ergophobia", "Erotimatikophobia", "Erotophobia", "Erratophobia", "Ershitianphobia", "Ertianphobia", "Eructophobia", "Erxingqiphobia", "Erythophobia", "Erythrophobia", "Erytophobia", "Eryuephobia", "Escalaphobia", "Esorouchaphobia", "Ethismosophobia", "Etiamophobia", "Euphobia", "Eupistophobia", "Europhobia", "Eurotophobia", "Eutychemaphobia", "Evodiaphobia", "Exaphobia", "Exioraphobia", "Fajitaphobia", "Fakelophobia", "Fakosphobia", "Falainaphobia", "Fanariphobia", "Fantasophobia", "Farasiphobia", "Fasciolisphobia", "Fasoliphobia", "Febriphobia", "Feichuanphobia", "Feijiphobia", "Felinophobia", "Feretrophobia", "Ferrophobia", "Fibliphobia", "Fibriophobia", "Fibriphobia", "Fictophobia", "Figmentophobia", "Filophobia", "Fimsophobia", "Flasciphobia", "Flatulophobia", "Floridaphobia", "Focophobia", "Foedophobia", "Foniasophobia", "Fooniphobia", "Foremaphobia", "Forkliftophobia", "Fornaciphobia", "Forumphobia", "Fournophobia", "Foustaphobia", "Foxtophobia", "Frachtiphobia", "Fragapanophobia", "Francophobia", "Frankensteinphobia", "Fratrophobia", "Frearphobia", "Frenophobia", "Frigophobia", "Frigoriphobia", "Fructophobia", "Fumiphobia", "Fumusterroremophobia", "Fundophobia", "Futurephobia", "Fyllofysophobia", "Fylophobia", "Fysikophobia", "Fystikovoutyrophobia", "Gakkiphobia", "Galaphobia", "Galeophobia", "Galiophobia", "Gallophobia", "Gammaphobia", "Gamocedeiaphobia", "Gamophobia", "Gargalaphobia", "Gasgaugephobia", "Gaspedalphobia", "Gatophobia", "Geitophobia", "Gelandelimophobia", "Geliophobia", "Gelotophobia", "Geniophobia", "Genophobia", "Genuphobia", "Gephydrophobia", "Gephyrophobia", "Gephysrophobia", "Gerascophobia", "Germanophobia", "Gerontophobia", "Geumaphobia", "Geumophobia", "Giagiaphobia", "Giaourtiophobia", "Gigantasophobia", "Gigaphobia", "Gingerbreadphobia", "Gingerphobia", "Giortiphobia", "Glaucophobia", "Gleifitzouriphobia", "Globophobia", "Gloriaphobia", "Glossaphobia", "Glossophobia", "Gnosiophobia", "Gohiphobia", "Gokarrophobia", "Golfkarrophobia", "Gonatophobia", "Goneaphobia", "Googlephobia", "Googolphobia", "Goshuphobia", "Gouwuchephobia", "Grafeiophobia", "Grammaphobia", "Grammatosimophobia", "Grandophobia", "Graphophobia", "Grasartophobia", "Gratiarophobia", "Grothophobia", "Gufuphobia", "Gumballphobia", "Gumuphobia", "Gustatophobia", "Gyaliailiouphobia", "Gyaliaphobia", "Gymnasiphobia", "Gymnophobia", "Gynephobia", "Gynophobia", "Hachihiphobia", "Hachishuphobia", "Hadephobia", "Hagiophobia", "Haiwangphobia", "Halitophobia", "Halophobia", "Hamartophobia", "Hamburgerphobia", "Handcuffphobia", "Haphephobia", "Haptephobia", "Harpaxophobia", "Hatchbackphobia", "Hauntophobia", "Headphonophobia", "Hearingaidphobia", "Hebephobia", "Hedgetrophobia", "Hedonophobia", "Heftakosioitessarakontaheptaphobia", "Heitophobia", "Heizgephobia", "Hekatenenekontahenophobia", "Hekatohendecaphobia", "Hekatophobia", "Helicoptophobia", "Heliophobia", "Hellenologophobia", "Helminthophobia", "Hemaphobia", "Hematophobia", "Hemophobia", "Hendecaphobia", "Henophobia", "Heortophobia", "Heptadecaphobia", "Heptaphobia", "Hereiophobia", "Heresyphobia", "Herophobia", "Herpetophobia", "Hetaphobia", "Heterophobia", "Hevimetaruphobia", "Hexadecaphobia", "Hexakosioihekkaidekaphobia", "Hexakosioihexekontahexaphobia", "Hexaphobia", "Hexekontadyophobia", "Hexekontenneaphobia", "Hibernicaphobia", "Hierophobia", "Hippophobia", "Hippopotomonstrosesquipedaliophobia", "Hippopotomonstrosesquippedaliophobia", "Hiskophobia", "Hispanophobia", "Historophobia", "Hobophobia", "Hockeyphobia", "Hodophobia", "Hollywoodphobia", "Homerphobia", "Homichlophobia", "Homilophobia", "Hominophobia", "Homophobia", "Hoofdaphobia", "Hoplophobia", "Horametophobia", "Hormephobia", "Hosephobia", "Housemusikaphobia", "Humidophobia", "Huochephobia", "Hyalophobia", "Hydrargyophobia", "Hydrophobia", "Hydrophobophobia", "Hyelophobia", "Hygeiophobia", "Hygrophobia", "Hylephobia", "Hylophobia", "Hypegiaphobia", "Hypengyophobia", "Hypnophobia", "Hypsiphobia", "Iatrophobia", "Ichthyophobia", "Iconophobia", "Ideophobia", "Igniterroremophobia", "Iliakosystimaphobia", "Illyngophobia", "Imeratoupateraphobia", "Imerologiophobia", "Imifortigophobia", "Imparnumerophobia", "Implexaphobia", "Incestophobia", "Indianophobia", "Indophobia", "Infantophobia", "Insectophobia", "Intercomphobia", "Internetphobia", "Iophobia", "Iotaphobia", "Iowaphobia", "Ipovlopsychophobia", "Ironmanphobia", "Islamophobia", "Isolophobia", "Isopterophobia", "Itaphobia", "Ithyphallophobia", "Jackboxophobia", "Japanophobia", "Jellybeanphobia", "Jesusophobia", "Jettophobia", "Jingchephobia", "Jinmuphobia", "Jinxiphobia", "Jipuphobia", "Jiufuphobia", "Jiuhuphobia", "Jiuyuephobia", "Jocophobia", "Jotaphobia", "Judeophobia", "Jugohiphobia", "Jugoshuphobia", "Juhiphobia", "Jukeboxophobia", "Junihiphobia", "Junishuphobia", "Junkcibophobia", "Jusanhiphobia", "Jusanshuphobia", "Jushuphobia", "Juyonhiphobia", "Juyonshuphobia", "Kactosophobia", "Kafetiphobia", "Kainolophobia", "Kainophobia", "Kakologophobia", "Kakoneirophobia", "Kakophobia", "Kakorrhaphiophobia", "Kalampokiphobia", "Kaltsaphobia", "Kamarakiphobia", "Kampanaphobia", "Kanayaphobia", "Kansasphobia", "Kantoriphobia", "Kapelaphobia", "Kappaphobia", "Karazphobia", "Karotsakiphobia", "Kasoniphobia", "Kassaphobia", "Kastanophobia", "Katagelophobia", "Katarraktiphobia", "Kathisophobia", "Katournmaphobia", "Katourophobia", "Katsaridaphobia", "Katsavidiphobia", "Kefalalgiaphobia", "Kefaliphobia", "Kenophobia", "Kentuckyphobia", "Keraphobia", "Keraunophobia", "Keriphobia", "Kermitphobia", "Ketsapphobia", "Keyaiphobia", "Kheimonphobia", "Khenphobia", "Kifnaphobia", "Kilnphobia", "Kinemortophobia", "Kinesophobia", "Kinetophobia", "Kleidariaphobia", "Kleidiphobia", "Kleptophobia", "Koinoloutrophobia", "Koinoniphobia", "Kollaphobia", "Koloniaphobia", "Kolpophobia", "Kombiphobia", "Komoidaphobia", "Koniophobia", "Konsentophobia", "Kopophobia", "Kosmemophobia", "Kosmikophobia", "Koterophobia", "Koumpiphobia", "Kouvaphobia", "Kouziphobia", "Kryptophobia", "Kuhiphobia", "Kushuphobia", "Kyknophobia", "Kymophobia", "Kynophobia", "Kyphophobia", "Kyriaclausophobia", "Kyriakiphobia", "Kyrofelonoshophobia", "Laboratoryphobia", "Lachanophobia", "Ladderphobia", "Laetophobia", "Lajichephobia", "Laliophobia", "Lalophobia", "Lambdaphobia", "Lampaphobia", "Lastichophobia", "Lateriphobia", "Lathophobia", "Latrophobia", "Lechophobia", "Lectotaphobia", "Lemmaparcophobia", "Lemoniphobia", "Lentophobia", "Leophobia", "Lepidopterophobia", "Lepidoptophobia", "Leporiphobia", "Lepraphobia", "Leprophobia", "Leptophobia", "Lesbophobia", "Leukophobia", "Levophobia", "Lexicophobia", "Libertatophobia", "Librariophobia", "Lickophobia", "Ligamentophobia", "Lighterphobia", "Ligyrophobia", "Lihaiphobia", "Lilapsophobia", "Limnophobia", "Limophobia", "Linonophobia", "Linyuphobia", "Lipophobia", "Liticaphobia", "Liuyuephobia", "Lockerphobia", "Lockiophobia", "Lodiculaphobia", "Logicomechanibiophobia", "Logizomechanophobia", "Logocrisiaphobia", "Logophobia", "Loukanikophobia", "Loukoumaphobia", "Loutrophobia", "Ludectrophobia", "Ludilophobia", "Ludophobia", "Luiphobia", "Lumenophobia", "Lupophobia", "Luposlipaphobia", "Lutraphobia", "Lygophobia", "Lysbrytophobia", "Lyssophobia", "Macaroniphobia", "Macilentophobia", "Macilentopuellaphobia", "Macrophobia", "Mageiachaliphobia", "Mageireiophobia", "Mageirocophobia", "Magikoravdiphobia", "Magionezaphobia", "Maieusiophobia", "Malaxophobia", "Maleficiphobia", "Mallitigriaphobia", "Mamillaphobia", "Mammophobia", "Manholephobia", "Maniaphobia", "Manussiccusphobia", "Mappophobia", "Mariophobia", "Maschaliphobia", "Mastigophobia", "Mastrophobia", "Materteraphobia", "Matertrophobia", "Mathemaphobia", "Mathemophobia", "Matrophobia", "Matterphobia", "Mavorsphobia", "Mcdonaldphobia", "Mcdonaldsphobia", "Mechanophobia", "Mediaphobia", "Medomalacuphobia", "Medorthophobia", "Megalophobia", "Meganumerophobia", "Megaphobia", "Megaphonophobia", "Melanoheliophobia", "Melanophobia", "Meleagrisphobia", "Melissophobia", "Melophobia", "Meningitophobia", "Menophobia", "Mentaophobia", "Mephitophobia", "Mercerophobia", "Merinthophobia", "Mestoselenophobia", "Metallophobia", "Metathesiophobia", "Meteorophobia", "Methyphobia", "Metrophobia", "Mexicanophobia", "Miamiphobia", "Mibliphobia", "Michiganphobia", "Mickeyphobia", "Microbiophobia", "Micronumerophobia", "Microphobia", "Microphonophobia", "Microscopophobia", "Microvophobia", "Midenoraphobia", "Milliphobia", "Milophobia", "Mingwangphobia", "Minicelarophobia", "Minnesotaphobia", "Misophobia", "Mnemophobia", "Mollephobia", "Molysmophobia", "Molysomophobia", "Molyviphobia", "Monarchiphobia", "Monopathophobia", "Monophobia", "Monoxeidioanthrakaphobia", "Mooglophobia", "Morophobia", "Moscholemonophobia", "Motorcyclophobia", "Motorphobia", "Mottephobia", "Moustardaphobia", "Muffinphobia", "Mugouphobia", "Multiversophobia", "Muphobia", "Muriphobia", "Murophobia", "Muscaphobia", "Musophobia", "Muxiphobia", "Mycophobia", "Mycrologophobia", "Mycrophobia", "Myctophobia", "Myoclunusdiagphragmaphobia", "Myrmecophobia", "Mysophobia", "Mythophobia", "Mytiphobia", "Myxophobia", "N00Bophobia", "Nachophobia", "Naitosutandophobia", "Nanathiphobia", "Nanatshuphobia", "Natatophobia", "Natredemphobia", "Naturophobia", "Naviphobia", "Nebulaphobia", "Necrophobia", "Nefarophobia", "Nefrophobia", "Negrophobia", "Nelophobia", "Neoannophobia", "Neologistophobia", "Neopharmaphobia", "Neophobia", "Nephophobia", "Neraidaphobia", "Nessaphobia", "Nevophobia", "Nibliphobia", "Nickelphobia", "Nightmareelmstreetphobia", "Nintendophobia", "Nipiophobia", "Nipponophobia", "Nivisphobia", "Noctiphobia", "Noctuaphobia", "Nojescentrophobia", "Nomatophobia", "Nomophobia", "Nonagintannophobia", "Nonagintaphobia", "Nonamophobia", "Noreiophobia", "Nosemaphobia", "Nosocomephobia", "Nosokomphobia", "Nosomentophobia", "Nosophobia", "Nostophobia", "Notiophobia", "Notiopolophobia", "Notophobia", "Novercaphobia", "Nucleomituphobia", "Nudophobia", "Numerophobia", "Nuphobia", "Nuxphobia", "Nyctohylophobia", "Nyctophobia", "Nyctourinariphobia", "Obesophobia", "Oblitophobia", "Ochlophobia", "Ochophobia", "Octodecaphobia", "Octogintannophobia", "Octogintaphobia", "Octokontaheptaphobia", "Octophobia", "Odigoleoforeiouphobia", "Odigotaxiphobia", "Odontophobia", "Odynephobia", "Odynophobia", "Oenophobia", "Officinaphobia", "Ohiophobia", "Ohiphobia", "Oikophobia", "Oklahomaphobia", "Oktooraphobia", "Olfactophobia", "Olympicphobia", "Omalonumerophobia", "Ombrophobia", "Omegaphobia", "Omicronphobia", "Ommatophobia", "Ommetaphobia", "Omphalophobia", "Oneirogmophobia", "Oneirophobia", "Oneiropolimaphobia", "Onomatophobia", "Onuxophobia", "Ophidiophobia", "Ophthalmophobia", "Opinatophobia", "Opiophobia", "Optophobia", "Oratoparophobia", "Orbophobia", "Ordclaviphobia", "Oregonphobia", "Orlandophobia", "Ornithophobia", "Orophobia", "Orthodontophobia", "Orthophobia", "Osmophobia", "Osouriphobia", "Osphresiophobia", "Ostraconophobia", "Otaspidaphobia", "Oudenophobia", "Oulinophobia", "Ouranophobia", "Ouritiriophobia", "Ovaphobia", "Ovinaphobia", "Pachydermophobia", "Pactorbophobia", "Pagophobia", "Pagotophobia", "Paliophobia", "Pallamagliophobia", "Panophobia", "Panphobia", "Panteloniphobia", "Panthophobia", "Pantophobia", "Pantreiaphobia", "Papagalophobia", "Papaphobia", "Papoutsiphobia", "Pappoudephobia", "Pappousophobia", "Papyrophobia", "Paralipophobia", "Paramediphobia", "Paranumerophobia", "Paraphobia", "Parasitophobia", "Paraskavedekatriaphobia", "Paraskeviphobia", "Pardalophobia", "Parthenophobia", "Parturiphobia", "Paschakounephobia", "Paschaphobia", "Patatakiphobia", "Pathophobia", "Patricophobia", "Patroiophobia", "Patrophobia", "Patruusphobia", "Payphonophobia", "Peccatophobia", "Pectusspemophobia", "Pediculophobia", "Pediophobia", "Pedophobia", "Peladophobia", "Pellagrophobia", "Pemmaphobia", "Pemptiphobia", "Peniaphobia", "Pennyphobia", "Pentaphobia", "Penteoraphobia", "Pentheraphobia", "Peregrinophobia", "Periculophobia", "Persicophobia", "Perstilbospherphobia", "Pertussaphobia", "Petaphobia", "Petraphobia", "Pezodromiophobia", "Phagophobia", "Phalacrophobia", "Phallophobia", "Pharmacophobia", "Pharsaphobia", "Phasmophobia", "Phengophobia", "Philemaphobia", "Philematophobia", "Philophobia", "Philosophobia", "Philosophophobia", "Phiphobia", "Phobophobia", "Phonophobia", "Phopinaciphobia", "Photoaugliaphobia", "Photographophobia", "Photophobia", "Phronemophobia", "Phthiriophobia", "Phthisiophobia", "Phyllophobia", "Physophobia", "Piatophobia", "Pibliphobia", "Pictophobia", "Pigkouinophobia", "Pigmentumphobia", "Pilotophobia", "Pinchophobia", "Pingpongphobia", "Piperiphobia", "Piphobia", "Piptophobia", "Pistaphobia", "Pistotikikartaphobia", "Pithanophobia", "Pithecophobia", "Pizzaphobia", "Placophobia", "Plakidiophobia", "Planitiphobia", "Planophobia", "Plestruinophobia", "Plutophobia", "Pluvifrigophobia", "Pluviophobia", "Plyntiphobia", "Pneumatiphobia", "Pnevmaphobia", "Pnevmonaphobia", "Pnigerophobia", "Pnigophobia", "Pocrescophobia", "Podophobia", "Pogonophobia", "Poinephobia", "Poképhobia", "Polemophobia", "Polikiarkoudaphobia", "Poliosophobia", "Politicophobia", "Polonophobia", "Polyphobia", "Ponophobia", "Poolphobia", "Popcornphobia", "Porcophobia", "Porphyrophobia", "Portbankazphobia", "Porthmeiophobia", "Portokaliphobia", "Postalphobia", "Posthocalyptrophobia", "Potamophobia", "Potophobia", "Poukamisophobia", "Pragmaticophobia", "Prasinophobia", "Praxiphobia", "Prefeciphobia", "Presiphobia", "Prigkipaphobia", "Primotitusheteronumerophobia", "Printerphobia", "Procellaphobia", "Procerophobia", "Proctophobia", "Prophetophobia", "Proschophobia", "Prosophobia", "Prosopophobia", "Protologistophobia", "Pruritophobia", "Psalidiphobia", "Psellismophobia", "Pseudodysphagia", "Psomiphobia", "Psychophobia", "Psychrophobia", "Psygephobia", "Pteridophobia", "Pteromerhanophobia", "Pteronophobia", "Puellaphobia", "Puerophobia", "Pugophobia", "Pumaphobia", "Pumppuphobia", "Pungophobia", "Pupaphobia", "Puraskisiphobia", "Purgamentophobia", "Purinsumphobia", "Pyliphobia", "Pyrexiophobia", "Pyrophobia", "Pyrosvestisphobia", "Pyrotechnimaphobia", "Pyrsophobia", "Qichuanphobia", "Qiyuephobia", "Qoppaphobia", "Quadragintannophobia", "Quadragintaphobia", "Quadraphobia", "Quadricentumphobia", "Quadriplegiphobia", "Quarterphobia", "Quattuordecimphobia", "Quesadillaphobia", "Queunliskanphobia", "Quincentumphobia", "Quindecimphobia", "Quinquagintannophobia", "Quinquagintaphobia", "Quintaphobia", "Radiophobia", "Ranidaphobia", "Rasemaphobia", "Receiptphobia", "Rectophobia", "Regnatophobia", "Regnophobia", "Renwuphobia", "Reshuiqiphobia", "Retainerphobia", "Retrophobia", "Revmagrammiphobia", "Rhabdophobia", "Rhodophobia", "Rhophobia", "Rhypophobia", "Rhytiphobia", "Ribliphobia", "Rigatoniphobia", "Ringophobia", "Robophobia", "Rokkuphobia", "Rokuhiphobia", "Rokushuphobia", "Rollerskatephobia", "Romantikophobia", "Rudolphophobia", "Rundfuphobia", "Rupophobia", "Russophobia", "Ryziphobia", "Saccharophobia", "Saichephobia", "Sakidiophobia", "Sakoulaphobia", "Salutecibophobia", "Samhainophobia", "Sanbatianphobia", "Sanguivoriphobia", "Sanqitianphobia", "Sansantianphobia", "Sansertianphobia", "Sanshitianphobia", "Sansitianphobia", "Santaphobia", "Santianphobia", "Sanwutianphobia", "Sanxingqiphobia", "Sanyitianphobia", "Sanyuephobia", "Sarmassophobia", "Satanophobia", "Savvatophobia", "Saxophonophobia", "Scabiophobia", "Scatophobia", "Scelerophibia", "Scelerophobia", "Scharaphobia", "Schulkamophobia", "Scientophobia", "Sciophobia", "Sciophobia Sciaphobia", "Sciurophobia", "Scoleciphobia", "Scolionophobia", "Scolopendrphobia", "Scoobyphobia", "Scooterphobia", "Scopophobia", "Scoptophobia", "Scotomaphobia", "Scotophobia", "Scriniaphobia", "Scriptophobia", "Scyphophobia", "Scythephobia", "Secundophobia", "Sedanphobia", "Sedetaphobia", "Segaphobia", "Seirinaphobia", "Seismoaskisiphobia", "Seismophobia", "Selachophobia", "Selaphobia", "Selenophobia", "Semiphobia", "Semirophobia", "Seplophobia", "Septicentumphobia", "Septuagintannophobia", "Septuagintaphobia", "Serenephobia", "Serenophobia", "Servitorphobia", "Sesquipedalophobia", "Sexagintaphobia", "Sexatannophobia", "Sexophobia", "Sexticentumphobia", "Sfoungaristraphobia", "Sfyriphobia", "Sheijiphobia", "Shibatianphobia", "Shibazhouphobia", "Shieryuephobia", "Shijiphobia", "Shijiutianphobia", "Shijiuzhouphobia", "Shiliutianphobia", "Shiliuzhouphobia", "Shiyuephobia", "Shuicaophobia", "Shuixphobia", "Sibliphobia", "Siderodromophobia", "Siderophobia", "Sidonglobophobia", "Sifounaskisiphobia", "Sigmaphobia", "Simaphobia", "Sinistrophobia", "Sinophobia", "Siropiphobia", "Sishiphobia", "Sishiyiphobia", "Sitiophobia", "Sitophobia", "Siyuephobia", "Skataphobia", "Skateboardphobia", "Skelephobia", "Skoupaphobia", "Snakephobia", "Soceraphobia", "Social Phobia", "Sociophobia", "Soloiphobia", "Somniphobia", "Sonicphobia", "Sophophobia", "Sororophobia", "Sostophobia", "Soteriophobia", "Soupaphobia", "Spacephobia", "Spacesuitphobia", "Spaghettiphobia", "Spasmenagaliaphobia", "Spectrophobia", "Speedomophobia", "Spermatophobia", "Spermophobia", "Spheksophobia", "Spidermanphobia", "Spirituphobia", "Spirtophobia", "Spoudastophobia", "Spousophobia", "Sprinklerphobia", "Stasibasiphobia", "Stasihyelophobia", "Stasiphobia", "Staurophobia", "Stavrodromiphobia", "Stenophobia", "Sternutaphobia", "Stickerphobia", "Stigiophobia", "Stomachphobia", "Stomaphobia", "Stubaphobia", "Stygiophobia", "Stylophobia", "Subterraneapremortephobia", "Supermanphobia", "Surdocaecophobia", "Surdophobia", "Suriphobia", "Symbolophobia", "Symmathitophobia", "Symmetrophobia", "Synaiphobia", "Syndetiraphobia", "Synergatiphobia", "Syngenesophobia", "Syntrivaniphobia", "Syphilophobia", "Syskeviphobia", "Tabulatophobia", "Tachophobia", "Tacophobia", "Taeniophobia", "Tallahasseephobia", "Tameiophobia", "Tamiaphobia", "Tampaphobia", "Tapetsariaphobia", "Taphephobia Taphophobia", "Taphophobia", "Tapinophobia", "Tarandophobia", "Tauphobia", "Taurophobia", "Tavernaphobia", "Taxiphobia", "Technophobia", "Tegophobia", "Teleiophobia", "Teleophobia", "Telephonophobia", "Telescopophobia", "Televisiophobia", "Tempophobia", "Teniophobia", "Tennesseephobia", "Tennophobia", "Teraphobia", "Teraphobia (2)", "Teratophobia", "Terramophobia", "Terraphobia", "Terrorphobia", "Tessarakontadyochilexintaphobia", "Tessarakontadyophobia", "Tesseraoraphobia", "Testophobia", "Tetanophobia", "Tetartiphobia", "Tetrakosioeikosiphobia", "Tetraphobia", "Teutophobia", "Texasphobia", "Textophobia", "Thaasophobia", "Thalassophobia", "Thamnophobia", "Thanatophobia", "Thantophobia", "Thaumastikaphobia", "Thaumatophobia", "Theatrophobia", "Theologicophobia", "Theophobia", "Theriophobia", "Thermomophobia", "Thermophobia", "Thermostatphobia", "Therophobia", "Thesaurophobia", "Thinoporophobia", "Threskeophobia", "Thx Phobia", "Tiganitepatatephobia", "Tigriphobia", "Tilecheiristiriophobia", "Timidophobia", "Tingchechangphobia", "Tingchechekuphobia", "Toasterphobia", "Tocophobia", "Toichophobia", "Tokophobia", "Tomophobia", "Tongyiphobia", "Tonitrophobia", "Tonsurephobia", "Topophobia", "Toualetaphobia", "Touvlophobia", "Toxicophobia", "Toxiphobia", "Toxophobia", "Tractorphobia", "Transphobia", "Trapezaphobia", "Traumatophobia", "Tremophobia", "Triakontenneaphobia", "Triakosioitriakontatriophobia", "Triaoraphobia", "Tribophobia", "Tricentumphobia", "Trichinophobia", "Trichopathophobia", "Trichophobia", "Trigintannophobia", "Trigintiphobia", "Triskadekalogicomechanibiolupusiophobia", "Triskaidekaphobia", "Triskaphobia", "Tristophobia", "Tritiphobia", "Trochophobia", "Trokhophobia", "Trompetaphobia", "Tronicteliponitrianirikssiophobia", "Trophophobia", "Tropophobia", "Trumphobia", "Trumptrichophobia", "Trypanophobia", "Trypophobia", "Tsantakiphobia", "Tsunamiphobia", "Tuberculophobia", "Tuochephobia", "Turbophobia", "Turcophobia", "Turophobia", "Tuxiphobia", "Tychophobia", "Tympanophobia", "Tyrannophobia", "Umbrellaphobia", "Universophobia", "Upsilonphobia", "Uranophobia", "Urophobia", "Utahphobia", "Vacansopapurosophobia", "Vaccinophobia", "Vaflaphobia", "Vagoniphobia", "Valantiophobia", "Valentinophobia", "Valitsaphobia", "Vanillaphobia", "Vasiliaphobia", "Vasilissaphobia", "Vasilopoulaphobia", "Veganphobia", "Veloxrotaphobia", "Venustraphobia", "Verbophobia", "Verkeintriphobia", "Verminophobia", "Vestiphobia", "Vialacteaphobia", "Victophobia", "Victorophobia", "Videocassettophobia", "Viemaphobia", "Vigintannophobia", "Vigintiphobia", "Vigintiunusphobia", "Vinitophobia", "Vinylophobia", "Violiphobia", "Virginiaphobia", "Virginitiphobia", "Virguphobia", "Viriditaphobia", "Virophobia", "Vitricophobia", "Vodinophobia", "Voedsephobia", "Volanphobia", "Volcanophobia", "Volleyballphobia", "Voreiospolophobia", "Vorraphobia", "Vothrophobia", "Voutimaphobia", "Voutyrophobia", "Waifuphobia", "Waizuphobia", "Walloonphobia", "Walmartophobia", "Wanjuwuphobia", "Washingtonphobia", "Wauphobia", "Weltmusikophobia", "Wheelchairphobia", "Wiccaphobia", "Wiiphobia", "Wikipediaphobia", "Wikiphobia", "Wuophobia", "Wuyuephobia", "X-Menphobia", "Xaderfophobia", "Xafniasmaphobia", "Xanthophobia", "Xarantaphobia", "Xenoglossophobia", "Xenophobia", "Xerophobia", "Xettophobia", "Xiaofaphobia", "Xinxiangphobia", "Xocolataphobia", "Xotikophobia", "Xuegachephobia", "Xylophobia", "Xylophonophobia", "Xypnitiriphobia", "Xyrophobi", "Xyrophobia", "Yedengphobia", "Ygrophobia", "Yifuphobia", "Yimuphobia", "Yinjiphobia", "Yinshuijiphobia", "Yixingqiphobia", "Yiyuephobia", "Ymophobia", "Yonhiphobia", "Yonshuphobia", "Yotaphobia", "Yottaphobia", "Ypnodomatiophobia", "Ypokatastimaphobia", "Yubinshaphobia", "Yupenphobia", "Yushuaphobia", "Zapsaulphobia", "Zariphobia", "Zelatiniphobia", "Zelophobia", "Zemmiphobia", "Zetaphobia", "Zettaphobia", "Zeusophobia", "Zhongophobia", "Zidongshophobia", "Zixiechephobia", "Zizanmephobia", "Zomaiphobia", "Zoniasfaleiaphobia", "Zoolophobia", "Zoophobia", "Zorevophobia", "Zufuphobia", "Zuigerphobia", "Zumuphobia", "Zygariaphobia", "Zymarikaphobia", "Zythophobia", "Anachrophobia", "Anoraknophobia", "Claustrommetaphobia", "Keanuphobia", "Lunaediesophobia", "Monkeyphobia", "Nihilophobia", "Semaphobia", "Aelurophobia", "Caninophobia", "Melissaphobia", "Skunkphobia", "Serpentophobia", "Elephaphobia", "Vermiphobia", "Cnidarophobia", "Karpophobia", "Hypertrichophobia", "Thelephobia", "Naevophobia", "Urinophobia", "Masculophobia", "Pinguisophobia", "Gynaphobia", "Ferminaphobia", "Feminophobia", "Macilentogynophobia", "Paedophobia", "Pediaphobia", "Agorocoritsophobia", "Policophobia", "Korephobia", "Doctorphobia", "Clausophobia", "Chinesophobia", "Cinemaphobia", "Oestephobia", "Nortephobia", "Surphobia", "Akraphobia", "Bounophobia", "Coponaphobia", "Ammosophobia", "Aphephobia", "Thixophobia", "Ekriphobia", "Kaiomaphobia", "Kaiophobia", "Errophobia", "Flatuphobia", "Simbosiophobia", "Gronthokopophobia", "Joculophobia", "Lambophobia", "Medomalacophobia", "Singultophobia", "Dediscophobia", "Paraskevidekatriaphobia", "Tussaphobia", "Taphephobia", "Traumaphobia", "Pavidophobia", "Maestophobia", "Athlematophobia", "Klinephobia", "Kranophobia", "Elevaphobia", "Escalatophobia", "Roltraphobia", "Mensamophobia", "Kerasophobia", "Teganophobia", "Photaugiaphobia", "Photaugiophobia", "Robotaphobia", "Sciaphobia", "Vestiophobia", "Argentophobia", "Karamelaphobia", "Suaviphobia", "Lactophobia", "Lactaphobia", "Navisphobia", "Semitrophobia", "Uniphobia", "Subordinatephobia", "Nudaphobia", "Fulgophobia", "Tempestaphobia", "Remaphobia", "Lunaphobia", "Chlorophobia", "Megalogophobia", "Koppaphobia", "Dubbaphobia", "Diphobia", "Nonaphobia", "Centumphobia", "Unophobia", "Heptaidekaphobia", "Septaphobia", "Hekkaidekaphobia", "Sexaphobia", "Octaidekaphobia", "Nilophobia", "Terdecaphobia", "Triophobia", "Triphobia", "Kryptozoophobia", "Monstrophobia"};
    
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NameField = new javax.swing.JTextField();
        JobField = new javax.swing.JTextField();
        DDField = new javax.swing.JTextField();
        StatusField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        OSexField = new javax.swing.JTextField();
        ORomField = new javax.swing.JTextField();
        OAltField = new javax.swing.JTextField();
        OGenField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        ESexField = new javax.swing.JTextField();
        ERomField = new javax.swing.JTextField();
        EAltField = new javax.swing.JTextField();
        EGenField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        L1Field = new javax.swing.JTextField();
        L2Field = new javax.swing.JTextField();
        L3Field = new javax.swing.JTextField();
        L4Field = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        RedField = new javax.swing.JTextField();
        OraField = new javax.swing.JTextField();
        YelField = new javax.swing.JTextField();
        GreField = new javax.swing.JTextField();
        AllField = new javax.swing.JTextField();
        PinField = new javax.swing.JTextField();
        PurField = new javax.swing.JTextField();
        BluField = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        A1Field = new javax.swing.JTextField();
        A2Field = new javax.swing.JTextField();
        A3Field = new javax.swing.JTextField();
        A4Field = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        MBTIField = new javax.swing.JTextField();
        FearField = new javax.swing.JTextField();
        EnneaField = new javax.swing.JTextField();
        HogwartsField = new javax.swing.JTextField();
        PassField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        FRColorField = new javax.swing.JTextField();
        FRFamsField = new javax.swing.JTextField();
        PrigField = new javax.swing.JTextField();
        SecgField = new javax.swing.JTextField();
        TertgField = new javax.swing.JTextField();
        AllGField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        AgeField = new javax.swing.JTextField();
        FlightField = new javax.swing.JTextField();
        VirtueField = new javax.swing.JTextField();
        ViceField = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        VAdjField = new javax.swing.JTextField();
        AccentField = new javax.swing.JTextField();
        LangField = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        PetField = new javax.swing.JTextField();
        PetField1 = new javax.swing.JTextField();
        RelatField = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        PP1Field = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        PP2Field = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        NPC1Field = new javax.swing.JTextField();
        NPC2Field = new javax.swing.JTextField();
        NPC3Field = new javax.swing.JTextField();
        NPC4Field = new javax.swing.JTextField();
        RandomButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        MadeByButton = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        TarotField = new javax.swing.JTextField();
        SolarField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        IMGField = new javax.swing.JTextField();
        URLField = new javax.swing.JTextField();
        IMGnURLGenerateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        IMGURLOutputField = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        DIDIMGField = new javax.swing.JTextField();
        DragonImagesGenerateButton = new javax.swing.JButton();
        AvatarField = new javax.swing.JTextField();
        MiniField = new javax.swing.JTextField();
        NormalField = new javax.swing.JTextField();
        LinkButton = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        DIDSkinField = new javax.swing.JTextField();
        SkinNumberField = new javax.swing.JTextField();
        SkinPreviewButton = new javax.swing.JButton();
        PreviewField = new javax.swing.JTextField();
        PreviewWIMGField = new javax.swing.JTextField();
        OpenSkinPreviewButton = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        ZDayField = new javax.swing.JTextField();
        ZMonthField = new javax.swing.JComboBox<>();
        ZYearField = new javax.swing.JComboBox<>();
        ZCalcButton = new javax.swing.JButton();
        WesternZodiacField = new javax.swing.JTextField();
        ChineseZodiacField = new javax.swing.JTextField();
        ZPlanetField = new javax.swing.JTextField();
        ZElementField = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        TitleField1 = new javax.swing.JTextField();
        SpinnerField1 = new javax.swing.JSlider();
        EnabledField1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RPGOutputField = new javax.swing.JTextArea();
        jPanel20 = new javax.swing.JPanel();
        TotalSkillField = new javax.swing.JTextField();
        ChChField = new javax.swing.JTextField();
        UchChField = new javax.swing.JTextField();
        ChCoField = new javax.swing.JTextField();
        UchCoField = new javax.swing.JTextField();
        RPGRandomizeButton = new javax.swing.JButton();
        ExactField = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        TitleField2 = new javax.swing.JTextField();
        SpinnerField2 = new javax.swing.JSlider();
        EnabledField2 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        TitleField3 = new javax.swing.JTextField();
        SpinnerField3 = new javax.swing.JSlider();
        EnabledField3 = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        TitleField5 = new javax.swing.JTextField();
        SpinnerField5 = new javax.swing.JSlider();
        EnabledField5 = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        TitleField7 = new javax.swing.JTextField();
        SpinnerField7 = new javax.swing.JSlider();
        EnabledField7 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        TitleField6 = new javax.swing.JTextField();
        SpinnerField6 = new javax.swing.JSlider();
        EnabledField6 = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        TitleField8 = new javax.swing.JTextField();
        SpinnerField8 = new javax.swing.JSlider();
        EnabledField8 = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        TitleField9 = new javax.swing.JTextField();
        SpinnerField9 = new javax.swing.JSlider();
        EnabledField9 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        TitleField10 = new javax.swing.JTextField();
        SpinnerField10 = new javax.swing.JSlider();
        EnabledField10 = new javax.swing.JRadioButton();
        jPanel30 = new javax.swing.JPanel();
        TitleField11 = new javax.swing.JTextField();
        SpinnerField11 = new javax.swing.JSlider();
        EnabledField11 = new javax.swing.JRadioButton();
        jPanel32 = new javax.swing.JPanel();
        TitleField13 = new javax.swing.JTextField();
        SpinnerField13 = new javax.swing.JSlider();
        EnabledField13 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        TitleField12 = new javax.swing.JTextField();
        SpinnerField12 = new javax.swing.JSlider();
        EnabledField12 = new javax.swing.JRadioButton();
        RPGGenerateButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Basic Traits"));

        NameField.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));

        JobField.setBorder(javax.swing.BorderFactory.createTitledBorder("Job"));

        DDField.setBorder(javax.swing.BorderFactory.createTitledBorder("D&D Alignment"));

        StatusField.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(JobField)
                    .addComponent(DDField)
                    .addComponent(StatusField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Original"));

        OSexField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexuality"));

        ORomField.setBorder(javax.swing.BorderFactory.createTitledBorder("Romantic Orientation"));

        OAltField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterous"));

        OGenField.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OSexField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(ORomField)
                    .addComponent(OAltField)
                    .addComponent(OGenField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(OSexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ORomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OAltField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OGenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Expanded"));

        ESexField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexuality"));

        ERomField.setBorder(javax.swing.BorderFactory.createTitledBorder("Romantic Orientation"));

        EAltField.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterous"));

        EGenField.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ESexField, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(ERomField)
                    .addComponent(EAltField)
                    .addComponent(EGenField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(ESexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ERomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EAltField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EGenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Likes/Dislikes"));

        L1Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Like 1"));
        L1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1FieldActionPerformed(evt);
            }
        });

        L2Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Like 2"));

        L3Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Dislike 1"));

        L4Field.setBorder(javax.swing.BorderFactory.createTitledBorder("Dislike 2"));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L1Field, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(L2Field)
                    .addComponent(L3Field)
                    .addComponent(L4Field, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(L1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Items"));

        RedField.setBorder(javax.swing.BorderFactory.createTitledBorder("Red"));

        OraField.setBorder(javax.swing.BorderFactory.createTitledBorder("Orange"));

        YelField.setBorder(javax.swing.BorderFactory.createTitledBorder("Yellow"));

        GreField.setBorder(javax.swing.BorderFactory.createTitledBorder("Green"));

        AllField.setBorder(javax.swing.BorderFactory.createTitledBorder("All"));

        PinField.setBorder(javax.swing.BorderFactory.createTitledBorder("Pink"));

        PurField.setBorder(javax.swing.BorderFactory.createTitledBorder("Purple"));

        BluField.setBorder(javax.swing.BorderFactory.createTitledBorder("Blue"));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RedField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(OraField)
                    .addComponent(YelField)
                    .addComponent(GreField))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(AllField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PurField)
                    .addComponent(PinField)
                    .addComponent(BluField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(BluField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PurField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(RedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Adjectives"));

        A1Field.setBorder(javax.swing.BorderFactory.createTitledBorder("1"));
        A1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1FieldActionPerformed(evt);
            }
        });

        A2Field.setBorder(javax.swing.BorderFactory.createTitledBorder("2"));

        A3Field.setBorder(javax.swing.BorderFactory.createTitledBorder("3"));

        A4Field.setBorder(javax.swing.BorderFactory.createTitledBorder("4"));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1Field, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(A2Field)
                    .addComponent(A3Field)
                    .addComponent(A4Field, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(A1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Personality"));

        MBTIField.setBorder(javax.swing.BorderFactory.createTitledBorder("MBTI Type"));

        FearField.setBorder(javax.swing.BorderFactory.createTitledBorder("Fear"));
        FearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FearFieldActionPerformed(evt);
            }
        });

        EnneaField.setBorder(javax.swing.BorderFactory.createTitledBorder("Enneagram"));

        HogwartsField.setBorder(javax.swing.BorderFactory.createTitledBorder("Hogwarts & Ilvermorny"));

        PassField.setBorder(javax.swing.BorderFactory.createTitledBorder("Passion/Drive"));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MBTIField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnneaField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HogwartsField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FearField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassField)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MBTIField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(EnneaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(HogwartsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(FearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Flight-Rising Specific"));

        FRColorField.setBorder(javax.swing.BorderFactory.createTitledBorder("Flight Rising Color"));

        FRFamsField.setBorder(javax.swing.BorderFactory.createTitledBorder("Flight Rising Familiar"));

        PrigField.setBorder(javax.swing.BorderFactory.createTitledBorder("Primary Gene"));

        SecgField.setBorder(javax.swing.BorderFactory.createTitledBorder("Secondary Gene"));

        TertgField.setBorder(javax.swing.BorderFactory.createTitledBorder("Tertiary Gene"));

        AllGField.setBorder(javax.swing.BorderFactory.createTitledBorder("All Genes"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FRFamsField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(PrigField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecgField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TertgField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(FRColorField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AllGField)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(FRFamsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrigField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TertgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FRColorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AllGField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("More Stats"));

        AgeField.setBorder(javax.swing.BorderFactory.createTitledBorder("Age"));

        FlightField.setBorder(javax.swing.BorderFactory.createTitledBorder("Flight"));

        VirtueField.setBorder(javax.swing.BorderFactory.createTitledBorder("Virtue"));

        ViceField.setBorder(javax.swing.BorderFactory.createTitledBorder("Vice"));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgeField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(FlightField)
                    .addComponent(VirtueField)
                    .addComponent(ViceField))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FlightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VirtueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Voice Descriptors"));

        VAdjField.setBorder(javax.swing.BorderFactory.createTitledBorder("Adjective"));

        AccentField.setBorder(javax.swing.BorderFactory.createTitledBorder("Accent"));

        LangField.setBorder(javax.swing.BorderFactory.createTitledBorder("Language Spoken"));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LangField)
                    .addComponent(VAdjField)
                    .addComponent(AccentField))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VAdjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LangField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("User-Requested 2"));

        PetField.setBorder(javax.swing.BorderFactory.createTitledBorder("Normal Pet"));

        PetField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Normal Pet"));

        RelatField.setBorder(javax.swing.BorderFactory.createTitledBorder("Relationship"));
        RelatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(RelatField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PetField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PetField1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PetField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RelatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Pet Peeves/Bad Habits"));

        PP1Field.setColumns(20);
        PP1Field.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        PP1Field.setLineWrap(true);
        PP1Field.setRows(5);
        PP1Field.setWrapStyleWord(true);
        jScrollPane5.setViewportView(PP1Field);

        PP2Field.setColumns(20);
        PP2Field.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        PP2Field.setLineWrap(true);
        PP2Field.setRows(5);
        PP2Field.setWrapStyleWord(true);
        jScrollPane6.setViewportView(PP2Field);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Notable Physical Characteristics"));

        NPC1Field.setBorder(javax.swing.BorderFactory.createTitledBorder("1"));

        NPC2Field.setBorder(javax.swing.BorderFactory.createTitledBorder("2"));

        NPC3Field.setBorder(javax.swing.BorderFactory.createTitledBorder("3"));

        NPC4Field.setBorder(javax.swing.BorderFactory.createTitledBorder("4"));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NPC1Field)
                    .addComponent(NPC2Field)
                    .addComponent(NPC3Field, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NPC4Field))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(NPC1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPC2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPC3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPC4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        RandomButton.setText("Random");
        RandomButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RandomButton.setFocusable(false);
        RandomButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RandomButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.setFocusable(false);
        ExitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExitButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        MadeByButton.setText("Made by VolatileMatter");
        MadeByButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MadeByButton.setFocusable(false);
        MadeByButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MadeByButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MadeByButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MadeByButtonActionPerformed(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Space Stuff"));

        TarotField.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarot Card"));

        SolarField.setBorder(javax.swing.BorderFactory.createTitledBorder("Solar Body"));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TarotField, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(SolarField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TarotField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(RandomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MadeByButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RandomButton, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(MadeByButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Random Traits", jPanel5);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IMGField.setBorder(javax.swing.BorderFactory.createTitledBorder("IMG"));

        URLField.setBorder(javax.swing.BorderFactory.createTitledBorder("URL"));

        IMGnURLGenerateButton.setText("Generate");
        IMGnURLGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMGnURLGenerateButtonActionPerformed(evt);
            }
        });

        IMGURLOutputField.setColumns(20);
        IMGURLOutputField.setLineWrap(true);
        IMGURLOutputField.setRows(5);
        IMGURLOutputField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(IMGURLOutputField);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMGField)
                    .addComponent(URLField)
                    .addComponent(IMGnURLGenerateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IMGField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(URLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IMGnURLGenerateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DIDIMGField.setBorder(javax.swing.BorderFactory.createTitledBorder("Dragon ID Number"));

        DragonImagesGenerateButton.setText("Generate");
        DragonImagesGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DragonImagesGenerateButtonActionPerformed(evt);
            }
        });

        AvatarField.setBorder(javax.swing.BorderFactory.createTitledBorder("Avatar Image"));

        MiniField.setBorder(javax.swing.BorderFactory.createTitledBorder("Mini Image"));

        NormalField.setBorder(javax.swing.BorderFactory.createTitledBorder("Normal Image"));

        LinkButton.setBackground(new java.awt.Color(255, 255, 255));
        LinkButton.setSelected(true);
        LinkButton.setText("Link?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DIDIMGField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(AvatarField)
                    .addComponent(MiniField)
                    .addComponent(NormalField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DragonImagesGenerateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LinkButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DIDIMGField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DragonImagesGenerateButton)
                    .addComponent(LinkButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AvatarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NormalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DIDSkinField.setBorder(javax.swing.BorderFactory.createTitledBorder("Dragon ID Number"));

        SkinNumberField.setBorder(javax.swing.BorderFactory.createTitledBorder("Skin Number"));

        SkinPreviewButton.setText("Generate");
        SkinPreviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkinPreviewButtonActionPerformed(evt);
            }
        });

        PreviewField.setBorder(javax.swing.BorderFactory.createTitledBorder("Preview Link"));

        PreviewWIMGField.setToolTipText("");
        PreviewWIMGField.setBorder(javax.swing.BorderFactory.createTitledBorder("With IMG Tags"));

        OpenSkinPreviewButton.setText("Open");
        OpenSkinPreviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenSkinPreviewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DIDSkinField)
                    .addComponent(SkinNumberField)
                    .addComponent(SkinPreviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PreviewWIMGField)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(PreviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpenSkinPreviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DIDSkinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SkinNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SkinPreviewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PreviewField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenSkinPreviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PreviewWIMGField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ZDayField.setBorder(javax.swing.BorderFactory.createTitledBorder("Day Born"));

        ZMonthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        ZYearField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        ZCalcButton.setText("Calculate");
        ZCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZCalcButtonActionPerformed(evt);
            }
        });

        WesternZodiacField.setBorder(javax.swing.BorderFactory.createTitledBorder("Western Zodiac (Sun Sign)"));

        ChineseZodiacField.setBorder(javax.swing.BorderFactory.createTitledBorder("Chinese Zodiac"));

        ZPlanetField.setBorder(javax.swing.BorderFactory.createTitledBorder("Planet"));

        ZElementField.setToolTipText("");
        ZElementField.setBorder(javax.swing.BorderFactory.createTitledBorder("Element"));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZDayField)
                    .addComponent(ZMonthField, 0, 157, Short.MAX_VALUE)
                    .addComponent(ZYearField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ZCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WesternZodiacField)
                    .addComponent(ChineseZodiacField)
                    .addComponent(ZPlanetField)
                    .addComponent(ZElementField))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ZDayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZCalcButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WesternZodiacField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChineseZodiacField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZPlanetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZElementField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(901, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tools", jPanel6);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField1.setText("Magic");

        SpinnerField1.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField1.setMajorTickSpacing(1);
        SpinnerField1.setMaximum(10);
        SpinnerField1.setPaintLabels(true);
        SpinnerField1.setPaintTicks(true);
        SpinnerField1.setSnapToTicks(true);

        EnabledField1.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField1.setSelected(true);
        EnabledField1.setText("Enabled?");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(TitleField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField1))
                    .addComponent(SpinnerField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RPGOutputField.setColumns(20);
        RPGOutputField.setRows(5);
        jScrollPane1.setViewportView(RPGOutputField);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TotalSkillField.setText("50");
        TotalSkillField.setToolTipText("");
        TotalSkillField.setBorder(javax.swing.BorderFactory.createTitledBorder("Total # of skill points"));

        ChChField.setText("✦");
        ChChField.setBorder(javax.swing.BorderFactory.createTitledBorder("\"Checked\" Character"));

        UchChField.setText("✧");
        UchChField.setBorder(javax.swing.BorderFactory.createTitledBorder("\"Unchecked\" Character"));

        ChCoField.setText("BLACK");
        ChCoField.setBorder(javax.swing.BorderFactory.createTitledBorder("\"Checked\" Color"));

        UchCoField.setText("GREY");
        UchCoField.setBorder(javax.swing.BorderFactory.createTitledBorder("\"Unchecked\" Color"));

        RPGRandomizeButton.setText("Randomize!");
        RPGRandomizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPGRandomizeButtonActionPerformed(evt);
            }
        });

        ExactField.setBackground(new java.awt.Color(255, 255, 255));
        ExactField.setSelected(true);
        ExactField.setText("Use ALL skill points?");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(ExactField)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TotalSkillField)
                    .addComponent(ChChField)
                    .addComponent(UchChField)
                    .addComponent(ChCoField)
                    .addComponent(UchCoField)
                    .addComponent(RPGRandomizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TotalSkillField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExactField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChChField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UchChField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChCoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UchCoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RPGRandomizeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField2.setText("Strength");
        TitleField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField2ActionPerformed(evt);
            }
        });

        SpinnerField2.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField2.setMajorTickSpacing(1);
        SpinnerField2.setMaximum(10);
        SpinnerField2.setPaintLabels(true);
        SpinnerField2.setPaintTicks(true);
        SpinnerField2.setSnapToTicks(true);

        EnabledField2.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField2.setSelected(true);
        EnabledField2.setText("Enabled?");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(TitleField2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField2))
                    .addComponent(SpinnerField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField3.setText("Defense");
        TitleField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField3ActionPerformed(evt);
            }
        });

        SpinnerField3.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField3.setMajorTickSpacing(1);
        SpinnerField3.setMaximum(10);
        SpinnerField3.setPaintLabels(true);
        SpinnerField3.setPaintTicks(true);
        SpinnerField3.setSnapToTicks(true);

        EnabledField3.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField3.setSelected(true);
        EnabledField3.setText("Enabled?");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(TitleField3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField3))
                    .addComponent(SpinnerField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField5.setText("Charisma");
        TitleField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField5ActionPerformed(evt);
            }
        });

        SpinnerField5.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField5.setMajorTickSpacing(1);
        SpinnerField5.setMaximum(10);
        SpinnerField5.setPaintLabels(true);
        SpinnerField5.setPaintTicks(true);
        SpinnerField5.setSnapToTicks(true);

        EnabledField5.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField5.setSelected(true);
        EnabledField5.setText("Enabled?");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(TitleField5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField5))
                    .addComponent(SpinnerField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField7.setText("Health");
        TitleField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField7ActionPerformed(evt);
            }
        });

        SpinnerField7.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField7.setMajorTickSpacing(1);
        SpinnerField7.setMaximum(10);
        SpinnerField7.setPaintLabels(true);
        SpinnerField7.setPaintTicks(true);
        SpinnerField7.setSnapToTicks(true);

        EnabledField7.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField7.setSelected(true);
        EnabledField7.setText("Enabled?");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(TitleField7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField7))
                    .addComponent(SpinnerField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField6.setText("Intelligence");
        TitleField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField6ActionPerformed(evt);
            }
        });

        SpinnerField6.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField6.setMajorTickSpacing(1);
        SpinnerField6.setMaximum(10);
        SpinnerField6.setPaintLabels(true);
        SpinnerField6.setPaintTicks(true);
        SpinnerField6.setSnapToTicks(true);

        EnabledField6.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField6.setSelected(true);
        EnabledField6.setText("Enabled?");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(TitleField6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField6))
                    .addComponent(SpinnerField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField8.setText("Speed");
        TitleField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField8ActionPerformed(evt);
            }
        });

        SpinnerField8.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField8.setMajorTickSpacing(1);
        SpinnerField8.setMaximum(10);
        SpinnerField8.setPaintLabels(true);
        SpinnerField8.setPaintTicks(true);
        SpinnerField8.setSnapToTicks(true);

        EnabledField8.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField8.setSelected(true);
        EnabledField8.setText("Enabled?");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(TitleField8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField8))
                    .addComponent(SpinnerField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField9.setText("Agility");
        TitleField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField9ActionPerformed(evt);
            }
        });

        SpinnerField9.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField9.setMajorTickSpacing(1);
        SpinnerField9.setMaximum(10);
        SpinnerField9.setPaintLabels(true);
        SpinnerField9.setPaintTicks(true);
        SpinnerField9.setSnapToTicks(true);

        EnabledField9.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField9.setSelected(true);
        EnabledField9.setText("Enabled?");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(TitleField9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField9))
                    .addComponent(SpinnerField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField10.setText("Reflexes");
        TitleField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField10ActionPerformed(evt);
            }
        });

        SpinnerField10.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField10.setMajorTickSpacing(1);
        SpinnerField10.setMaximum(10);
        SpinnerField10.setPaintLabels(true);
        SpinnerField10.setPaintTicks(true);
        SpinnerField10.setSnapToTicks(true);

        EnabledField10.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField10.setSelected(true);
        EnabledField10.setText("Enabled?");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(TitleField10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField10))
                    .addComponent(SpinnerField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField11.setText("Luck");
        TitleField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField11ActionPerformed(evt);
            }
        });

        SpinnerField11.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField11.setMajorTickSpacing(1);
        SpinnerField11.setMaximum(10);
        SpinnerField11.setPaintLabels(true);
        SpinnerField11.setPaintTicks(true);
        SpinnerField11.setSnapToTicks(true);

        EnabledField11.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField11.setSelected(true);
        EnabledField11.setText("Enabled?");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(TitleField11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField11))
                    .addComponent(SpinnerField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField13.setText("Stamina");
        TitleField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField13ActionPerformed(evt);
            }
        });

        SpinnerField13.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField13.setMajorTickSpacing(1);
        SpinnerField13.setMaximum(10);
        SpinnerField13.setPaintLabels(true);
        SpinnerField13.setPaintTicks(true);
        SpinnerField13.setSnapToTicks(true);

        EnabledField13.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField13.setSelected(true);
        EnabledField13.setText("Enabled?");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(TitleField13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField13))
                    .addComponent(SpinnerField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleField12.setText("Willpower");
        TitleField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleField12ActionPerformed(evt);
            }
        });

        SpinnerField12.setBackground(new java.awt.Color(255, 255, 255));
        SpinnerField12.setMajorTickSpacing(1);
        SpinnerField12.setMaximum(10);
        SpinnerField12.setPaintLabels(true);
        SpinnerField12.setPaintTicks(true);
        SpinnerField12.setSnapToTicks(true);

        EnabledField12.setBackground(new java.awt.Color(255, 255, 255));
        EnabledField12.setSelected(true);
        EnabledField12.setText("Enabled?");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(TitleField12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnabledField12))
                    .addComponent(SpinnerField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnabledField12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpinnerField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RPGGenerateButton.setText("Generate!");
        RPGGenerateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPGGenerateButtonActionPerformed(evt);
            }
        });

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Example characters"));

        jTextArea2.setColumns(10);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea2.setRows(2);
        jTextArea2.setText("█ ✿ ❤ ✔ ✘ ✪ ✺ ✦ ✧\ntext-symbols.com\n-----------------\nfor color palletes:\ngoo.gl/IRioDz");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAutoscrolls(false);
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(RPGGenerateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4))
                .addContainerGap(1052, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RPGGenerateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );

        jTabbedPane1.addTab("RPG Skills", jPanel17);

        jScrollPane3.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L1FieldActionPerformed

    private void A1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1FieldActionPerformed

    private void RandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomButtonActionPerformed
        // TODO add your handling code here:
        int enn = (int)(Math.random()*8)+1; 
        if (Math.random()<0.5) { if (enn == 1) { EnneaField.setText("1w9"); } else {
            EnneaField.setText(enn+"w"+(enn-1)); } }
        else if (enn == 9) {EnneaField.setText("9w1"); }
        else {EnneaField.setText(enn+"w"+(enn+1)); }
        
        String[] prig = {"Basic", "Iridescent", "Tiger", "Clown", "Speckle", "Ripple", "Bar", "Crystal", "Vipera", "Piebald", "Cherub", "Poison", "Giraffe", "Petals", "Jupiter", "Skink", "Falcon", "Metallic", "Savannah"};
        String[] secg = {"Basic", "Shimmer", "Stripes", "Eye Spots", "Freckle", "Seraph", "Current", "Daub", "Facet", "Hypnotic", "Paint", "Peregrine", "Toxin", "Butterfly", "Hex", "Saturn", "Spinner", "Alloy", "Safari"};
        String[] terg = {"Circuit", "Basic", "Gembond", "Underbelly", "Crackle", "Smoke", "Spines", "Okapi", "Glimmer", "Thylacine", "Stained", "Contour", "Runes", "Scales", "Lace", "Opal"};
        PrigField.setText(genThing(prig)); SecgField.setText(genThing(secg)); TertgField.setText(genThing(terg));
        String[] allg = {"Basic", "Iridescent", "Tiger", "Clown", "Speckle", "Ripple", "Bar", "Crystal", "Vipera", "Piebald", "Cherub", "Poison", "Giraffe", "Petals", "Jupiter", "Skink", "Falcon", "Metallic", "Savannah", "Basic", "Shimmer", "Stripes", "Eye Spots", "Freckle", "Seraph", "Current", "Daub", "Facet", "Hypnotic", "Paint", "Peregrine", "Toxin", "Butterfly", "Hex", "Saturn", "Spinner", "Alloy", "Safari", "Circuit", "Basic", "Gembond", "Underbelly", "Crackle", "Smoke", "Spines", "Okapi", "Glimmer", "Thylacine", "Stained", "Contour", "Runes", "Scales", "Lace", "Opal"};
        AllGField.setText(genThing(allg));
        
        
        String[] tarot = {"The Fool", "The Magician", "The High Priestess", "The Empress", "The Emperor", "The Hierophant", "The Lovers", "The Chariot", "Strength", "The Hermit", "Wheel Of Fortune", "Justice", "The Hanged Man", "Death", "Temperence", "The Devil", "The Tower", "The Star", "The Moon", "The Sun", "Judgement", "The World"};
        TarotField.setText(genThing(tarot));
        String[] solar = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "Sun", "Ceres", "Comets", "Asteroids", "Kuiper Belt", "Charon", "Makemake", "Haumea", "Eris", "Oort Cloud", "Halley'S Comet", "Moon", "Deimos", "Phobos", "Ganymede", "Callisto", "Io", "Europa", "Amalthea", "Himalia", "Thebe", "Elara", "Pasiphae", "Metis", "Carme", "Sinope", "Lysithea", "Ananke", "Adrastea", "Leda", "Callirrhoe", "Themisto", "Praxidike", "Iocaste", "Taygete", "Kalyke", "Megaclite", "Dia", "Helike", "Harpalyke", "Hermippe", "Thyone", "Chaldene", "Aoede", "Eukelade", "Isonoe", "Autonoe", "Carpo", "Euanthe", "Aitne", "Erinome", "Eurydome", "Hegemone", "Arche", "Euporie", "Thelxinoe", "Orthosie", "Mneme", "Herse", "Kale", "Kallichore", "Pasithee", "Kore", "Cyllene", "Sponde", "Titan", "Rhea", "Iapetus", "Dione", "Tethys", "Enceladus", "Mimas", "Hyperion", "Phoebe", "Janus", "Epimetheus", "Prometheus", "Pandora", "Siarnaq", "Helene", "Albiorix", "Atlas", "Pan", "Telesto", "Paaliaq", "Calypso", "Ymir", "Kiviuq", "Tarvos", "Ijiraq", "Erriapus", "Skathi", "Hyrrokkin", "Daphnis", "Tarqeq", "Mundilfari", "Narvi", "Suttungr", "Thrymr", "Bestla", "Kari", "Bebhionn", "Skoll", "Greip", "Jarnsaxa", "Bergelmir", "Hati", "Aegir", "Surtur", "Loge", "Fornjot", "Farbauti", "Pallene", "Fenrir", "Methone", "Polydeuces", "Anthe", "Aegaeon", "Chiron", "Themis", "Titania", "Oberon", "Umbriel", "Ariel", "Miranda", "Sycorax", "Puck", "Portia", "Juliet", "Belinda", "Cressida", "Caliban", "Rosalind", "Desdemona", "Bianca", "Prospero", "Setebos", "Ophelia", "Cordelia", "Stephano", "Perdita", "Mab", "Francisco", "Margaret", "Ferdinand", "Cupid", "Trinculo", "Centaurs", "Triton", "Proteus", "Nereid", "Larissa", "Galatea", "Despina", "Thalassa", "Naiad", "Halimede", "Neso", "Sao", "Laomedeia", "Psamathe", "Amycus", "Bienor", "Hylonome", "Chariklo", "Asbolus", "Nessus", "Pholus", "Styx", "Nix", "Kerberos", "Hydra", "Scattered Disk", "Dysnomia", "Sedna", "Quaoar", "Orcus", "Salacia", "Ida", "Vesta", "Ceres", "Mathilde"};
        SolarField.setText(genThing(solar));
        
        String[] hog = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin", "Thunderbird", "Wampus", "Horned Serpent", "Pukwudgie"};
        HogwartsField.setText(genThing(hog));
        
        String[] NPC = {"Large Eyes", "Small Eyes", "Narrow Eyes", "Sharp Eyes", "Squinty Eyes", "Round Eyes", "Wide-Set Eyes", "Close-Set Eyes", "Deep-Set Eyes", "Sunken Eyes", "Bulging Eyes", "Protruding Eyes", "Wide Eyes", "Hooded Eyes", "Heavy-Lidded Eyes", "Bedroom Eyes", "Bright Eyes", "Sparkling Eyes", "Glittering Eyes", "Flecked Eyes", "Dull Eyes", "Bleary Eyes", "Rheumy Eyes", "Cloudy Eyes", "Red-Rimmed Eyes", "Beady Eyes", "Birdlike Eyes", "Cat-Like Eyes", "Jewel-Like Eyes", "Steely Eyes", "Hard Eyes", "Eyes Fringed With Long Lashes", "Eyes With Sweeping Eyelashes", "Eyes With Thick Eyelashes", "Arched Eyebrows", "Straight Eyebrows", "Plucked Eyebrows", "Sparse Eyebrows", "Trim Eyebrows", "Dark Eyebrows", "Faint Eyebrows", "Thin Eyebrows", "Thick Eyebrows", "Unruly Eyebrows", "Bushy Eyebrows", "Heavy Eyebrows", "Lined Skin", "Wrinkled Skin", "Seamed Skin", "Leathery Skin", "Sagging Skin", "Drooping Skin", "Loose Skin", "Clear Skin", "Smooth Skin", "Silken Skin", "Satiny Skin", "Dry Skin", "Flaky Skin", "Scaly Skin", "Delicate Skin", "Thin Skin", "Translucent Skin", "Luminescent Skin", "Baby-Soft Skin", "Flawless Skin", "Poreless Skin", "With Large Pores Skin", "Glowing Skin", "Dewy Skin", "Dull Skin", "Velvety Skin", "Fuzzy Skin", "Rough Skin", "Uneven Skin", "Mottled Skin", "Dimpled Skin", "Doughy Skin", "Firm Skin", "Freckled Skin", "Pimply Skin", "Pockmarked Skin", "Blemished Skin", "Pitted Skin", "Scarred Skin", "Bruised Skin", "Veined Skin", "Scratched Skin", "Sunburned Skin", "Weather-Beaten Skin", "Raw Skin", "Tattooed Skin", "Square Face", "Round Face", "Oblong Face", "Oval Face", "Elongated Face", "Narrow Face", "Heart-Shaped Face", "Catlike Face", "Wolfish Face", "High Forehead", "Broad Forehead", "Prominent Brow Ridge", "Protruding Brow Bone", "Sharp Cheekbones", "High Cheekbones", "Angular Cheekbones", "Hollow Cheeks", "Square Jaw", "Chiseled Jaw", "Sculpted Jaw", "Craggy Jaw", "Soft Jaw", "Jowly", "Jutting Chin", "Pointed Chin", "Weak Chin", "Receding Chin", "Double Chin", "Cleft Chin", "Dimple In Chin", "Visible Adam’S Apple", "Snub Nose", "Dainty Nose", "Button Nose", "Turned-Up Nose", "Long Nose", "Broad Nose", "Thin Nose", "Straight Nose", "Pointed Nose", "Crooked Nose", "Aquiline Nose", "Roman Nose", "Bulbous Nose", "Flared Nose", "Hawk Nose", "Strong Nose", "Thin Lips", "Narrow Lips", "Full Lips", "Lush Lips", "Cupid’S Bow Lips", "Rosebud Lips", "Dry Lips", "Cracked Lips", "Chapped Lips", "Moist Lips", "Glossy Lips", "Straight Teeth", "Gap Between Teeth", "Gleaming White Teeth", "Overbite", "Underbite", "Clean-Shaven", "Smooth-Shaven", "Beard", "Neckbeard", "Goatee", "Moustache", "Sideburns", "Mutton-Chop Sideburns", "Stubble", "A Few Days’ Growth Of Beard", "Five O’ Clock Shadow", "Long Hair", "Short Hair", "Shoulder-Length Hair", "Loose Hair", "Limp Hair", "Dull Hair", "Shiny Hair", "Glossy Hair", "Sleek Hair", "Smooth Hair", "Luminous Hair", "Lustrous Hair", "Spiky Hair", "Stringy Hair", "Shaggy Hair", "Tangled Hair", "Messy Hair", "Tousled Hair", "Windblown Hair", "Unkempt Hair", "Bedhead Hair", "Straggly Hair", "Neatly Combed Hair", "Parted Hair", "Slicked Down / Slicked Back Hair", "Cropped Hair", "Clipped Hair", "Buzzed / Buzz Cut Hair", "Crewcut Hair", "Bob Hair", "Mullet Hair", "Curly Hair", "Bushy Hair", "Frizzy Hair", "Wavy Hair", "Straight Hair", "Lanky Hair", "Dry Hair", "Oily Hair", "Greasy Hair", "Layers Hair", "Corkscrews Hair", "Spirals Hair", "Ringlets Hair", "Braids Hair", "Widow’S Peak Hair", "Bald Hair", "Shaved Hair", "Comb-Over Hair", "Afro Hair", "Thick Hair", "Luxuriant Hair", "Voluminous Hair", "Full Hair", "Wild Hair", "Untamed Hair", "Bouncy Hair", "Wispy Hair", "Fine Hair", "Thinning Hair", "Tall", "Average Height", "Short", "Petite", "Tiny", "Compact", "Big", "Large", "Burly", "Beefy", "Bulky", "Brawny", "Barrel-Chested", "Heavy / Heavy-Set", "Fat", "Overweight", "Obese", "Flabby", "Chunky", "Chubby", "Pudgy", "Pot-Bellied", "Portly", "Thick", "Stout", "Lush", "Plush", "Full-Figured", "Ample", "Rounded", "Generous", "Voluptuous", "Curvy", "Hourglass", "Plump", "Leggy / Long-Legged", "Gangling", "Lanky", "Coltish", "Lissome", "Willowy", "Lithe", "Lean", "Slim", "Slender", "Trim", "Thin", "Skinny", "Emaciated", "Gaunt", "Bony", "Spare", "Solid", "Stocky", "Wiry", "Rangy", "Sinewy", "Stringy", "Ropy", "Sturdy", "Strapping", "Powerful", "Hulking", "Fit", "Athletic", "Toned", "Built", "Muscular", "Chiseled", "Taut", "Ripped", "Herculean", "Broad-Shouldered", "Sloping Shoulders", "Bowlegged", "Delicate Hands", "Small Hands", "Large Hands", "Square Hands", "Sturdy Hands", "Strong Hands", "Smooth Hands", "Rough Hands", "Calloused Hands", "Elegant Hands", "Plump Hands", "Manicured Nails", "Stubby Fingers", "Long Fingers", "Ragged Nails", "Grimy Fingernails", "Ink-Stained Hands", "Moles", "Freckles", "Freckles On Face", "Freckles On Arms", "Freckles On Legs", "Birthmarks", "Hemangiomas", "Buff", "Well Built", "Lentigines", "Scars", "Burn Scar", "Rosacea", "Wrinkles", "Skin Tags", "Dandruff", "Tattoos", "Piercings", "Tattoo On Face", "Scar On Face", "Mole On Face", "Birthmark On Face", "Wound On Face", "Tattoo On Neck", "Freckles On Neck", "Scar On Neck", "Mole On Neck", "Birthmark On Neck", "Wound On Neck", "Tattoo On Arms", "Scar On Arms", "Mole On Arms", "Birthmark On Arms", "Wound On Arms", "Tattoo On Legs", "Scar On Legs", "Mole On Legs", "Birthmark On Legs", "Wound On Legs", "Tattoo On Torso", "Freckles On Torso", "Scar On Torso", "Mole On Torso", "Birthmark On Torso", "Wound On Torso", "Atrophic Scars", "Hypertrophic Scars", "Keloid Scars", "Scar Contractures", "Stretch Marks", "Acne Scars", "Ice Pick Scars", "Boxcar Scars", "Achilles Tendon Injury", "Acl Injuries", "Ankle Injury", "Concussions", "Dislocated Shoulder", "Golfer'S Elbow", "Head Injury", "Muscle Strain", "Posterior Cruciate Ligament Injury", "Repetitive Motion Injuries", "Rotator Cuff Tear", "Skier'S Thumb", "Soreness After Exercise", "Tailbone Injuries", "Tendon Injuries", "Tennis Elbow", "Tommy John Surgery", "Abrasions And ‘Road Rash’ Treatment", "Abrasions And Lacerations", "Acl Injury", "Acl Injuries And Skiing", "Achilles Tendonitis", "Achilles Pain And Injuries", "Adhesive Capsulitis (Frozen Shoulder)", "Ankle Sprains", "Ankle Injuries", "Anterior And Posterior Cruciate Ligament Injury", "Arthritis Of The Shoulder", "Back Pain", "Baseball Injuries", "Basketball Injuries", "Blister Treatment And Prevention", "Burner / Stinger Syndrome", "Bursitis", "Bursitis Of The Hip", "Calf Strain", "Carpal Tunnel Syndrome", "Cartilage Injuries And Disorders", "Clavicle Injuries", "Chf And Exercise", "Chondromalacia", "Compulsive Exercise", "Concussion", "Cramping Muscles", "Cycling Injuries", "Diabetes And Exercise", "Delayed Onset Muscle Soreness (D.O.M.S.)", "Elbow Injuries", "Exercise And Extreme Cold", "Exercise And Extreme Heat", "Extension Education For Back Pain", "Foot Anatomy And Physiology", "Foot Injuries", "Football Injuries", "Fractures", "Frozen Shoulder (Adhesive Capsulitis)", "Golf Injuries", "Groin Pull", "Groin Pain", "Hamstring Pulls Or Tears", "Hamstring Injuries", "Heel Spurs", "Herniated Disc", "Hip And Groin Injuries", "Hip Pointer", "Hip Replacement", "Helmet Removal In Head And Neck Trauma", "Hockey Injuries", "Iliotibial Band Syndrome", "Impingement Syndrome", "Iliopsoas Syndrome", "Kids Sports Injuries", "Knee – Cartilage Injuries And Disorders", "Knee – Chondromalacia", "Knee Ligament Injuries", "Knee – Meniscus Injuries", "Knee – Patellofemoral Pain Syndrome", "Knee – Tendon Injuries", "Knee Pain", "Lateral Epicondylitis", "Lateral Epicondylitis/Tennis Elbow", "Leg Injuries – Hamstring, Quadriceps, Etc.", "Ligament Injuries Of The Knee", "Lower Leg Anatomy And Physiology", "Medial And Lateral Collateral Ligament Injury", "Meniscus Injuries", "Muscle Cramps", "Muscle Sprains And Strains", "Neck Injuries", "Neck Injuries: Urgent Decisions And Actions", "Neck Strain", "Noisy Joints", "Osgood-Schlatter Disease", "Osteoarthritis Of The Knee", "Osteoarthritis", "Osteoporosis", "Overpronation", "Overtraining Syndrome", "Patellofemoral Pain", "Patellofemoral Pain Syndrome", "Piriformis Syndrome", "Pcl Injury", "Plantar Fasciitis", "Pronation", "Quadriceps Pulls Or Tears", "‘Road Rash’ Treatment", "Rotator Cuff – Torn", "Rotator Cuff Injuries", "Rowing Injuries", "Running Injuries", "Sciatica", "Side Stitch", "Shin Splints", "Shoulder Anatomy And Physiology", "Shoulder Arthritis", "Shoulder Separation", "Shoulder Tendinitis, Bursitis, And Impingement Syndrome", "Shoulder Pain Q And A", "Shoulder Injury Index", "Skiing Injuries", "Snowboarding Injuries", "Sprains And Strains", "Sprains And Strains Faq", "Stress Fractures", "Supination", "Swimming Injuries", "Tendon Injuries And Disorders Of The Knee", "Tendinitis Of The Shoulder", "Tendinitis / Ruptured Tendons Of The Knee", "Tendinitis Of The Wrist", "Tennis Injuries", "Torn Rotator Cuff", "Turf Toe", "Volleyball Injuries", "Whiplash", "Women’S Sports Injuries", "Wrist And Hand Injuries", "Animal And Human Bites", "Blisters", "Broken Or Knocked-Out Tooth", "Burns And Scalds", "Cuts And Grazes", "Insect Bites And Stings", "Joint Hypermobility", "Minor Head Injury", "Severe Head Injury", "Skin Rashes", "Double Jointed'/Hyperflexible", "Hyperflexible Elbows", "Hyperflexible Knees", "Hyperflexible Fingers", "Hyperflexible Thumbs", "Hyperflexible Hips", "Hyperflexible Wrists", "Hyperflexible Shoulders", "Hyperflexible Ankles", "Abrasion", "Brain Injuries", "Bruising", "Burns", "Cluster Headaches", "Congestive Heart Failure", "Construction Injuries", "Coronary Artery Disease", "Defective Products", "Dislocation", "Flail Chest", "Fracture", "Hemothorax", "Hypothermia", "Lacerations", "Pinched Nerve", "Pneumothorax", "Prescription Medications", "Quadriplegia Definition", "Rib Fracture", "Spinal Cord Injury", "Temporalmandibular Joint", "Tendons Ligaments Fascia Injury", "Traumatic Brain Injury"};
        NPC1Field.setText(genThing(NPC));
        NPC2Field.setText(genThing(NPC));
        NPC3Field.setText(genThing(NPC));
        NPC4Field.setText(genThing(NPC));
        String[] PP = {"Twitching", "Always Interrupting", "Never Shut Up And Talk Over You Constantly", "Don'T Know About Personal Space", "Don'T Cover Their Cough/Sneeze", "Chewing With Your Mouth Open", "Always Finds Something To Complain About", "Cutting In Line", "Won'T Respect You Opinion Just Because It Doesn'T Match Theirs", "Talking During The Movie", "Stopping In The Middle Of A Crowded Hallway", "Always Late", "Scuff Their Feet", "Chews Loudly", "Standing In Doorways", "Constantly Talks About Their Diet/Veganism", "Say 'Ew' To What You'Re Eating", "Eat Food Off Your Plate Without Asking First", "Say 'No Offense' Before They Say Something Offensive", "Say 'Literally' About Things That Are Not Literal", "Nail Biting", "Clipping Their Nails In Public", "Walk Slowly", "Stop Suddenly", "Leaving Their Pet'S Poop On The Sidewalk", "Passive Aggressive Behaviour", "Listening To Music Through Speakers Instead Of Headphones", "Singing Out Loud", "Inflated Sense Of Their Own Importance", "Seal A Ziplock Bag Without Removing The Air First.", "Clapping At The End Of A Movie In Theater", "Public Display Of Affection", "People Who Read Out Loud What They'Re Writing A Letter", "Kids Who Tease Dogs Through A Fence.", "People Who Drink Directly Out Of The Milk/Orange Juice Container.", "Couples Who Sit On The Same Side Of The Booth When There Is No One On The Other Side.", "Parents Who Bring Their Young Kids To R Rated Plays", "People That Don'T Use Coasters.", "People Who Blame Anything But Themselves For Their Failure.", "People Who Sit Next To You On Public Transportation Even When There Are Other Seats Available.", "Noisy Eaters.", "Students Who Prolong Class By Asking The Most Inane Questions.", "Women Who Wear Jewelry That Clinks And Clacks And Makes Noise When They'Re At Their Desk Or Keyboard.", "When People Take 20 Napkins, Use One, Then Throw Them All Away.", "People Walking Around In Ridiculous 'Fashionable' Shoes That Are Clearly Hurting Their Feet.", "Whenever Anyone Says 'Ya, Know What I'M Sayin'...", "Using Speaker Phones In Public Areas At Work.", "Roadmaps That Aren'T Folded Correctly.", "Finding A Shoe And Not Finding Its Mate Next To It", "When A Person Makes A Sucking Noise With A Straw When The Cup Becomes Almost Empty.", "People With Bad Table Manners.", "People That Snoop.", "People Who Read The Paper While Driving.", "People That Interrupt You When Your Telling A Story And Then They Continue To Tell You Their Story And Then Ask You In An Uninterested Tone To Continue On With Your Story When They Are Finished Talking.", "Drivers Who Won'T Turn Right On Red.", "Vulgar Talk At The Dinner Table.", "Couples That Own A Dog Together And Call Themselves Mommy And Daddy.", "When Drivers Bring Their Car To The Wrong Side Of The Gas Pump.", "Double Negatives.", "Conspiracy Theories.", "Not Washing Hands After Using The Bathroom.", "People Who Push Alcohol At Social Functions.", "The Noise People Make When They Rub Their Fingers On Balloons.", "When Your Spouse/Roommate Uses The Butter To Put On Their Toast, And Leaves Crumbs In The Container.", "People Who Don'T Perform Their Duties At Work.", "Guys Who Leave The Toilet Seat Up.", "Dining With A Picky Eater (They Can Never Order Off The Menu Without Customizing Every Aspect Of The Meal).", "Tapping.", "Men On Trains Who Insist On Sitting With Their Legs Spread Wide Like They Got Something There.", "When Ice Cream Drips Out Of The Bottom Of A Sugar Cone.", "When People Don'T Send Thank You Notes.", "When Somebody Tosses Something Toward A Garbage Can, Like They Think They'Re A Basketball Star, Then Leave It On The Ground After They Miss!", "People Who Take Forever To Order Food While I'M In Line.", "People Who Walk Their Dogs And Let Them Poop Indiscriminately (Like On Someone'S Lawn), And Does Not Pick It Up.", "People Who Write 'Noone' Instead Of 'No One'.", "Explanations That Begin With The Word 'Again'.", "People Who Don'T Cover Their Mouth While Sneezing Or Coughing.", "Dirty Dishes In The Sink.", "People Who Habitually Need Favors.", "When You'Re Eating Candy And Someone Asks If They Can Have A Red One.", "Airline Speak (Like: 'The Lavatories Are Equipped With Smoke Detectors, So Do Refrain...')", "When You Bite Into A Jelly Bean And It'S A Different Flavor Than What You Thought It Was.", "Having To Go To A Ups / Fedex Office To Pickup A Package.", "Uncomfortable Chairs.", "Chasing After A Ping Pong Ball.", "When Something I'Ve Been Into For A Long Time Becomes Popular.", "People Who Overuse Quotes From Movies Or Tv.", "People Who Act Like They'Re In Their Own Living Room At An Event (Concert, Ballgame, Play, Movies Or A Restaurant).", "People Who Give Their Kids Weird Names", "People That Don'T List Prices On Websites, Stores, And Infomercials.", "The Creepers At Red Lights. You Know, Those People That Start Inching Forward In Their Cars…Slowly…Until The Light Turns Green.", "When People Leave The Cap Off The Toothpaste.", "People Who Clear Their Throats In A Disgusting Way.", "People That Pop And Smack Their Chewing Gum.", "People Who Style Their Hair During Mass.", "People Who Invite You Out Somewhere Then Cancel.", "Women Who Wear Too Much Perfume.", "Cutesy Intentional Misspellings: ” Lite” ” Kwik” ” ‘R ” For Are.", "You Know When You Ask Someone A Simple, Straightforward Question And They Spend Ten Solid Minutes Rambling On About Everything In The World Except The Answer To Your Simple, Straightforward Question? I Hate That.", "When You Order A Salad At A Restaurant And They Bring It To You At The Same Time As Your Dinner.", "Children'S Hand Prints On The Windows In Car.", "People Who Don'T Know The Difference Between Its/It’S And They’Re /Their/There.", "People Who Carry A One Sided Conversation", "People Who Leave The Door Open When They Go To The Bathroom.", "Sick People Who Cough Near You.", "People Who Talk, Whistle Or Sing To Themselves At Work.", "People Putting Their Feet Out Of Car Windows.", "Greeting Cards That Throw Sparkles, Sequins Or Confetti On The Hapless Recipient", "When You'Re Invited To A Party (Or Any Event) With People You Have Never Met, And The Host Doesn'T Introduce You To Anyone.", "When You Find A Really Cute Piece Of Clothing On The Rack And They Have Like Twenty In Size Xs, Two In Size 3X, And Not A Single One In Your Size.", "People Who Throw Cigarette Butts On The Beach.", "Saying 'Let There Be Light' Every Time Any Light Switch Is Flipped On.", "People Who Leave Shopping Carts In The Parking Lot Instead Of Taking Them Back To The Corral.", "People Who Write 'Keep In Touch!' In Your Yearbook But Never Talk To You Again.", "Unexpected Company.", "When Someone With A Full Cart Of Groceries Gets Into The 10 Items Or Less Line.", "Cats And Dogs That Are Inconsiderate Of Their Human'S Sleeping Habits, And Decide To Romp, Play, And Destroy Stuff At 4 Am.", "People Letting Their Dogs Use My Yard As Their Toilet.", "Ignorant People.", "People Who Read Over Your Shoulder On Public Transportation.", "Driving Somewhere And Having The Sun In My Eyes.", "People Who Think That They Are The Only One With Correct Background For Understanding An Issue.", "Being The First One At Any Party.", "People Throwing Trash Into A Recycle Bin.", "Movie Sequels That Are Unnecessary.", "Litterbugs.", "Drivers Who Tailgate.", "Anyone – Male Or Female- Who Says “We’Re Pregnant”. Are They Sharing A Uterus?", "The 'Yes But' People.", "When You Have An Itch On The Bottom Of Your Foot And You Can'T Scratch It Because You Have Shoes On.", "When Someone Leaves Their Phone Number At The End Of A Long Message And They Say It So Fast You Can'T Understand It And Have To Listen Multiple Times To Figure It Out.", "People Who Don'T Dress Their Age", "Suburban Kids Who Think They Are Gangstas.", "Peop;E Who Chew With Their Mouth Open", "People When They Clean The Tables Nearby With A Bleach Solution. While I Am Glad They Are Sanitary, The Smell Of Bleach Can Really Quelch My Appetite. Having Obviously Private Conversations On Their Cell Phone In Public Places.", "When People Put The Spoons/Forks In The Wrong Section Of The Utensil Separator.", "People Who Let Dogs That Jump Up On Everyone Loose In Public.", "Clipping Your Nails At Work.", "When Your Eating Something And A Person Will Just Steal A Little Bit Of It.", "Retail Clerks That Ignore The Live Customer To Help Somebody That Interrupts By Phone", "People Who Don'T Pick Up After Themselves.", "When People Refuse To Be The Decision Maker About Something Simple (Which Restaurant To Eat At, What Movie To See, Etc.).", "In An Obviously Crowded Restaurant, People Who Linger Long After Receiving Their Check.", "When You Pull A String Hanging From Your Shirt And It Doesn'T Break, But Only Becomes Longer.", "People Who Put Salt On Everything Without Tasting It First.", "Not Washing Hands After Using The Restroom", "No Toilet Paper Or Paper Towels In Public Bathrooms.", "When You Will Be Talking To Someone, And Their Replies Seem To Be Limited To 'Ya', 'Cool', And 'Ok'.", "When Somebody Turns Off The Lights When You Are Still In The Room.", "People Who Can'T Complete A Sentence Without Saying 'You Know'.", "When People Don'T Clear The Microwave Numbers.", "Finding The End Of The Program Hasn'T Taped After Sitting Riveted For Almost Two Hours.", "People Who Say 'It'S Always In The Last Place You Look'.", "When People Ask Me For Advice And Do The Opposite Of What I Tell Them.", "When People Don'T Rsvp To An Event.", "People Who Will Write Something Borderline Mean, But Then Follow It Up With A Smiley Face :)", "People Who Refer To Themselves In The Third Person.", "People Who Snap Their Gum.", "Girls Who Wear Way Too Much Make Up.", "People Who Always Have To Be Right And Have The Last Word.", "People That Cannot Simply Take Their Trash To The Trash Bin In Places Such As Fast Food Restaurants, Shopping Malls Etc.", "People Who No Matter What Relate To Something You Have Done And Try To 'One Up' You.", "When Someone Is Writing On A Chalkboard And Then They Erase It To Write Something New, But They Don'T Erase All Of It, So You Still See Half Of A Letter Here And There.", "People That Tailgate When Your Driving.", "People Who Whistle When They Are Happy.", "Fax Machines That Call My Home Number.", "Rappers Who Thank God At Awards Cermonies.", "Mumbling, Then Annoyedly Saying 'Forget It!' When People Don'T Hear You.", "People Who Use A Calculator To Figure Out The Tip At A Restuarant.", "Drivers Who Signal After They Make A Lane Change.", "People Who Spell 'You'Re' As 'Your.'", "People Who Don'T Cash Checks You Give Them In A Timely Manner.", "The Noise Styrofoam Makes When You Rub It Together.", "People Who Blow Their Horn At You The Nano-Second The Light Changes To Green.", "When The Garbage Man Turns My Can Upside Down After Dumping Most Of The Garbage In It Into The Garbage Truck. I Go To Collect The Can And When I Turn It Right Side Up, The Remaining Garbage Spills Out On The Sidewalk.", "People Who Don'T Use Deoderant.", "When People Continue To Stare After They Ask You A Question, As If They Need You To Expand More On Your Answer.", "Ice Cream With Freezer Burn.", "When The Person Who Takes The Last Of Something Puts The Empty Package Back.", "Flakes! People That Cancel Plans Constantly.", "Hair Strands Left On Shower Walls.", "When You First Meet Someone And Can'T Remember The Person'S Name By The End Of The Conversation.", "Taking Forever To Leave A Parking Space While Others Are Clearly Waiting For It", "Business Buzz Words: Synergistic, Globalize, Paradigm Shift, Etc.", "When People Are Using Armrests On Both Sides Of You.", "Bosses Who Think Your Job Is Your Life.", "People Sitting At A Red Light And Continuing To Sit There When The Light Turns Green Because They'Re On Their Cell Phone.", "Grocery Clerks That Want To Bundle The Receipt With My Change. Hand Me The Money Separately So I Can Put It In My Pocket, And Then Hand Me The Receipt Or Place It In The Bag.", "People Who Dress Their Pets.", "People Who Buy Animals, Only To Get Rid Of Them A Week Later Because It Was Harder To Take Care Of Them Than They Thought.", "People Who Mumble.", "Whisteling Out Of Tune.", "Conversational High-Fives: High-Fiving At Any Time Other Than When One Is Actively Playing A Sport", "People Who Are Always Late.", "When There Are No Hot Dog Buns Left And You Have To Eat Your Hot Dog On A Folded Piece Of Bread.", "Men Who Ogle Or Whistle At Women Who Walk Down The Street.", "People Who Honk In Front Of A House Instead Of Getting Out Of The Car And Ringing The Doorbell.", "Annoying Nervous (Forced Sounding) Laughs.", "When You Are Asleep At A Hotel And The Alarm Clock Goes Off In The Middle Of The Night Because The Person Who Was There Before You Set It And Never Turned It Off.", "When You Have To Walk Out Of The Shower Naked Because You Forgot To Bring A Towel With You.", "Needless Meetings.", "People Who Don'T Look At You When They Are Talking, Or You Are Talking To Them.", "People Who Turn Their Stereos Up Full Blast In Their Apartment Building And Have No Consideration Of Others.", "When You'Re Driving Down The Road And A Cigarette Butt Comes Out The Window Of A Car In Front Of You And It Bounces Off Your Car.", "People Who Stare.", "People Who Use The Phrase '110%' (Or Even More % Sometimes).", "People Who Leave Food That Can Spoil (Milk, Butter, Etc.) Out Too Long, Instead Of Putting It Back In The Fridge When They Are Done.", "People Who Put Their Feet Up On The Seat In Front Of Them In Movie Theaters.", "People Who Say The Time Like 'Eight Am In The Morning'.", "People Who Won'T Take Their Kid Out Of A Restaurant When They Are Crying, Screaming, Etc.", "Having To Dress Up For Work Just To Have It Downpour When You Step Outside.", "When The Host/Hostess At A Restaurant Totally Underestimates How Long A Wait There Will Be.", "When People Inturrupt You.", "Guys Who Wear Wifebeaters (And Nothing Else For A Shirt) In Public.", "Forks Whose Tines Don'T Stand Up In A Perfectly Straight Line", "The Sound Of Too Much Spit In Someone'S Mouth When They Talk.", "Athletes Who Point To The Sky After Scoring.", "Someone Opening A Cabinet Door Or Drawer And Leaving It Open.", "People Say 'Carmel' Instead Of 'Caramel'. Is It Really That Hard To Pronounce That Extra Letter?", "Bathroom Stalls With A Mirror So You Can See Your Whole Self While Seated", "Drivers Who Make U-Turns Where They Are Not Allowed To.", "In Mini Golf When You Miss The Hole Three Times In A Row Less Than A Foot Away.", "When Someone Starts To Watch A Show Or Movie In The Middle Of It And Expect You To Tell Them What'S Happening.", "People Who Think The Seat Next To Them Is A Place To Plunk Down Their Gym Bag/Back Pack On A Crowded Bus.", "Clipping Toenails In Bed.", "People Who Ask 'Can I Ask You A Question?'", "People Who Leave Farts In Elevators That I Subsequently Enter. Then The Next Person Thinks It'S Me.", "Commercials In Movie Theaters.", "Keeping Your Christmas Lights Up Until February.", "Overuse Of The Word 'Like'", "People Who Read A Story, And Purposely Skip Pages So That It Ends Quicker.", "When You Score A Goal On Yourself In Foosball Or Air Hockey.", "People Who Drive Past Me On A Crosswalk.", "When The Tiolet Paper Roll Is Backwards.", "People Who Ask You What Time It Is.", "People With Poor Umbrella Etiquette.", "When Other People Sleep On My Pillow.", "When You Are Hanging Out With Someone And They Make Plans To Do Something Else Right In Front Of You.", "When People Scratch Their Fingernails On A Blackboard.", "People Who Can'T Wait To File A Lawsuit In Order To Get Rich Quick.", "Wet, Dirty, Stinky, Slimy Dishrags Left In A Heap In The Bottom Of The Sink.", "Websites With Horizontal Scrolling.", "People Who Use Unnecessary Abbreviations, Like W/E (Whatever), W/O (Without) And J/K (Just Kidding).", "People At Wal*Mart Supercenter Who Enter Thru The Exit And Exit Thru The Enter.", "Getting Fruit In Your Bag On Halloween.", "Going To A Restaurant Within The Last Hour Before Closing And Everyone Is Cleaning,Sweeping And Slamming Stuff Around To Get Out Of Their Quickly And At Buffet The Food Is Gone Or Old And Dried Up.", "Walking Into Spider Webs.", "When The Cashier Gives You The Change With The Coins On Top Of The Bills And For A Moment You Look Like A Fool Jamming A Large Wad Of Cash Into Your Pocket.", "People Who Use Self Checkout Lanes But Don’T Know How To Use Them And Slow Us All Down.", "Hearing Classic Songs That I Grew Up With...Pimping Products On Commericals.", "Stomping On The Floor To Simulate Knocking On A Door.", "Using Your Finger As A Gun.", "Telemarketers.", "Waiters/Waitress Who Put Their Fingers On The Top Of The Glass (Where You Drink From) When They Deliver It To You.", "Bars Where The Music Is Too Loud.", "People That Don'T Answer E-Mail.", "People Who Are Clearly Unhappy And Yet Pretend Like Everything Is Just Fine.", "Failing To Take A Backpack Into Account When Turning Or Backing Into People", "Yelling 'Drop It' The Moment A Conversation Veers Into An Unwanted Direction.", "Cell Phone Drivers", "Lawn Ornaments.", "People Who Borrow Stuff And Never Give It Back.", "When People Call Me But Are Talking To Someone Else When I Answer And I Have To Wait Till They Stop Talking.", "When You Sit Down At A Restaurant And The Waiter/Waitress Spends Time Cleaning Other Tables, When There Are Lots Of Empty Tables, Instead Of Taking Your Order.", "When The Tracking System For Delivery Isn'T Up-To-Date.", "Gray Snow That Won'T Melt; Piled Up On The Side Of The Road", "Bad Breath.", "People Who Refuse To Expand Their Musical Horizons.", "People Who Complain Out Loud While Waiting In A Long Line At The Store.", "People Who Say 'Bra' Or 'Bro' When It'S Not Their Brother.", "When People Put (Sp?) After Words When The Spell Check Button Is Right There In Front Of Them.", "People Who Can'T Seem To See Any Faults In Their Kids Or Their Mothers.", "Piling Up Clothes In The Corner Of The Room Instead Of Putting Them In The Hamper.", "Hair On The Soap.", "Mispronunciation Of Words.", "People Who Are Stingy With Money When They Clearly Have A Lot Of It.", "People Who Cook For You, And Use The Same Spoon Multiple Times To Taste What They Are Cooking While Cooking It, Like For Pasta Sauce Or Soup.", "Having A Drawer Full Of Unknown Cords, Transformers, Adapeter, Etc.", "I Hate It When People Take Healthy Food And Fry It Up In Butter And Eat It Because It'S 'Good For Them'.", "Loud Motorcycles.", "When People Trip Over Your Their Foot In The Hallway And Start Running To Pretend Like They Meant To Do It.", "When You Ask For Lots Of Ketchup And They Give You Only Two Or Three Packets.", "Shopping Carts With A Broken Wheel.", "The Sound Of Somebody Playing With Silverware On A Plate.", "Going Out To Dinner With A Big Group, Eating $10 Worth Of Food And Having To Split The Whole Bill And Ending Up Paying Much More Than You Ate.", "When The Waiter/Waitress Asks Whether You Want Dessert, But Smiles In A Way That Means She Is Clearly Judging You.", "Sitting In The Movies And Hearing Someone Eating Popcorn.", "Bathing Suit Tops As Clothing.", "People Who Pick Their Nose In Public.", "Car Passengers That Throw Their Doors Wide Open Without First Checking To Make Sure It Is Safe To Do So.", "Lazy People.", "People Who Talk About Their Favorite Sports Team And Say 'We' Like They Are A Part Of The Team.", "People Who Love To Point Out How Wrong Everyone Else Is While They Are A Walking Train Wreck", "People Who Don'T Care What'S Going On In Our Country.", "People Who Are Over Age 21 Who Say The Word 'Dude'.", "People Who Spit On The Ground And Don'T Look First To See If Anybody Is Around.", "People Who Use Their Caller Id Like An Answering Service. Example: 'Hello?' 'Yeah, Someone Call Me From This Number?' 'Umm, Who Are You?' 'Who Is This?' 'You Called This Number. Did You Get A Message?' 'I Haven'T Checked My Messages. This Number Just Came Up'. Etc..", "Being Put On The Speakerphone Without Warning", "Obnoxious Doorbell Ringers.", "Adware, Spyware, Popups, Viruses And Other Things That Download Themselves And Install Automatically", "When People Say The Word Huge Incorrectly By Dropping The 'H' And Pronouncing It Uge.", "When People Change The Tv Channel Without Asking", "People Who Make You Take Off Your Shoes When You Go Into Their House.", "People At A Store/Supermarket Who Wait In A Long Checkout Line, And Then When They Finally Need To Pay They Take Forever To Find Their Checkbook/Cash/Credit Card.", "Stores/Companies That Charge Extra If You Pay By Credit Card.", "I Hate Slow People Walking In Front Of Me.", "People Who Stop At The Top Or Bottom Of An Escalator.", "At A Restuarant, When They Clean The Tables Nearby With A Bleach Solution, Smelling Up My Area.", "People Who Point At Their Wrist While Asking For The Time.", "Dog Poop On The Sidewalk.", "When Those Little Hinges On The Cd Case Break, And Now You Can'T Open And Close It.", "Men Who Refer To “Babysitting” Their Own Children.", "People Who Are Late.", "I Know They Have To Do This, But I Hate Having Servers Recite The Specials To Me. Because I Have Never Ordered A Special, And Hate Having To Feign Interest In Them.", "The Use Of Redundant Statements Like Atm Machine Or Pin Number", "Hair In The Shower Drain.", "People Who Don'T Use Their Turn Signal, Tailgate, And Cut You Off", "How Hard It Is To Open A New Music Cd.", "Pee Anywhere Other Than In A Toilet.", "Watching People Put Their Contacts In.", "How Commercials Are So Much Louder Than The Tv Shows.", "People Who Don'T Want To Learn Anything New Because They Know It All.", "When You Bend Over To Pick Something Up And Miss The Object Multiple Times, And The Final Attempt Is A Violent Grab As If To Say It Was The Object'S Fault.", "Feeling A Little Juvenile When The Waitress Sees Your Drawings On The Table At The Macaroni Grille And You'Re Over The Age Of Eight.", "When You Get Out Of The Pool And Your Bathing Suit Sticks To You And Exposes Your Crotch.", "Singing Along With The Music When You Don'T Actually Know The Words.", "People Who Write Checks During Check-Out. I Hate Waiting.", "Men Who Talk Down To Women.", "Email With No Subject.", "Grocery Shopping Carts With A Bad Wheel.", "How Clothes Hangers Get All Tangeled With Each Other", "Double Dippers.", "When People Don'T Pick Up Their Feet To Walk And You Hear The Scuff... Scuff... Scuff.", "People Who Brag About How Trashed They Got The Night Before.", "Unsolicited Advice.", "Co-Workers That Try To Sell Stuff To You At Work.", "Trying To Get Assistance Over The Telephone, Only To Be Directed To 'Press This Number', Umpteen Times.", "When Adults Cuss In Front Of Children.", "At A Restuarant, Bread Cut Only Halfway, Instead Of Into Slices.", "People Who Say I Can'T, Without Even Trying.", "People Who Leave Their Pets In Their Hot Cars In The Summer.", "People Who Constantly Get Up In Movie Theaters.", "When You Are Changing The Tv Channel And It Goes Black Of A Second Before The Channel Comes Up.", "Dogs Running Around On A Flatbed Truck, Which Is Going Highway Speed.", "Parents Who Have Their Children On Leashes.", "People Who Type Like This.", "Restaurants That Put Too Much Ice In Your Drink.", "Anti-Climactic Ends To Long Lists.", "People Who Double Park.", "People Who People Park A Shopping Cart In The Middle Of The Aisle In Wal-Mart Or Grocery Store, Blocking The Way For Others And Then Walking Away To Gather Items.", "When People Use The Word 'Literally' Inappropriately. I.E. 'I Literally Almost Jumped Out Of My Skin.'", "People Who Make Out In Public.", "Babies Sitting On Laps In Cars.", "People Who Bring Their Babies To The Movies.", "People Who Stick Their Used Gum Just About Anywhere (Under A Table Or Chair, On The Ground, Etc.)", "Dried Toothpaste In The Sink.", "Junk Mail.", "People Who Talk On Their Cell Phone At The Movies.", "When Someone Blows Their Nose In Your Presence And Then Proceeds To Look At What Just Filled Their Tissue/Handkerchief.", "When People Don'T Rinse Their Dishes Before They Put Them In The Sink.", "Not Letting Things Go The First Time Someone Says Stop.", "People Who Don'T Accelerate Fast Enough At A Stop Light, Especially If You'Re In The Left Lane.", "People Who Stop Right Infront Of You When Your Walking Through Town.", "People That Do Not Flush The Toliet In Public Restrooms.", "When You Apply Too Much Deodorant And You Have To Make A Running-In-Place Type Of Motion.", "I Hate People Who Have No Idea What 'Personal Space' Is.", "Pants On Men That Are Too Short.", "Dirty Restaurant Bathrooms. It Makes Me Wonder How Clean The Kitchen Is.", "People Who Don'T Stop At Stop Signs.", "People Who Smoke Right Outside The Door Of A Nonsmoking Establishment, Getting Smoke All Over Everybody Who Enters/Leaves.", "People Who Don'T Listen When You Are Talking To Them. How Many Times Have You Said A Few Sentences To Someone Only To Have Them Suddenly Say 'What Did You Just Say? I Wasn'T Paying Attention.'", "People That Don'T Return Your Phone Calls.", "Referring To Any Government Agency As 'The Fed'.", "If You Are Able To Drink Everything But One Little Drop Of Milk Or Juice, Whatever...Don'T Put It Back In The Fridge! Just Finish It.", "Air Guitar. Don’T Do It. You Look Like A Dork.", "Dull Pencils.", "People Who Can'T Decide On One Radio/Tv Station, And Constantly Flip Back And Forth.", "The Habit Of Tossing Dirty Silverware Into Garbage Disposal Part Of The Sink", "Getting Behind Someone That Will Not Drive Up To The Speed Limit.", "People Who Straddle Multiple Lines At The Drug Store.", "When You'Re With A Group Of People And You Think Nobody Saw That You Just Tripped, And You Think You'Re In The Clear. But The One Person Who Did See It Points It Out To Everybody Else.", "Family Members Who Do Not Talk To You For Years, But When They Need Or Want Something, Act Like Nothing Happened.", "I Hate It When People Tickle Me.", "Gossip.", "People Who Blow Their Nose At The Dinner Table Or In The Kitchen When You'Re Eating Or Cooking.", "Things Sticking Out Of Drawers", "Utility/Cable Service People That Don'T Show Up On Time.", "When Someone Is Giving A Speech In Class And They Won'T Stop Looking At You As They Speak.", "A Dirty Stove Top. When Finished Cooking, All Food Particles Should Be Cleaned Off The Stove.", "Using The Toilet Paper Down To The Last Few Squares Without Getting A New Roll", "Restaurants That Have A No Smoking Section Which Is Only Several Feet Away From The Smoking Section.", "People Who Don'T Move To The Back Of The Bus When There Is Plenty Of Room To Do So.", "People Who Write On Dirty Car Windshields", "When Shirts Shrink In The Dryer.", "When You Are Trying To Wax Something, And You Pull Hard But Nothing Comes Off And Yet You Still Feel The Pain.", "Cussing In Public, Especially In Front Of Senior Citizens.", "People Who Don'T Hold The Elevator For You.", "When You'Re Trying To Walk In The Mall And There'S A Kiosk And They Hound You To Try Their Cell Phone Service Or Whatever.", "People That Say They Don'T Like A Certain Food Before They Try It, And Refuse To Eat It .", "People Abbreviating Words When They Speak.", "Barbecue Restaurants With Happy Pigs On The Sign.", "Motel Pillows.", "Making Me Talk To Your Boyfriend/Girlfriend Who I Have Never Actually Met When I Call You On The Phone, Saying Something Like, 'Oh Here - Talk To [---]'.", "Used Grocery Bags That Aren'T Folded Correctly.", "Pieces Of Fat On Meat.", "Companies That Outsource Their Customer Service To India, But Then Those Support Reps Don'T Have Full Access To All The Needed Info, So Eventually They Transfer You Back To A Manager In The Us To Deal With It.", "Water Stains On The Cutlery (From The Dishwasher).", "Cracking Your Knuckles.", "Speed Bumps.", "People Who Tell You 'Oh! You Have To Try This! It'S The Best Thing Ever!' And When You Do Try It And It Sucks.", "Drivers Who Drive Slow In The Left Lane.", "People Who Eat While Talking On The Phone To Me.", "People That Fart In Public.", "People Who Invade My Seat Space, Like On Airplanes Or In Movie Theaters.", "People That Make Tons And Tons Of Noise While Working Out.", "Women Who Are Obviously Bottle Blondes Who Still Blame Their Stupidity On Being Blonde, As In: “Oh, No! I’M Having A Blonde Moment!”", "People/Kids Who Tap Their Pencil During A Test.", "Sneezing In Your Hand And Shaking Someone'S Hand Afterward.", "Kids With Baggy Pants Hangin Below Their Ass.", "Movie Talkers", "People Who Always Look To Start A Fight.", "When A Utility Sends You A Letter About A Rate Increase That Opens With: 'In Order To Serve You Better.'", "People Who Spit When They Talk.", "When Men You Don'T Know Very Well At All Assume It Is Okay To Call You 'Hun' Or 'Babe.'", "When People Bite Their Nails In The Dead Of Silence And You Hear Them Eating It.", "Water Running While Brushing Teeth.", "Women Who Use Pms As An Excuse To Be Bitchy.", "People Who Finish My Sentences For You.", "People Who Constantly Sniffle.", "People Who Interrupt You To Correct Your Grammar/Speech, Paying No Attention To The Point You Are Trying To Make.", "People Who Make Up Words.", "Tangled Phone Cords.", "Using A Napkin For Eating Messy Food & Leaving It On The Table Throughout The Meal", "When People Say 'You And I' When It Should Be 'You And Me'.", "When The String On The Hood Of Your Sweatshirt Goes Inside The Hood.", "People Trying To Enter An Elevator When People In The Elevator Haven'T Left Yet.", "When You Have To Go To The Bathroom Really Bad After Getting Out Of The Shower And You Don'T Dry Off All The Way, Making The Toilet Seat All Slippery.", "People Who Are Always Negative.", "If You Pee On The Seat, Wipe It Off.", "Driveways That Make Cars Bottom Out.", "Clicking Pens.", "People Who Assume Far Too Much.", "An Unmade Bed.", "Barking Dogs When I Am Trying To Sleep.", "People That Realize That A Lane Of Traffic Is Backed Up So They Go Into The Next Lane Over Because It Is Moving Quicker And They Go Up To The Front And Expect Someone To Just Let Them Back Over In That Lane.", "Having To Explain The Same Thing More Than Once.", "People Who Wear Sunglasses Indoors.", "People Who Don'T Say 'Thank You' Or Even Acknowledge You When You Hold The Door For Them.", "People Who Bite Their Nails.", "When People Cough In Front Of You Without Covering Their Mouth.", "People Who Quote Movies Just Because They Can.", "Getting Stuck At Red Lights, While Nobody Is Going The Other Direction.", "People Who Don’T Put Two Spaces After A Period When They Type.", "When People Don'T Flush The Toilet.", "Broken Spines On Paperback Books.", "Restaurants That Give You Rolls, But Never Enough Butter To Go With Them.", "A Well Done Steak Or Burger When It Was Ordered 'Rare'", "When People That Say That They Read Something At A Certain Site But Don'T Add The Link.", "People Who Whistle Through Their Noses While Just Breathing.", "When I'M Having A Coversation With Someone, & I'M In The Middle Of Telling A Story And Some Rude Idiot Comes Walking Up And Starts A Conversation With The Person I'M Talking To...As If I'M Not Even There!", "People That Wait Until The Last Minute.", "Incorrect Use Of Apostrophe'S.", "Parents Who Plead With Toddlers.", "People That Burp Loudly In Public.", "Wobbly Tables.", "People Who Text During A Movie.", "When It'S Raining And You Turn Your Car Off Before You Turn The Wipers Off, And They Stop In The Middle Of The Windshield, So You Turn The Car Back On, The Wipers Off, And Then The Car Off.", "Chewing Gum On The Sidewalk.", "Free Offer That Always Have A Catch.", "When Someone Tries To Talk To You When You Have Headphones On.", "People Who Respond To My Emails But Don'T Include The Text Of The Previous Email In Their Email.", "Men Who Refer To Their Wife As ” The Wife”- A Wife Is Not An Object.", "When Coffee Spills Out Of The Top Drinking Hole Of Lids On To-Go Coffee Cups.", "How Commercialized The Holidays Are.", "People Who Pick Their Teeth In Public.", "Snorting When You Laugh.", "Hypocrites (Yeah, You Know Who Your Are)", "People Who Interrupt You And Direct The Conversation To Themselves.", "People Who Make Small Talk With A Cashier When There’S A Long Line Behind Them.", "Stores With Tv Monitors At The Checkouts That Play Commercials.", "Spit Flying Out Of People'S Mouth By Accident.", "Tv Shows And Commercials Ads With Ringing Doorbells Or Phones, Which Make You Into Thinking The Sound Is Coming From Your House.", "I Hate When Restaurant Staff Starts Clearing Dishes Away When Not Everyone Has Finished Eating -- Leaving The One Person At A Table Of Four To Feel Bad They Haven'T Finished Yet.", "People Who Can'T Seem To Understand That ' Red Eyes' Are Possible To Remove In Photos.", "Improper Use Of The Word Ironic", "Waitors/Waitresses With Dirty Fingernails.", "People Who Scrape Their Fork Around The Plate.", "Backwash.", "Eating In Bed And Leaving Crumbs", "Spammers.", "Fake Laughter.", "People Who Call But Don'T Leave A Message.", "Wasting Food, Like When A Person Takes A Full Plateful Of Food And Then Eat Two Bites.", "People Who Don'T Vote And Then Complain About The Results.", "People Who Try To Talk To You When You Are Going To The Bathroom.", "When You'Re Wearing A Hat, After A While It Feels Like It'S Not There. When You Take It Off, It Feels Like It'S Still There.", "Famous People Name Their Kids Strange Names.", "People Who Say, 'Goddamnit' Or 'Jesus Christ' When They'Re Angry.", "Characters In Movies Always Order Food Then End Up Leaving The Table Long Before The Food Could Be Served.", "Characters That Have Just Met Each Other In Movies Arrange Dates Without Exchanging Any Contact Or Meet Information.", "How People Merging Onto A Highway Or Interstate Always Fail To Reach A Merging Speed And Cause Havoc.", "People Who Don’T Know Or Don’T Care That They Have No Tail Lights Working, At All.", "Cops Who Tailgate You, Unsafely For Miles As If You’Re Driving To Slow, Them Knowing You’Re Not Going To Speed Up, Because There Is A Cop Behind Them!", "Cops Who Spin/Burn Their Tires, With No Emergency. No One Else Is Allowed To.", "Tables At Restuarants That Are Next To Or In The Direct Line Of View Of The Restrooms. I Don'T Want To Look At And Think About People Going To The Bathroom While I Eat.", "People, When Asked How They Are Doing, Say “Good' When They Should Use “Well'."};
        PP1Field.setText(genThing(PP));
        PP2Field.setText(genThing(PP));
        String[] pets = {"Retrievers (Labrador)", "Abyssinian", "Aegean", "Affenpinscher", "Affenpinschers", "Afghan Hound", "Afghan Hounds", "Afghan Shepherd", "Aidi", "Airedale Terrier", "Airedale Terriers", "Akbash", "Akita Inu", "Akitas", "Alano Español", "Alaska (Rabbit)", "Alaskan Husky", "Alaskan Klee Kai", "Alaskan Malamute", "Alaskan Malamutes", "Albino Corn Snake", "Alpine Dachsbracke", "Alpine Spaniel", "Altex (Rabbit)", "American (Rabbit)", "American Akita", "American Bobtail", "American Bulldog", "American Cocker Spaniel", "American Curl", "American English Coonhound", "American English Coonhounds", "American Eskimo Dog", "American Eskimo Dogs", "American Foxhound", "American Foxhounds", "American Fuzzy Lop (Rabbit)", "American Hairless Terrier", "American Hairless Terriers", "American Pit Bull Terrier", "American Sable (Rabbit)", "American Shorthair", "American Staffordshire Terrier", "American Staffordshire Terriers", "American Water Spaniel", "American Wirehair", "Anatolian Shepherd Dog", "Anatolian Shepherd Dogs", "Andalusian Hound", "Anglo-Français De Petite Vénerie", "Appenzeller Sennenhund", "Arabian Mau", "Argente Brun (Rabbit)", "Argente Clair (Rabbit)", "Argente Crème (Rabbit)", "Argente De Champagne (Rabbit)", "Argente Flopper (Rabbit)", "Argente Noir (Rabbit)", "Argente St Hubert (Rabbit)", "Ariege Pointer", "Ariegeois", "Armant", "Armenian Gampr Dog", "Artois Hound", "Asian", "Asian Semi-Longhair", "Australian Cattle Dog", "Australian Cattle Dogs", "Australian Kelpie", "Australian Mist", "Australian Shepherd", "Australian Shepherds", "Australian Silky Terrier", "Australian Stumpy Tail Cattle Dog", "Australian Terrier", "Australian Terriers", "Austrian Black And Tan Hound", "Austrian Pinscher", "Azawakh", "Bairds Rat Snake", "Bakharwal Dog", "Baladi (Rabbit)", "Balinese", "Ball Python", "Bambino", "Banded Water Snake", "Barbet", "Basenji", "Basenjis", "Basque Ratter", "Basque Shepherd Dog", "Basset Artésien Normand", "Basset Bleu De Gascogne", "Basset Fauve De Bretagne", "Basset Griffon Vendéen, Grand", "Basset Griffon Vendéen, Petit", "Basset Hound", "Basset Hounds", "Bauscat (Rabbit)", "Bavarian Mountain Hound", "Beagle", "Beagle-Harrier", "Beagles", "Bearded Collie", "Bearded Collies", "Bearded Dragon", "Beauceron", "Beaucerons", "Bedlington Terrier", "Bedlington Terriers", "Beige (Rabbit)", "Belgian Hare (Rabbit)", "Belgian Malinois", "Belgian Sheepdogs", "Belgian Shepherd Dog (Groenendael)", "Belgian Shepherd Dog (Laekenois)", "Belgian Shepherd Dog (Malinois)", "Belgian Shepherd Dog (Tervuren)", "Belgian Tervuren", "Bengal", "Bergamasco", "Bergamasco Shepherd", "Berger Blanc Suisse", "Berger Picard", "Berger Picards", "Berner Laufhund", "Bernese Mountain Dog", "Bernese Mountain Dogs", "Beveren (Rabbit)", "Bichon Frisé", "Bichons Frises", "Big Silver Marten (Rabbit)", "Billy", "Birman", "Black And Tan Coonhound", "Black And Tan Coonhounds", "Black And Tan Virginia Foxhound", "Black Norwegian Elkhound", "Black Rat Snake", "Black Russian Terrier", "Black Russian Terriers", "Blackmouth Cur", "Blanc De Bouscat (Rabbit)", "Blanc De Hotot (Rabbit)", "Blanc De Popielno (Rabbit)", "Blanc De Termonde (Rabbit)", "Bleu De Gascogne, Grand", "Bleu De Gascogne, Petit", "Blood Python", "Bloodhound", "Bloodhounds", "Blue Heeler", "Blue Lacy", "Blue Of Ham (Rabbit)", "Blue Of Sint-Niklaas (Rabbit)", "Blue Paul Terrier", "Bluetick Coonhound", "Bluetick Coonhounds", "Boa Constrictor", "Boerboel", "Boerboels", "Bohemian Shepherd", "Bolognese", "Bombay", "Border Collie", "Border Collies", "Border Terrier", "Border Terriers", "Borzoi", "Borzois", "Bosnian Coarse-Haired Hound", "Boston Terrier", "Boston Terriers", "Bourbonnais Grey (Rabbit)", "Bouvier Des Ardennes", "Bouvier Des Flandres", "Bouviers Des Flandres", "Boxer", "Boxers", "Boykin Spaniel", "Bracco Italiano", "Braque D'Auvergne", "Braque Du Bourbonnais", "Braque Du Puy", "Braque Francais", "Braque Saint-Germain", "Brazilian (Rabbit)", "Brazilian Dogo", "Brazilian Shorthair", "Brazilian Terrier", "Briard", "Briards", "Briquet Griffon Vendéen", "Britannia Petite (Rabbit)", "British Giant (Rabbit)", "British Longhair", "British Semi-Longhair", "British Shorthair", "Brittany", "Brittanys", "Broholmer", "Brown Chestnut Of Lorraine (Rabbit)", "Bruno Jura Hound", "Brussels Griffons", "Bucovina Shepherd Dog", "Bull And Terrier", "Bull Terrier", "Bull Terrier (Miniature)", "Bull Terriers", "Bulldog", "Bulldogs", "Bullenbeisser", "Bullmastiff", "Bullmastiffs", "Bully Kutta", "Burgos Pointer", "Burmese", "Burmese Python", "Burmilla", "Cairn Terrier", "Cairn Terriers", "Caldes (Rabbit)", "California Spangled", "Californian (Rabbit)", "Campbell'S Hamster", "Canaan Dog", "Canaan Dogs", "Canadian Eskimo Dog", "Cane Corso", "Cantabrian Water Dog", "Cão Da Serra De Aires", "Cão De Castro Laboreiro", "Cão De Gado Transmontano", "Cão Fila De São Miguel", "Cardigan Welsh Corgis", "Carmagnola Grey (Rabbit)", "Carolina Dog", "Carpathian Shepherd Dog", "Carpet Python", "Cashmere Lop (Rabbit)", "Catahoula Cur", "Catalan Sheepdog", "Caucasian Shepherd Dog", "Cavalier King Charles Spaniel", "Cavalier King Charles Spaniels", "Central Asian Shepherd Dog", "Cesky Fousek", "Cesky Terrier", "Cesky Terriers", "Chameleon", "Chantilly-Tiffany", "Chartreux", "Chaudry (Rabbit)", "Chausie", "Checkered Giant (Rabbit)", "Cheetoh", "Chesapeake Bay Retriever", "Chien Français Blanc Et Noir", "Chien Français Blanc Et Orange", "Chien Français Tricolore", "Chien-Gris", "Chihuahua", "Chihuahuas", "Chilean Fox Terrier", "Chinchilla", "Chinchilla (American) (Rabbit)", "Chinchilla (Giant) (Rabbit)", "Chinchilla (Giganta) (Rabbit)", "Chinchilla (Standard) (Rabbit)", "Chinese Chongqing Dog", "Chinese Crested", "Chinese Crested Dog", "Chinese Hamster", "Chinese Imperial Dog", "Chinese Shar-Pei", "Chinook", "Chinooks", "Chippiparai", "Chow Chow", "Chow Chows", "Cierny Sery", "Cinnamon (Rabbit)", "Cirnechi Dell'Etna", "Cirneco Dell'Etna", "Clumber Spaniel", "Collie, Rough", "Collie, Smooth", "Collies", "Colorpoint Persian", "Colorpoint Shorthair", "Combai", "Common Boa", "Continental Giant (Rabbit)", "Cordoba Fighting Dog", "Corn Snake", "Cornish Rex", "Coton De Tulear", "Crested Gecko", "Cretan Hound", "Cricket", "Criollo (Rabbit)", "Croatian Sheepdog", "Cuban Brown (Rabbit)", "Cumberland Sheepdog", "Curly Coated Retriever", "Cursinu", "Cymric", "Cyprus", "Czech Albin (Rabbit)", "Czech Red (Rabbit)", "Czech Spot (Rabbit)", "Czechoslovak Wolfdog", "Dachshund", "Dachshunds", "Dalmatian", "Dalmatians", "Dandie Dinmont Terrier", "Dandie Dinmont Terriers", "Danish Swedish Farmdog", "Decker Rat Terrier", "Deilenaar (Rabbit)", "Deutsche Bracke", "Devon Rex", "Doberman Pinscher", "Doberman Pinschers", "Dogo Argentino", "Dogo Cubano", "Dogue De Bordeaux", "Dogues De Bordeaux", "Don Sphynx", "Donskoy", "Dragon Li", "Drentse Patrijshond", "Drever", "Dunker", "Dutch (Rabbit)", "Dutch (Tri-Coloured) (Rabbit)", "Dutch Shepherd Dog", "Dutch Smoushond", "Dwarf Cat", "Dwarf Hotot (Rabbit)", "Dwarf Lop (Mini Lop In Usa) (Rabbit)", "Dwelf", "East Siberian Laika", "East-European Shepherd", "Egyptian Mau", "Elfin (Rabbit)", "Elo", "Enderby Island (Rabbit)", "English Angora (Rabbit)", "English Cocker Spaniel", "English Foxhound", "English Foxhounds", "English Lop (Rabbit)", "English Mastiff", "English Setter", "English Shepherd", "English Spot (Rabbit)", "English Springer Spaniel", "English Toy Spaniels", "English Toy Terrier (Black & Tan)", "English Water Spaniel", "English White Terrier", "Entlebucher Mountain Dog", "Entlebucher Mountain Dogs", "Épagneul Bleu De Picardie", "Estonian Hound", "Estrela Mountain Dog", "Eurasier", "Eurohound", "European Shorthair", "Exotic Shorthair", "Fauve De Bourgogne (Rabbit)", "Fee De Marbourg (Marburger) (Rabbit)", "Ferret", "Field Spaniel", "Fila Brasileiro", "Finnish Hound", "Finnish Lapphund", "Finnish Lapphunds", "Finnish Spitz", "Flat-Coated Retriever", "Flemish Giant (Rabbit)", "Florida White (Rabbit)", "Foldex (Official Breed - Cca/Afc)", "Fox Terrier (Smooth)", "Fox Terrier, Wire", "Fox Terriers (Smooth)", "Fox Terriers (Wire)", "French Angora (Rabbit)", "French Brittany", "French Bulldog", "French Bulldogs", "French Lop (Rabbit)", "French Spaniel", "Frog", "Gabali (Rabbit)", "Gaddi Dog", "Galgo Español", "Galician Cattle Dog", "Garafian Shepherd", "Garter Snake", "Gascon Saintongeois", "Georgian Shepherd Dog", "Gerbil", "German Angora (Rabbit)", "German Longhaired Pointer", "German Lop (Rabbit)", "German Pinscher", "German Pinschers", "German Rex", "German Rough-Haired Pointer", "German Shepherd", "German Shepherd Dog", "German Shepherd Dogs", "German Shorthaired Pointer", "German Spaniel", "German Spitz", "German Wirehaired Pointer", "Giant Angora (Rabbit)", "Giant Papillon (Rabbit)", "Giant Schnauzer", "Giant Schnauzers", "Giza White (Rabbit)", "Glen Of Imaal Terrier", "Glen Of Imaal Terriers", "Golden Glavcot (Rabbit)", "Golden Retriever", "Gordon Setter", "Gotland (Rabbit)", "Gran Mastín De Borínquen", "Grand Anglo-Français Blanc Et Noir", "Grand Anglo-Français Blanc Et Orange", "Grand Anglo-Français Tricolore", "Grand Griffon Vendéen", "Great Dane", "Great Danes", "Great Plains Rat Snake", "Great Pyrenees", "Greater Swiss Mountain Dog", "Greater Swiss Mountain Dogs", "Greek Harehound", "Green Tree Python", "Greenland Dog", "Grey Pearl Of Halle (Rabbit)", "Grey Rat Snake", "Greyhound", "Greyhounds", "Griffon Bleu De Gascogne", "Griffon Bruxellois", "Griffon Fauve De Bretagne", "Griffon Nivernais", "Guatemalan Dogo", "Guinea Pig", "Güzelçamlı Rabbit (Rabbit)", "Hamiltonstövare", "Hamster", "Hanover Hound", "Hare Indian Dog", "Harlequin (Rabbit)", "Harrier", "Harriers", "Havana (Rabbit)", "Havana Brown", "Havanese", "Hawaiian Poi Dog", "Hedgehog", "Hermit Crab", "Highlander", "Himalayan", "Himalayan (Rabbit)", "Himalayan Sheepdog", "Hognose Snake", "Hokkaido Ken", "Hortaya Borzaya", "Hovawart", "Hulstlander (Rabbit)", "Hungarian Giant (Rabbit)", "Huntaway", "Hygenhund", "Ibizan Hound", "Ibizan Hounds", "Icelandic Sheepdog", "Icelandic Sheepdogs", "Iguana", "Indian Pariah Dog", "Indian Spitz", "Irish Red And White Setter", "Irish Setter", "Irish Terrier", "Irish Terriers", "Irish Water Spaniel", "Irish Wolfhound", "Irish Wolfhounds", "Istrian Coarse-Haired Hound", "Istrian Shorthaired Hound", "Italian Greyhound", "Italian Greyhounds", "Jack Russell Terrier", "Jagdterrier", "Jämthund", "Japanese Bobtail", "Japanese Chin", "Japanese Spitz", "Japanese Terrier", "Japanese White (Rabbit)", "Javanese", "Jersey Wooly (Rabbit)", "Kabyle (Rabbit)", "Kai Ken", "Kaikadi", "Kangal Dog", "Kanni", "Karakachan Dog", "Karelian Bear Dog", "Karst Shepherd", "Keeshond", "Keeshonden", "Kenyan Sand Boa", "Kerry Beagle", "Kerry Blue Terrier", "Kerry Blue Terriers", "Khao Manee", "King Charles Spaniel", "King Shepherd", "King Snake", "Kingsnake", "Kintamani", "Kishu Ken", "Komondor", "Komondorok", "Kooikerhondje", "Koolie", "Korat", "Korean Bobtail", "Korean Jindo Dog", "Korn Ja", "Kromfohrländer", "Kumaon Mastiff", "Kunming Wolfdog", "Kurī", "Kuril Islands Bobtail", "Kurilian Bobtail", "Kuvasz", "Kuvaszok", "Kyi-Leo", "Labrador Husky", "Labrador Retriever", "Lagotti Romagnoli", "Lagotto Romagnolo", "Lakeland Terrier", "Lakeland Terriers", "Lancashire Heeler", "Landseer", "Laperm", "Lapponian Herder", "Leonberger", "Leonbergers", "Lepoard Gecko", "Lhasa Apso", "Lhasa Apsos", "Lilac (Rabbit)", "Lionhead (Rabbit)", "Liptov Baldspotted Rabbit (Rabbit)", "Lithuanian Hound", "Longhaired Whippet", "Lowchen", "Löwchen", "Lykoi", "Mackenzie River Husky", "Magyar Agár", "Mahratta Greyhound", "Maine Coon", "Majorca Ratter", "Majorca Shepherd Dog", "Maltese", "Manchester Terrier", "Manchester Terriers", "Manx", "Manx Longhair", "Maremma Sheepdog", "Mastiffs", "Mcnab", "Mealworm", "Meissner Lop (Rabbit)", "Mekong Bobtail", "Mellerud Rabbit (Rabbit)", "Mexican Hairless Dog", "Milk Snake", "Milksnake", "Mini Lion Lop (Rabbit)", "Miniature American Shepherd", "Miniature American Shepherds", "Miniature Australian Shepherd", "Miniature Bull Terriers", "Miniature Fox Terrier", "Miniature Lop (Holland Lop In Usa) (Rabbit)", "Miniature Pinscher", "Miniature Pinschers", "Miniature Schnauzer", "Miniature Schnauzers", "Miniature Shar Pei", "Minskin", "Mioritic", "Molossus", "Molossus Of Epirus", "Monitor", "Montenegrin Mountain Hound", "Moscow Watchdog", "Moscow Water Dog", "Mountain Cur", "Mouse", "Mucuchies", "Mudhol Hound", "Mudi", "Munchkin", "Münsterländer, Large", "Münsterländer, Small", "Murcian Ratter", "Napoleon", "Neapolitan Mastiff", "Neapolitan Mastiffs", "Nebelung", "Netherland Dwarf (Rabbit)", "New Zealand (Rabbit)", "New Zealand Heading Dog", "New Zealand Red (Rabbit)", "Newfoundland", "Newfoundlands", "Norfolk Spaniel", "Norfolk Terrier", "Norfolk Terriers", "Norrbottenspets", "North Country Beagle", "Northern Inuit Dog", "Norwegian Buhund", "Norwegian Buhunds", "Norwegian Elkhound", "Norwegian Elkhounds", "Norwegian Forest Cat", "Norwegian Lundehund", "Norwegian Lundehunds", "Norwich Terrier", "Norwich Terriers", "Nova Scotia Duck-Tolling Retriever", "Ocicat", "Ojos Azules", "Old Croatian Sighthound", "Old Danish Pointer", "Old English Sheepdog", "Old English Sheepdogs", "Old English Terrier", "Old German Shepherd Dog", "Old Time Farm Shepherd", "Olde English Bulldogge", "Oregon Rex", "Orestad (Rabbit)", "Oriental Bicolor", "Oriental Longhair", "Oriental Shorthair", "Otterhound", "Otterhounds", "Pachon Navarro", "Paisley Terrier", "Palomino (Rabbit)", "Pandikona Hunting Dog", "Pannon White (Rabbit)", "Papillon", "Papillons", "Parson Russell Terrier", "Parson Russell Terriers", "Patterdale Terrier", "Pekingese", "Pembroke Welsh Corgis", "Perfold (Experimental Breed - Wcf)", "Perlfee (Rabbit)", "Perro De Presa Canario", "Perro De Presa Mallorquin", "Perro Fino Colombiano", "Persian (Modern Persian Cat)", "Persian (Traditional Persian Cat)", "Peruvian Hairless Dog", "Peterbald", "Petits Bassets Griffons Vendeens", "Phalène", "Pharaoh Hound", "Pharaoh Hounds", "Phu Quoc Ridgeback Dog", "Picardy Spaniel", "Pixie-Bob", "Plott Hound", "Plotts", "Plush Lop (Mini) (Rabbit)", "Plush Lop (Standard) (Rabbit)", "Podenco Canario", "Pointed Beveren (Rabbit)", "Pointer", "Pointers", "Pointers (German Shorthaired)", "Pointers (German Wirehaired)", "Poitevin", "Polish (Rabbit)", "Polish Greyhound", "Polish Hound", "Polish Hunting Dog", "Polish Lowland Sheepdog", "Polish Lowland Sheepdogs", "Polish Tatra Sheepdog", "Pomeranian", "Pomeranians", "Pont-Audemer Spaniel", "Poodle", "Poodles", "Porcelaine", "Portuguese Podengo", "Portuguese Podengo Pequenos", "Portuguese Pointer", "Portuguese Water Dog", "Portuguese Water Dogs", "Posavac Hound", "Pražský Krysařík", "Pudelpointer", "Pug", "Pugs", "Puli", "Pulik", "Pumi", "Pungsan Dog", "Pyrenean Mastiff", "Pyrenean Shepherd", "Pyrenean Shepherds", "Raas", "Rabbit", "Rafeiro Do Alentejo", "Ragamuffin", "Ragdoll", "Rainbow Boa", "Rajapalayam", "Rampur Greyhound", "Rastreador Brasileiro", "Rat", "Rat Snake", "Rat Terrier", "Rat Terriers", "Ratonero Bodeguero Andaluz", "Ratonero Valenciano", "Red-Tailed Boa", "Red-Tailed Green Rat Snake", "Redbone Coonhound", "Redbone Coonhounds", "Retrievers (Chesapeake Bay)", "Retrievers (Curly-Coated)", "Retrievers (Flat-Coated)", "Retrievers (Golden)", "Retrievers (Nova Scotia Duck Tolling)", "Rex (Astrex) (Rabbit)", "Rex (Mini) (Rabbit)", "Rex (Opossum) (Rabbit)", "Rex (Standard) (Rabbit)", "Rhinelander (Rabbit)", "Rhodesian Ridgeback", "Rhodesian Ridgebacks", "Roborovski Hamster", "Rosy Boa", "Rottweiler", "Rottweilers", "Rough Green Snake", "Royal Python", "Russell Terrier", "Russell Terriers", "Russian Blue", "Russian Spaniel", "Russian Toy", "Russian Tracker", "Russian White, Black And Tabby", "Russo-European Laika", "Saarlooswolfhond", "Sabueso Español", "Sachsengold (Rabbit)", "Saint-Usuge Spaniel", "Sakhalin Husky", "Sallander (Rabbit)", "Saluki", "Salukis", "Sam Sawet", "Samoyed", "Samoyeds", "San Juan (Rabbit)", "Sand Boa", "Santal Hound", "Sapsali", "Šarplaninac", "Satin (Mini) (Rabbit)", "Satin (Rabbit)", "Satin Angora (Rabbit)", "Savannah", "Schapendoes", "Schillerstövare", "Schipperke", "Schipperkes", "Schweizer Laufhund", "Schweizerischer Niederlaufhund", "Scorpion", "Scotch Collie", "Scottish Deerhound", "Scottish Deerhounds", "Scottish Fold", "Scottish Terrier", "Scottish Terriers", "Sealyham Terrier", "Sealyham Terriers", "Segugio Italiano", "Selkirk Rex", "Seppala Siberian Sleddog", "Serbian Hound", "Serbian Tricolour Hound", "Serengeti", "Serrade Petit", "Seskar Seal Dog", "Setters (English)", "Setters (Gordon)", "Setters (Irish Red And White)", "Setters (Irish)", "Shar Pei", "Shetland Sheepdog", "Shetland Sheepdogs", "Shiba Inu", "Shih Tzu", "Shikoku Ken", "Shiloh Shepherd Dog", "Siamese", "Siamese Sable (Rabbit)", "Siberian", "Siberian (Rabbit)", "Siberian Huskies", "Siberian Husky", "Silken Windhound", "Silky Terriers", "Silver (Rabbit)", "Silver Fox (Rabbit)", "Silver Marten (Rabbit)", "Singapura", "Sinhala Hound", "Skunks", "Skye Terrier", "Skye Terriers", "Sloughi", "Sloughis", "Slovak Cuvac", "Slovakian Rough-Haired Pointer", "Slovenský Kopov", "Smålandsstövare", "Small Greek Domestic Dog", "Smoke Pearl (Rabbit)", "Snow Corn Snake", "Snowshoe", "Soft Coated Wheaten Terriers", "Soft-Coated Wheaten Terrier", "Sokoke", "Somali", "Sonoran Gopher Snake", "South Russian Ovcharka", "Southern Hound", "Spaniels (American Water)", "Spaniels (Boykin)", "Spaniels (Clumber)", "Spaniels (Cocker)", "Spaniels (English Cocker)", "Spaniels (English Springer)", "Spaniels (Field)", "Spaniels (Irish Water)", "Spaniels (Sussex)", "Spaniels (Welsh Springer)", "Spanish Giant (Rabbit)", "Spanish Mastiff", "Spanish Water Dog", "Spanish Water Dogs", "Sphynx", "Spinone Italiano", "Spinoni Italiani", "Sporting Lucas Terrier", "Squirrel (Rabbit)", "St. Bernard", "St. Bernards", "St. John'S Water Dog", "Stabyhoun", "Staffordshire Bull Terrier", "Staffordshire Bull Terriers", "Standard Schnauzer", "Standard Schnauzers", "Stephens Cur", "Styrian Coarse-Haired Hound", "Sugar Glider", "Suphalak", "Sussex (Rabbit)", "Sussex Spaniel", "Swedish Lapphund", "Swedish Vallhund", "Swedish Vallhunds", "Swiss Fox (Rabbit)", "Syrian Hamster", "Tadla (Rabbit)", "Tahltan Bear Dog", "Taigan", "Taiwan Dog", "Talbot", "Tamaskan Dog", "Tan (Rabbit)", "Tangerine Honduran Milksnake", "Tarantula", "Teddy Roosevelt Terrier", "Teddywidder (Rabbit)", "Telomian", "Tennessee Treeing Brindle", "Tenterfield Terrier", "Terceira Mastiff", "Thai", "Thai Bangkaew Dog", "Thai Lilac", "Thai Ridgeback", "Thrianta (Rabbit)", "Thuringer (Rabbit)", "Tibetan Mastiff", "Tibetan Mastiffs", "Tibetan Spaniel", "Tibetan Spaniels", "Tibetan Terrier", "Tibetan Terriers", "Tonkinese", "Tornjak", "Tortoise", "Tosa", "Toy Bulldog", "Toy Fox Terrier", "Toy Fox Terriers", "Toy Manchester Terrier", "Toy Trawler Spaniel", "Toyger", "Transylvanian Hound", "Treeing Cur", "Treeing Walker Coonhound", "Treeing Walker Coonhounds", "Trigg Hound", "Turkish Angora", "Turkish Van", "Turtle", "Tweed Water Spaniel", "Tyrolean Hound", "Ukrainian Levkoy", "Uromastyx", "Uruguayan Cimarron", "Vanjari Hound", "Vienna (Rabbit)", "Villano De Las Encartaciones", "Vizsla", "Vizslas", "Volpino Italiano", "Weimaraner", "Weimaraners", "Welsh Corgi, Cardigan", "Welsh Corgi, Pembroke", "Welsh Sheepdog", "Welsh Springer Spaniel", "Welsh Terrier", "Welsh Terriers", "West Highland White Terrier", "West Highland White Terriers", "West Siberian Laika", "Westphalian Dachsbracke", "Wetterhoun", "Wheaten (Rabbit)", "Wheaten Lynx (Rabbit)", "Whippet", "Whippets", "White Shepherd", "Winter White Hamster", "Wirehaired Pointing Griffon", "Wirehaired Pointing Griffons", "Wirehaired Vizsla", "Wirehaired Vizslas", "Xiasi Dog", "Xoloitzcuintli", "Yellow Rat Snake", "Yorkshire Terrier", "Yorkshire Terriers", "Zemmouri (Rabbit)", "Black And White Tegu", "Lovebirds", "Cockatiels", "Small Parakeets", "Parrotlets", "Caiques", "Small Conures", "Pionus Parrots", "Lories & Lorikeets", "Large Parakeets", "African Greys", "Poicephalus", "Eclectus", "Small Cockatoos", "Large Conures", "Large Cockatoos", "Amazons", "Macaws", "Hawk Headed Parrots", "Mini-Macaws", "Crows", "Doves & Pigeons", "Mynah Birds", "Toucans", "Purple", "American Goldfinch", "European Goldfinch", "Gouldian", "House", "Zebra", "Bourke’S (Parakeet)", "Budgerigar (Parakeet)", "Lineolated (Parakeet)", "Alexandrine (Parakeet)", "Derbyan (Parakeet)", "Quaker (Parakeet)", "Indian Ringneck (Parakeet)", "Regent (Parakeet)", "Plum-Headed (Parakeet)", "Rosella (Parakeet)", "Peach-Fronted Conure", "Sun Conure", "Black-Capped Conure", "Blue-Throated Conure", "Crimson-Bellied Conure", "Green-Cheeked Conure", "Maroon-Bellied Conure", "Blue-Crowned Conure", "Brown-Throated Conure", "Cherry-Headed Conure", "Dusky-Headed Conure", "Jenday Conure", "Mitred Conure", "Nanday Conure", "Orange-Fronted Conure", "Bourke’S", "Budgerigar", "Lineolated", "Alexandrine", "Derbyan", "Quaker", "Indian Ringneck", "Plum-Headed", "Regent", "Rosella"};
        PetField.setText(genThing(pets));
        PetField1.setText(genThing(pets));
        String[] fam = {"Abyss Striker ", "Acid-Tongue Serpenta", "Aer Phantom", "Agol", "Algae-Bottom Slarg", "Almandine Sturgeon", "Amaranth Moth", "Amber Gulper", "Amberwing Waveskimmer", "Amethyst King", "Ancient Fungus ", "Animated Armor", "Animated Statue", "Anomalous Nekomata", "Anomalous Skink", "Apatite Fisher", "Arctic Hippalectryon", "Armored Duskflapper", "Ashcscale Ophiotaurus", "Ashspine Widow", "Augite Protector", "Autumn Dryad ", "Autumn Millifae", "Autumn Sea Dragon", "Axe Mimic", "Baku ", "Ball-Jointed Bogsneak", "Bamboo Phytocat ", "Banded Owlcat ", "Barkback Boar", "Barking Jester", "Barred Skira", "Basalt Vent Hop", "Basilisk ", "Bearded Yeti", "Bellus Glamortail", "Black Dwarf Unicorn ", "Black Iron Creeper", "Black Wolf", "Black-Wing Hummingbird", "Blacktalon Striker", "Blackwing Croaker", "Bloodstone Beetle", "Blooming Strangler", "Blue Dragon Reef Snail", "Blue Tang Hippogriff", "Blue Vein Pansy", "Blueband Duelist", "Bluefin Charger", "Bluelight Chipskink", "Bluemoon Aviar", "Blueridge Greatshell", "Bluetail Skira", "Bogsneak Puppet", "Bogus Manamonger", "Boran Veteran", "Bramble Guardian", "Brightwing Dwarf Hainu", "Brilliant Psywurm", "Brown River Flight", "Brown-Spotted Mith", "Brush Dodo", "Bucktooth Digger", "Budwing Morpho", "Bumble", "Butter Caiman", "Cactus Marzal", "Calculating Candelabra", "Candycane Xolo", "Cardinal Hippogriff", "Carmine Serthis", "Carrioncorn", "Ceanothus Brawler", "Celestial Antelope", "Centaur Archer", "Centaur Berserker", "Chalcedony Snipper", "Charcoal Sprangyroo", "Cheerful Residue", "Cherry Blossom Caterpillar", "Chillwind Harpy", "Chimera", "Chipskink", "Chocolate Ferret", "Chromefeather Lookout", "Cinder Mith", "Cinderkelp Loach", "Citrine Cave Jewel", "Clattercog Engineer", "Clearwater Oracle", "Cloud Chaser", "Clouddancer", "Clouded Mith", "Clown Charger", "Clown Hippocampus", "Coarsefur Yeti", "Cockatrice", "Colorburst Buttersnake", "Common Podid", "Conjoined Skink", "Construction Mith", "Coppercoil Creeper", "Coral Basilisk", "Coral Carpenter", "Corpse Cleaner", "Corrosive Depin", "Corundum Chameleon", "Crimson Emperor", "Crimson Reef Snail", "Crooked Hatchet", "Crowned Bonepriest", "Crowned Roc", "Crystal Carrier", "Crystalhide Jester", "Crystalplate Stinger", "Cumulus Seal", "Cursed Bat", "Dainty Wavehopper", "Dappled Dunhoof", "Dappled Seal", "Dark-Tufted Sparrowmouse", "Darktouched Chimera", "Daydream Puffer", "Deadly Reflection", "Deadwood Boar", "Death Seeker", "Death’S-Head Stag", "Deepmine Aardvark", "Deeprealm Hunter", "Depin", "Dire Hyena", "Disoriented Spirit", "Dodo", "Double-Tailed Warcat", "Downy Fox Rat", "Dreadram", "Dreameater", "Driftwood Baron", "Dryad", "Dunewind Manticore", "Dunhoof Ambassador", "Duskthicket Bonepicker", "Dwarf Hainu Macaw", "Dwarf Truffle", "Dwarf Unicorn", "Ectoplasmime", "Elk", "Ember Mouse", "Emerald Cave Jewel", "Emerald Webwing", "Emeraldback Shardspawn", "Empress Beetle", "Enamored Swan", "Enchanted Armaments", "Ensorcelled Volume", "Ethereal Trickster", "Everglade Lasher", "Extinguished Jackalope", "Fallbrush Fraud", "Fallen Streak", "Fallout Streak", "Fan Scorpion", "Fawn Fox Rat", "Featherback Boar", "Fiendcat", "Firebelly Weaver", "Firemane Manticore", "Flamerest Fiendcat", "Flamescale Illusionist", "Flamescale Lancer", "Flamescale Spearmen", "Flamescale Venomcaster", "Fluted Pukasloth", "Frost Delver", "Frostbite Hummingbird", "Frosted Pocketmouse", "Fuiran", "Fungalhoof Qiriq", "Fungusbearing Phony", "Gale Wolf", "Garden Larail", "Gaseous Megashrimp", "Ghost Manticore", "Gladeveins Needletooth", "Glamortail Hopper", "Glasswing Flutter", "Glossy Duskrat", "Glowing Globe", "Glowing Pocket Mouse", "Golden Featherfin", "Golden Porpoise", "Goldenbeast", "Goldenplains Poodle Mith", "Goldthroated Sparrow", "Goliath Mountain Beetle", "Granite Thresher", "Grasslands Trunker", "Great Blue Waveskimmer", "Greater Sandstrike", "Greatshell", "Greenroot Janustrap", "Grey River Flight", "Greybeak Reaper", "Grouse Basilisk", "Hainu", "Harlequin Stagwing", "Harvest Floracat", "Hati", "Hawksbill Goliath", "Heartred Croaker", "Hedgehog", "Highfin Sea Serpent", "Highreach Bonepicker", "Hippalectryon", "Hippocampus", "Hippogriff", "Hippojay", "Hoarfrost Mauler", "Hooded Dodo", "Hydra", "Hydra Scorpion", "Ignited Imp", "Infestation Hound", "Iridescent Scaleback", "Irradiated Astronomer", "Irregular Nekomata", "Jadecarved Decoy", "Janustrap", "Jawlocker", "Jeweled Octoflyer", "Juvenile Starsweeper", "Kelp Tender", "Kelpie", "King Parda", "Lavaborne Hoax", "Leafy Moth", "Leftover Residue", "Leopard Coralclimber", "Lesser Wisp", "Living Luminance", "Living Sculpture", "Longhorn Capricat", "Longjaw Lurefish", "Longneck Hunter", "Longneck Interloper", "Longneck Magi", "Longneck Medium", "Longneck Mender", "Longneck Scholar", "Longneck Skirmisher", "Longneck Wanderer", "Luna Mith", "Lurefish", "Lux Spectre", "Magic Mirror", "Magma Runner", "Malevolent Spirit", "Mammertee", "Maned Cobra", "Maned Rasa", "Mantarune", "Manticore", "Manticore Screamer", "Mantled Foo", "Maple Caterpillar", "Marbled Jester", "Marbled Serpenta", "Maren Ambusher", "Maren Currentfinder", "Maren Defender", "Maren Scout", "Maren Shark Hunter", "Maren Spearmaiden", "Maren Warlock", "Maren Warrior", "Maren Wavesinger", "Marshland Poodle Mith", "Masked Harpy", "Masked Phantom", "Melon Marzal", "Melprin", "Mesacliff Harpy", "Mimic Buttersnake", "Mirage Puffer", "Mistral Minion", "Mistwatch Shellion", "Mith Bruiser", "Mock Firebird", "Molten Wartoad", "Monkey Wrench", "Moonbeam Crayfish", "Moordwelling Trunker", "Moss-Covered Golem", "Mossy Cerda", "Mottled Buttersnake", "Mottled Sea Serpent", "Murkbottom Gull", "Nephrite Chameleon", "Nightfall Imp", "Nightmare", "Nightsky Fuiran", "Nochnyr", "Noggle", "Noxious Coralclimber", "Oceansurf Magus", "Octoflyer", "Opheodrys Serthis", "Ophiotaurus", "Opposing Forces", "Orange Blotch Pansy", "Orbiting Spirit", "Otherworldly Aura", "Overcharged Silverbeast", "Painted Centaur", "Painted Marionette", "Painted Protobeast", "Paradise Zalis", "Parasitic Fungus", "Parda", "Peacevine Aardvark", "Peacock Firebird", "Peacock Scorpion", "Perching Java Sparrow", "Permafrost Impaler", "Petal Jumper", "Petalwing Peryton", "Pink-Tail Mole", "Poisonous Toridae", "Poultrygeist", "Prancing Capricat", "Primrose Mith", "Pronghorn Stomper", "Proto Manticore", "Protobeast", "Psywurm", "Radioactive Slime", "Ragamouse", "Ragepuff", "Rainbow Sprite", "Rambra", "Raptorik Warrior", "Red-Breasted Hainu", "Red-Winged Owlcat", "Relic Eel", "Renegade Aviar", "Rhodochrosite Crane", "Ringlet Amphithere", "Riptide Clipper", "River Muck", "Rivermouth Flatbill", "Roc", "Rosetail", "Rosy Peryton", "Roundhorn Melprin", "Ruby Webwing", "Ruffle Glasswing", "Runic Bat", "Sakura Owl", "Salve Kamaitachi", "Sandshore Snipper", "Satin Pocketmouse", "Scaleback", "Scarlet Flycatcher", "Scarlet Serpenta", "Scrapmetal Tracker", "Scythe Kamaitachi", "Searing Jackalope", "Seaweed Scavenger", "Sentient Alloy", "Sentinel Mith", "Sentry Squawker", "Serpenta", "Serpentine Lamp", "Serthis Alchemist", "Serthis Archivist", "Serthis Loremaster", "Serthis Potionmaster", "Shadow Serpent", "Shale Thresher", "Shalebuck", "Shatterbone Vulture", "Shattered Serpent", "Shellion", "Shimmering Xolo", "Shiny Residue", "Sickle Kamaitachi", "Silky Mole", "Silky Webwing", "Silver Featherfin", "Silver Ferret", "Silver Springbok", "Silvermane Barbtail", "Skittering Megashrimp", "Sköll", "Slumbering Charlatan", "Smoke Gyre", "Smokebillow Sham", "Smoky Bantam Fangar", "Smoldering Sconce", "Snarling Mimic", "Snow Streak", "Snowfall Elk", "Snowsquall Floracat", "Somber Spirit", "Sorcerous Arms", "Southmarsh Podid", "Sparkling Stinger", "Spectral Duskflapper", "Spellbound Golem", "Spellbound Tome", "Spellwall Boran", "Spined Cobra", "Spinel Vulstal", "Spiney Whale", "Spirit Armor", "Spotted Pukasloth", "Sprangyroo", "Spring Millifae", "Squall Rasa", "Steam Gyre", "Steelhound", "Stone Borer", "Stonewatch Harpy", "Stonewatch Prince", "Storm Seeker", "Stormcloud Harpy", "Strangler", "Sundial Imposter", "Sunsea Pseudo", "Sunset Lasher", "Sunspot Clouddancer", "Swallowtail Buttersnake", "Swamphaunt Kelpie", "Sweetheart Swan", "Sweetpuff", "Swift Lumen", "Swift Volt", "Swiftfoot Slayer", "Tar-Trooper Slarg", "Tatterwing Carcass", "Tender Larail", "Tendril Loach", "Tengu", "Tengu Caller", "Thornthick Thief", "Tigerblood Foo", "Tourmaline Vulstal", "Tradewinds Gull", "Trick Of The Light", "Tricolor Yapper", "Tropical Caiman", "Tufted Leaf Beetle", "Tunnel Hydra", "Tuxedo Floracat", "Ultramel Amphithere", "Ultraram", "Umberhorn Qiriq", "Umbra Wolf", "Undying Featherback", "Unlikely Alliance", "Veiled Vision", "Velvet Floracat", "Venerable Shalebuck", "Venomblade Assassin", "Venomous Toridae", "Vivid Wavehopper", "Voltspire Intruder", "Vulpine Lamp", "Wandering Surgepriest", "Warcat Protector", "Wartoad", "Wasteland Collector", "Wave Sweeper", "Waveswell Sorceror", "Webwing Alpha", "Wendigo", "Wetland Unicorn", "Wildwood Owl", "Windcarve Fugitive", "Windcarve Harpy", "Winter Wolf", "Wintermane Bowman", "Wintermane Spearman", "Wispwillow Peryton", "Wooden Marionette", "Woodland Turkey", "Wraith Hound", "Yellow-Throated Sparrowmouse", "Yeti Brawler", "Zalis", "Zeeba", "Boolean", "Skycat", "Golden Idol", "Bone Fiend", "Cog Frog", "Red-Footed Akirbeak", "Speedy", "Golden Bantam Fangar", "Loga", "Light Sprite", "Lightning Sprite", "Fire Sprite", "Arcane Sprite", "Plague Sprite", "Earth Sprite", "Ice Sprite", "Shadow Sprite", "Wind Sprite", "Water Sprite", "Nature Sprite", "Sunbeam Ursa", "Livewire Grizzly", "Magma Embear", "Hibernal Starbear", "Graveyard Guardian", "Cragbacked Bouldursa", "Polarfreeze Defender", "Murktooth Bramblekeep", "Cloudkeeper Herald", "Wavebreak Snarler", "Timber Tender", "Sunbeam Soldier", "Lightning Lancer", "Molten Marauder", "Stardust Scholar", "Deadland Disciple", "Granite Guardian", "Cragward Custodian", "Insubstantial Illusionist", "Hurricane Herald", "Seawater Savior", "Sapling Speaker", "Shining Goblin", "Sparkling Goblin", "Blazing Goblin", "Enchanting Goblin", "Enduring Goblin", "Crumbling Goblin", "Frozen Goblin", "Obscuring Goblin", "Gusting Goblin", "Bubbling Goblin", "Black-Wing", "Hummingbird", "Perching Java", "Sparrow", "Glossy", "Duskrat", "Chocolate", "Ferret", "Driftwood", "Baron", "Snowsquall", "Harvest", "Floracat", "Swallowtail", "Buttersnake"};
        FRFamsField.setText(genThing(fam));
        
        
        String[] frcolor = {"Maize", "Cream", "Antique", "White", "Moon", "Ice", "Orca", "Platinum", "Silver", "Dust", "Grey", "Smoke", "Gloom", "Lead", "Shale", "Flint", "Charcoal", "Coal", "Oilslick", "Black", "Obsidian", "Eldritch", "Midnight", "Shadow", "Blackberry", "Mulberry", "Plum", "Wisteria", "Thistle", "Fog", "Mist", "Lavender", "Heather", "Purple", "Orchid", "Amethyst", "Nightshade", "Violet", "Grape", "Royal", "Eggplant", "Iris", "Storm", "Twilight", "Indigo", "Sapphire", "Navy", "Cobalt", "Ultramarine", "Blue", "Periwinkle", "Lapis", "Splash", "Cornflower", "Sky", "Stonewash", "Overcast", "Steel", "Denim", "Abyss", "Phthalo", "Azure", "Caribbean", "Teal", "Cerulean", "Cyan", "Robin", "Aqua", "Turquoise", "Spruce", "Pistachio", "Seafoam", "Mint", "Jade", "Spearmint", "Thicket", "Peacock", "Emerald", "Shamrock", "Jungle", "Hunter", "Forest", "Camo", "Algae", "Swamp", "Avocado", "Green", "Fern", "Mantis", "Pear", "Leaf", "Radioactive", "Honeydew", "Peridot", "Chartreuse", "Spring", "Crocodile", "Olive", "Murk", "Moss", "Goldenrod", "Amber", "Honey", "Lemon", "Yellow", "Grapefruit", "Banana", "Sanddollar", "Flaxen", "Ivory", "Buttercup", "Gold", "Metals", "Marigold", "Sunshine", "Saffron", "Sunset", "Peach", "Cantaloupe", "Orange", "Bronze", "Terracotta", "Carrot", "Fire", "Pumpkin", "Tangerine", "Cinnamon", "Caramel", "Sand", "Tan", "Beige", "Stone", "Taupe", "Slate", "Driftwood", "Latte", "Dirt", "Clay", "Sable", "Umber", "Soil", "Hickory", "Tarnish", "Ginger", "Brown", "Chocolate", "Auburn", "Copper", "Rust", "Tomato", "Vermillion", "Ruby", "Cherry", "Crimson", "Garnet", "Sanguine", "Blood", "Maroon", "Berry", "Red", "Strawberry", "Cerise", "Carmine", "Brick", "Coral", "Blush", "Cottoncandy", "Watermelon", "Magenta", "Fuchsia", "Raspberry", "Wine", "Mauve", "Pink", "Bubblegum", "Rose", "Pearl", "No Preference"};
        FRColorField.setText(genThing(frcolor));
        String[] vadj = {"Adenoidal", "Appealing", "Breathy", "Brittle", "Croaky", "Dead", "Disembodied", "Flat", "Fruity", "Grating", "Gravelly", "Gruff", "Guttural", "High-Pitched", "Hoarse", "Honeyed", "Husky", "Low", "Low", "Low", "Matter-Of-Fact", "Modulated", "Monotonous", "Nasal", "Orotund", "Penetrating", "Quietly", "Raucous", "Ringing", "Rough", "Shrill", "Silvery", "Singsong", "Small", "Smoky", "Soft-Spoken", "Sotto", "Stentorian", "Strangled", "Strangulated", "Strangled", "Strident", "Taut", "Thick", "Thickly", "Thin", "Throaty", "Tight", "Toneless", "Tremulous", "Wheezy", "Wobbly", "Booming", "Gratingly", "Hoarsely", "Huskily", "Monotonously", "Nasally", "Quavering", "Raucously", "Stridently", "Throatily", "Tonelessly", "Tremulously"};
        VAdjField.setText(genThing(vadj));
        String[] lang = {"Hiligaynon", "Ido", "Kashubian", "Lithuanian", "Mapudungun", "English", "Abkhaz", "Adyghe", "Afrikaans", "Akan", "Albanian", "American Sign Language", "Amharic", "Arabic", "Aragonese", "Aramaic", "Armenian", "Aymara", "Balinese", "Basque", "Betawi", "Bosnian", "Breton", "Bulgarian", "Cantonese", "Catalan", "Cherokee", "Chickasaw", "Chinese", "Coptic", "Cornish", "Corsican", "Crimean Tatar", "Croatian", "Czech", "Danish", "Dutch", "Dawro", "Esperanto", "Estonian", "Ewe", "Fiji Hindi", "Filipino", "Finnish", "French", "Galician", "Georgian", "German", "Greek, Modern", "Ancient Greek", "Greenlandic", "Haitian Creole", "Hawaiian", "Hebrew", "Hindi", "Hungarian", "Icelandic", "Indonesian", "Inuktitut", "Interlingua", "Irish", "Italian", "Japanese", "Javanese", "Kabardian", "Kalasha", "Kannadakashubian", "Khmer", "Kinyarwanda", "Korean", "Kurdish/Kurdî", "Ladin", "Latgalian", "Latin", "Lingala", "Livonian", "Lojban", "Lower Sorbian", "Low German", "Macedonian", "Malay", "Malayalam", "Mandarin", "Manx", "Maori", "Mauritian Creole", "Middle Low German", "Min Nan", "Mongolian", "Norwegian", "Old Armenian", "Old English", "Old French", "Old Javanese", "Old Norse", "Old Prussian", "Oriya", "Pangasinan", "Papiamentu", "Pashto", "Persian", "Pitjantjatjara", "Polish", "Portuguese", "Proto-Slavic", "Quenya", "Rapa Nui", "Romanian", "Russian", "Sanskrit", "Scots", "Scottish Gaelic", "Serbian", "Serbo-Croatian", "Slovak", "Slovene", "Spanish", "Sinhalese", "Swahili", "Swedish", "Tagalog", "Tajik", "Tamil", "Tarantino", "Telugu", "Thai", "Tok Pisin", "Turkish", "Twi", "Ukrainian", "Upper Sorbian", "Urdu", "Uzbek", "Venetian", "Vietnamese", "Vilamovian", "Volapük", "Võro", "Welsh", "Xhosa", "Yiddish", "Zazaki", "Abyssal", "Aquan", "Auran", "Celestial", "Common", "Deep Speech", "Draconic", "Druidic", "Dwarvish", "Elvish", "Giant", "Gnomish", "Goblin", "Gnoll", "Halfling", "Ignan", "Infernal", "Orc", "Primordial", "Sylvan", "Terran", "Undercommon"};
        LangField.setText(genThing(lang));
        String[] accent = {"British", "Spanish", "Russian", "French", "Scottish", "Irish", "American", "Indian", "Australian", "South African", "Southern", "Western", "Chinese", "German", "Turkish", "Itallian", "Polish", "Romanian", "Kazakhstanian", "Netherlands", "Greek", "Czech Republic", "Portugal", "Swedish", "Hungary", "Azerbaijan", "Belarus", "Austria", "Switzerland", "Bulgaria", "Serbia", "Denmark", "Finland", "Slovakia", "Norway", "Ireland", "Croatia", "Bosnia And Herzegovina", "Georgia", "Moldova", "Armenia", "Lithuania", "Albania", "Macedonia", "Slovenia", "Latvia", "Kosovo", "Estonia", "Cyprus", "Montenegro", "Luxembourg", "Malta", "Iceland", "Jersey (Uk)", "Isle Of Man (Uk)", "Andorra", "Guernsey (Uk)", "Faroe Islands (Denmark)", "Liechtenstein", "Monaco", "Gibraltar (Uk)", "San Marino", "Åland Islands (Finland)", "Svalbard (Norway)", "Vatican City"};
        AccentField.setText(genThing(accent));
        
        FearField.setText(genThing(fear));
        
        
        String[] relat = {"Mate", "Nemesis", "Child", "Sibling", "Coworker", "Comrade", "Spouse", "Parent", "Grandparent", "Cousin", "Caregiver", "Peer", "Neighbor", "Friendship", "Roommate", "Confidant", "Soulmate", "Mistress", "Companion", "Friend", "Best Friend", "Enemy", "Ex-Significant Other", "Significant Other", "Ex-Best Friend", "Ex-Friend", "Arch Enemy"};
        int ran = (int)(Math.random()*2); if (ran == 0) { RelatField.setText("Ex-"+genThing(relat)); } else {RelatField.setText(genThing(relat));}
        RelatField.setText(genThing(relat));
        String[] pass = {"Greed", "Curiosity", "Love", "Obsession", "Improve Themselves", "Improve The World", "Adventure", "Career", "Own My Own Business", "Community", "Creativity", "Drama", "Entertainment", "Family", "Finances", "Friends / Friendships", "Fun", "Health", "Hobbies", "Home", "Literature", "Love / Love Life", "Marriage", "Music", "Personal", "Play / Recreation", "Relationships", "Conquer", "Destruction", "Sports", "Peace", "Spiritual Life", "Travel", "Learn What You Don'T Know", "Self-Actualization", "Self-Protection", "Love And Belonging", "Mate Acquisition", "Mate Retention", "Physiological Needs", "Children"};
        PassField.setText(genThing(pass));
        
        String mbti = "";
        int num = (int)(Math.random()*2); if (num == 0) { mbti += "I"; } else {mbti += "E";}
        num = (int)(Math.random()*2); if (num == 0) { mbti += "N"; } else {mbti += "S";}
        num = (int)(Math.random()*2); if (num == 0) { mbti += "T"; } else {mbti += "F";}
        num = (int)(Math.random()*2); if (num == 0) { mbti += "J"; } else {mbti += "P";}
        MBTIField.setText(mbti);
        
        String[] adjs = {"Accessible", "Admirable", "Allocentric", "Anticipative", "Appreciative", "Articulate", "Aspiring", "Athletic", "Attractive", "Balanced", "Benevolent", "Brilliant", "Captivating", "Caring", "Challenging", "Charismatic", "Clean", "Clear-Headed", "Clever", "Colorful", "Companionly", "Conciliatory", "Constant", "Contemplative", "Curious", "Daring", "Decent", "Dedicated", "Deep", "Dignified", "Directed", "Disciplined", "Dramatic", "Dutiful", "Earnest", "Ebullient", "Educated", "Elegant", "Eloquent", "Empathetic", "Esthetic", "Exciting", "Extraordinary", "Farsighted", "Felicific", "Firm", "Flexible", "Focused", "Forecful", "Forgiving", "Forthright", "Freethinking", "Fun-Loving", "Gallant", "Genuine", "Good-Natured", "Gracious", "Hardworking", "Healthy", "Hearty", "Herioc", "High-Minded", "Humble", "Idealistic", "Impressive", "Incisive", "Incorruptible", "Individualistic", "Innovative", "Inoffensive", "Insightful", "Insouciant", "Invulnerable", "Knowledge", "Leaderly", "Leisurely", "Liberal", "Logical", "Lovable", "Lyrical", "Magnanimous", "Many-Sided", "Masculine  (Manly)", "Methodical", "Maticulous", "Moderate", "Multi-Leveled", "Nonauthoritarian", "Objective", "Observant", "Open", "Orderly", "Organized", "Original", "Patriotic", "Perceptive", "Perfectionist", "Personable", "Persuasive", "Planful", "Playful", "Polished", "Popular", "Precise", "Principled", "Profound", "Protean", "Providential", "Prudent", "Pruposeful", "Realistic", "Relaxed", "Respectful", "Responsive", "Reverential", "Rustic", "Sage", "Sane", "Scholarly", "Scrupulous", "Secure", "Selfless", "Self-Critical", "Self-Defacing", "Self-Denying", "Self-Reliant", "Self-Sufficent", "Sentimental", "Seraphic", "Serious", "Sexy", "Sharing", "Simple", "Skillful", "Sober", "Solid", "Sophisticated", "Spontaneous", "Sporting", "Stable", "Steady", "Stoic", "Strong", "Studious", "Suave", "Subtle", "Sweet", "Systematic", "Tasteful", "Teacherly", "Thorough", "Tolerant", "Tractable", "Trusting", "Uncomplaining", "Undogmatic", "Unfoolable", "Upright", "Urbane", "Venturesome", "Well-Bred", "Well-Read", "Well-Rounded", "Winning", "Youthful", "Absentminded", "Artful", "Ascetic", "Authoritarian", "Big-Thinking", "Boyish", "Breezy", "Businesslike", "Busy", "Casual", "Crebral", "Chummy", "Circumspect", "Competitive", "Complex", "Confidential", "Contradictory", "Crisp", "Cute", "Deceptive", "Dominating", "Dreamy", "Driving", "Droll", "Dry", "Earthy", "Effeminate", "Enigmatic", "Experimental", "Familial", "Folksy", "Formal", "Freewheeling", "Frugal", "Glamorous", "Guileless", "High-Spirited", "Huried", "Hypnotic", "Iconoclastic", "Idiosyncratic", "Impassive", "Impersonal", "Impressionable", "Intense", "Invisible", "Irreligious", "Irreverent", "Maternal", "Mellow", "Moralistic", "Mystical", "Neutral", "Noncommittal", "Noncompetitive", "Old-Fashined", "Ordinary", "Outspoken", "Paternalistic", "Physical", "Political", "Predictable", "Preoccupied", "Private", "Progressive", "Pure", "Questioning", "Religious", "Restrained", "Retiring", "Sarcastic", "Self-Conscious", "Sensual", "Skeptical", "Smooth", "Solemn", "Solitary", "Stern", "Stoiid", "Strict", "Stubborn", "Stylish", "Subjective", "Surprising", "Soft", "Unaggressive", "Unambitious", "Unceremonious", "Unchanging", "Undemanding", "Unfathomable", "Unhurried", "Uninhibited", "Unpatriotic", "Unpredicatable", "Unreligious", "Unsentimental", "Whimsical", "Agonizing", "Aimless", "Airy", "Amoral", "Apathetic", "Arbitrary", "Argumentative", "Arrogantt", "Artificial", "Asocial", "Assertive", "Astigmatic", "Barbaric", "Bewildered", "Bizarre", "Bland", "Blunt", "Biosterous", "Brittle", "Brutal", "Calculating", "Cantakerous", "Charmless", "Childish", "Coarse", "Cold", "Colorless", "Complacent", "Complaintive", "Conceited", "Condemnatory", "Conformist", "Contemptible", "Conventional", "Crafty", "Crass", "Criminal", "Critical", "Crude", "Decadent", "Delicate", "Demanding", "Dependent", "Desperate", "Destructive", "Devious", "Difficult", "Dirty", "Disconcerting", "Discontented", "Discouraging", "Discourteous", "Dishonest", "Disloyal", "Disobedient", "Disorderly", "Disorganized", "Disputatious", "Disrespectful", "Disruptive", "Dissolute", "Dissonant", "Distractible", "Disturbing", "Dogmatic", "Dull", "Easily Discouraged", "Egocentric", "Enervated", "Escapist", "Expedient", "Extravagant", "Extreme", "Faithless", "Fanciful", "Fatalistic", "Fawning", "Fearful", "Fickle", "Fiery", "Fixed", "Flamboyant", "Fraudulent", "Frightening", "Frivolous", "Gloomy", "Graceless", "Grand", "Grim", "Hateful", "Haughty", "Hedonistic", "Hidebound", "High-Handed", "Hostile", "Imitative", "Impatient", "Impractical", "Imprudent", "Impulsive", "Inconsiderate", "Incurious", "Indecisive", "Indulgent", "Inert", "Inhibited", "Insecure", "Insensitive", "Insincere", "Insulting", "Intolerant", "Irascible", "Irrational", "Irresponsible", "Irritable", "Libidinous", "Loquacious", "Mannered", "Mannerless", "Mawkish", "Mealymouthed", "Mechanical", "Meddlesome", "Melancholic", "Meretricious", "Messy", "Miserable", "Miserly", "Misguided", "Mistaken", "Money-Minded", "Monstrous", "Moody", "Morbid", "Muddle-Headed", "Narcissistic", "Narrow", "Narrow-Minded", "Natty", "Negativistic", "Neglectful", "Neurotic", "Nihilistic", "Obsessive", "Obvious", "Odd", "Offhand", "One-Dimensional", "One-Sided", "Opinionated", "Opportunistic", "Oppressed", "Overimaginative", "Paranoid", "Passive", "Pedantic", "Perverse", "Petty", "Pharissical", "Phlegmatic", "Plodding", "Pompous", "Power-Hungry", "Predatory", "Prejudiced", "Presumptuous", "Pretentious", "Prim", "Procrastinating", "Profligate", "Provocative", "Pugnacious", "Puritanical", "Quirky", "Reactionary", "Reactive", "Regimental", "Regretful", "Repentant", "Repressed", "Resentful", "Ridiculous", "Rigid", "Ritualistic", "Rowdy", "Ruined", "Sadistic", "Sanctimonious", "Scheming", "Scornful", "Sedentary", "Self-Indulgent", "Shallow", "Shortsighted", "Single-Minded", "Sloppy", "Sly", "Small-Thinking", "Softheaded", "Sordid", "Steely", "Stiff", "Strong-Willed", "Stupid", "Submissive", "Superficial", "Superstitious", "Suspicious", "Tactless", "Tasteless", "Thievish", "Transparent", "Treacherous", "Trendy", "Troublesome", "Unappreciative", "Uncaring", "Uncharitable", "Unconvincing", "Uncooperative", "Uncreative", "Uncritical", "Unctuous", "Undisciplined", "Unfriendly", "Ungrateful", "Unhealthy", "Unimaginative", "Unimpressive", "Unlovable", "Unpolished", "Unprincipled", "Unrealistic", "Unreflective", "Unreliable", "Unrestrained", "Unself-Critical", "Unstable", "Vacuous", "Venal", "Vindictive", "Vulnerable", "Weak-Willed", "Well-Meaning", "Willful", "Wishful", "Affable", "Amiable", "Amicable", "Broad-Minded", "Careful", "Communicative", "Compassionate", "Conscientious", "Considerate", "Convivial", "Courteous", "Diplomatic", "Easygoing", "Emotional", "Fair-Minded", "Forceful", "Gregarious", "Hard-Working", "Honest", "Humorous", "Imaginative", "Independent", "Intellectual", "Intelligent", "Intuitive", "Inventive", "Loyal", "Modest", "Neat", "Optimistic", "Passionate", "Patient", "Persistent", "Pioneering", "Philosophical", "Polite", "Powerful", "Practical", "Pro-Active", "Quick-Witted", "Rational", "Reliable", "Reserved", "Resourceful", "Self-Confident", "Self-Disciplined", "Sensible", "Shy", "Sociable", "Straightforward", "Sympathetic", "Tidy", "Unassuming", "Understanding", "Versatile", "Warmhearted", "Adaptable", "Adorable", "Agreeable", "Alert", "Alluring", "Amusing", "Boundless", "Bright", "Capable", "Coherent", "Cooperative", "Credible", "Cultured", "Dashing", "Dazzling", "Debonair", "Decorous", "Delightful", "Diligent", "Discreet", "Dynamic", "Eager", "Efficient", "Enchanting", "Encouraging", "Enduring", "Energetic", "Entertaining", "Enthusiastic", "Excellent", "Excitable", "Exuberant", "Fabulous", "Fair", "Faithful", "Fantastic", "Fearless", "Frank", "Friendly", "Funny", "Generous", "Gentle", "Good", "Happy", "Harmonious", "Helpful", "Hilarious", "Honorable", "Impartial", "Industrious", "Instinctive", "Jolly", "Joyous", "Kind", "Kind-Hearted", "Knowledgeable", "Likeable", "Lively", "Lovely", "Loving", "Lucky", "Mature", "Modern", "Nice", "Obedient", "Painstaking", "Peaceful", "Perfect", "Placid", "Plausible", "Pleasant", "Plucky", "Productive", "Protective", "Proud", "Punctual", "Quiet", "Receptive", "Reflective", "Relieved", "Resolute", "Responsible", "Righteous", "Romantic", "Sedate", "Selective", "Self-Assured", "Sensitive", "Shrewd", "Sincere", "Skilful", "Splendid", "Steadfast", "Stimulating", "Talented", "Thoughtful", "Thrifty", "Tough", "Trustworthy", "Unbiased", "Unusual", "Upbeat", "Vigorous", "Vivacious", "Warm", "Willing", "Wise", "Witty", "Wonderful", "Zany", "Zealous", "Abrasive", "Abrupt", "Aloof", "Ambiguous", "Angry", "Annoyed", "Arrogant", "Awful", "Bad", "Belligerent", "Boorish", "Boring", "Callous", "Careless", "Clumsy", "Combative", "Confused", "Crazy", "Creepy", "Dangerous", "Deceitful", "Defective", "Defiant", "Depressed", "Deranged", "Disagreeable", "Disillusioned", "Disturbed", "Domineering", "Draconian", "Embarrassing", "Envious", "Erratic", "Evasive", "Evil", "Fanatical", "Fierce", "Finicky", "Flashy", "Flippant", "Foolish", "Forgetful", "Frantic", "Fretful", "Frightened", "Furtive", "Greedy", "Grieving", "Grouchy", "Gruesome", "Grumpy", "Guarded", "Gullible", "Helpless", "Hesitant", "Horrible", "Hurtful", "Ignorant", "Irresolute", "Jealous", "Jittery", "Lacking", "Lazy", "Lonely", "Malicious", "Materialistic", "Mean", "Mysterious", "Naive", "Nasty", "Naughty", "Nervous", "Noisy", "Obnoxious", "Outrageous", "Over Zealous", "Panicky", "Pathetic", "Possessive", "Quarrelsome", "Repulsive", "Ruthless", "Sad", "Scary", "Secretive", "Selfish", "Silly", "Slow", "Sneaky", "Snobbish", "Spendthrift", "Squeamish", "Stingy", "Strange", "Sulky", "Tacky", "Tense", "Terrible", "Testy", "Thick-Skinned", "Thoughtless", "Threatening", "Tight", "Timid", "Tired", "Tiresome", "Troubled", "Truculent", "Typical", "Uptight", "Vague", "Vengeful", "Venomous", "Volatile", "Voracious", "Vulgar", "Wary", "Wasteful", "Weak", "Wicked", "Worthless", "Wretched", "Abusive", "Active", "Adventurous", "Affectionate", "Aggressive", "Ambitious", "Annoying", "Anxious", "Artistic", "Bossy", "Brave", "Calm", "Cautious", "Charming", "Cheerful", "Compulsive", "Confident", "Conservative", "Courageous", "Cowardly", "Creative", "Cruel", "Cynical", "Decisive", "Determined", "Direct"};
        A1Field.setText(genThing(adjs));A2Field.setText(genThing(adjs));A3Field.setText(genThing(adjs));A4Field.setText(genThing(adjs));
        String[] time = {"days","months","hours","weeks","years","centuries","decades","eons"};
        AgeField.setText(Integer.toString((int)(Math.random()*999))+" "+genThing(time));
        String[] allstuff = {"Darktide Jellyfish", "Mana Thief", "Maidens Blush", "Spathiphyllum", "Raspberry", "Bee Orchid", "Chalcedony Craylet", "Delta Orchid", "Emetic Russula", "Fallout Whisper", "Petalwing Matriarch", "Sakura Owlet", "Scarlet Mussels", "Southern Gull", "Small Block of Granite", "Rose Quartz", "Corundum Chameleon", "Mesacliff Harpy", "Jeweled Octoflyer", "Maren Wavesinger", "Juvenile Starsweeper", "Fluted Pukasloth", "Candycane Xolo", "Irradiated Astronomer", "Arcane Sprite", "Hibernal Starbear", "Pink Highnoon Hank", "Pink & Purple Flair Scarf", "Pink Satin Tunic", "Blushing Pink Rose", "Pink Daisy Cabbie", "Ethereal Entourage", "Archivist's Spellscroll", "Companion Comet", "Rune Slash", "Mana Bolt", "Enfeeble", "Amethyst Striker", "Bog Canary", "Weird Purple Skink", "Julii Corycat", "Aether Hermit", "Snowflake Urchin", "Egghead Infiltrator", "Subterranean Clover", "Black Tulip", "Peace Lily", "Blackberry", "Star Moss", "Leechroot Mushroom", "Starfall Blossom", "Engineered Strawberry", "Dark Creeper", "Aether Cherries", "Chewy Tentacle", "Cicada", "Cliffside Milkweed", "Crowntail Wanderer", "Decorated Turtle Shell", "Haunted Stone Orb", "Magical Shards", "Dark-Tufted Sparrowmouse", "Nightsky Fuiran", "Shadow Serpent", "Zeeba", "Rainbow Sprite", "Abyss Striker", "Maned Cobra", "Anomalous Skink", "Arcane Sprite", "Ethereal Trickster", "Mist Slash", "Dark Bolt", "Shroud", "Dark Might Fragment", "Dark Acuity Fragment", "Obsidian Hybrid Fragment", "Tricktrouper Crown", "Companion Comet", "Olive Sea Snake", "Magpie", "Crested Newt", "Black Capped Budgie", "Blue Throated Budgie", "Mute Swan", "Juvenile Prairie Skink", "River Warden", "Moonbeam Sardines", "Sardines", "Clown Shrimp", "Flying Fish", "Glowslug", "Sea Fae", "Stubby Squid", "Green Corycat", "Blue Swimmer Crab", "Lagoon Guppy", "Blue Dragon Seaslug", "Crystal Jellyfish", "Wild Green Discus", "Snowflake Urchin", "Glow Star", "Frostbite Beetle", "Tundra Grub", "Blue Cricket", "Lunar Lacewing", "Wasteland Pauper", "Snowkissed Centipede", "Silt Sifter", "Zebra Caterpillar", "Water Strider", "Giant Darner", "Marsh Choker", "Glow Mushroom", "Blue Parrot Tulip", "Sour Spinach", "Stellaria Media", "Seaberry", "Spearmint", "Lume Daffodil", "Charged Duneberry", "Perfect Skipping Stone", "Skipping Stone", "Blue Quartz", "Labradorite", "Raw Lapis Lazuli", "Azurite", "Faded Blue Fabric", "Discarded Ribbon", "Snakeskin Cloth", "Apatite", "Celestine", "Blue Goo", "Blue Ooze", "Blue Sludge", "Bluefin Charger Fin", "Bluestreaked Shell", "Coal Carpenter", "Dwarf Truffle", "Blue Dragon Reef Snail", "Bramble Guardian", "River Muck", "Zalis", "Permafrost Impaler", "Venerable Shalebuck", "Bluemoon Aviar", "Snow Streak", "Poisonous Toridae", "Wartoad", "Octoflyer", "Maren Scout", "Construction Mith", "Frost Delver", "Blue Vein Pansy", "Gaseous Megashrimp", "Hippojay", "Nephrite Chameleon", "Snowsquall Floracat", "Leftover Residue", "Lesser Wisp", "Tourmaline Vulstal", "Frostbite Hummingbird", "Shimmering Xolo", "Roundhorn Melprin", "Hati", "Rivermouth Flatbill", "Bucktooth Digger", "Ice Sprite", "Water Sprite", "Polarfreeze Defender", "Wavebreak Snarler", "Ectoplasmine", "Jadecarved Decoy", "Slumbering Charlatan", "Fawn Fox Rat", "Mantarune", "Great Blue Waveskimmer", "Lightning Sprite", "Lightning Lancer", "Azure Highnoon Hank", "Cobalt Deepsea Bulb", "Laureate's Cap", "Blue Satin Tunic", "Blue Bandana", "Alchemist's Fez", "Umbral Wreath", "Blue Renaissance Shirt", "Blue Breeches", "Cobalt Shades", "Winter Wind", "Waverider Cape", "Yelling Wyrmpeck", "Pixie Procession", "Cloudy Feathered Wings", "Charged Might & Acuity Fragments", "Shock Bolt", "Thunder Slash", "Shock", "Frozen Might & Acuity Fragments", "Frigid Bolt", "Freezing Slash", "Congeal", "Aquatic Might & Acuity Fragments", "Hydro Bolt", "Wave Slash", "Drown", "Meditate", "Guard", "Ward", "Concentration", "Cleansing Elixir", "Sunset Sea Dragon", "Deepsea Cucumber", "Dumpling Squid", "Corycat", "Golden Cushionfish", "Luminous Shortfin", "Golden Reefprince", "Canopy Darter", "Albino Dasher", "Dark-bordered Beauty", "Reedcleft Sparkler", "Jungle Mantis", "Wild Mustard", "Ashfall Prickler", "Granny Smith Apple", "Daffodil", "Sour Strawberry", "Sacridite", "Fool's Gold", "Canopic Jar", "Amber-Trapped Fly", "Gold Ore", "Turtle Shell", "Ancestral Incense", "Chrysoberyl", "Yellow Goo", "Yellow Ooze", "Yellow Sludge", "Yellow-Throated Sparrowmouse", "Cockatrice", "Longneck Wanderer", "Sunspot Clouddancer", "Brilliant Psywurm", "Salve Kamaitachi", "Wetland Unicorn", "Coppercoil Creeper", "Cheerful Residue", "Dwarf Unicorn", "Sköll", "Light Sprite", "Sunbeam Soldier", "Golden Idol", "Grasslands Trunker", "Gilded Crown", "Gold Wolf Cape", "Autumnal Wreath", "Golden Deepsea Bulb", "Amber Delver's Lamp", "Brass Cornet", "Wooden Pipeflute", "Gold Satin Tunic", "Gold Renaissance Shirt", "Gold Breeches", "Festival Jewelry", "Illuminated Emblem", "Sunchaser Jewelry", "Sunguard Chest", "Flame Bolt", "Bright Bolt", "Blinding Slash", "Bolster", "Clobber", "Major Health Potion", "Balsas Anole", "Zephyr Sparrow", "Brown Spot Toad", "Toad", "Ruby-Throated Hummingbird", "White-Eared Hummingbird", "Emerald Ratsnake", "Tree Gecko", "Newt", "Emerald Striker", "Reedhopper", "Steppes Pincher", "Everglade Shortfin", "Glade Swarmer", "Leaf Beetle", "Cricket", "Grasshopper", "Alder Spittlebug", "Rhododendron Leafhopper", "Black Swallowtail Caterpillar", "Waterbug", "Runic Pug Moth", "Glowbug", "Highgrass Priest", "Cliff Lion", "Light's Breath", "Clover", "Jungle Grass", "Sea Grass", "Sweet Grass", "Diseased Fungus", "Crisp-Leaf Amaranth", "Greenstripe Amaranth", "Spinach", "Green Shoots", "Greater Plantain", "Broadleaf Plantain", "Arctic Scrub", "Green Algae", "Notocactus", "Tundra Cactus", "Sour Green Apple", "Prickly Pear", "Peppermint", "Green Plantain", "Jungle Lilies", "Pinwheel Paddies", "Jungle Raincatch", "Minty Jadevine", "Ivy", "Sand Creeper", "Malachite Agate", "Jade", "Raw Jade", "Moth-Eaten Rug", "Pine Branch", "Bamboo Shoot", "Bamboo Cluster", "Emerald", "Green Goo", "Green Ooze", "Green Sludge", "Leafy Moth", "Luna Mith", "Tufted Leaf Beetle", "Dryad", "Wildwood Owl", "Greenroot Janustrap", "Opheodrys Serthis", "Fuiran", "Gale Wolf", "Radioactive Slime", "Warcat Protector", "Budwing Morpho", "Hippocampus", "Harvest Floracat", "Heartred Croaker", "Cloud Chaser", "Mistral Minion", "Ringlet Amphithere", "King Parda", "Tuxedo Floracat", "Peacock Firebird", "Wind Sprite", "Nature Sprite", "Spined Cobra", "Red-Footed Akirbeak", "Boolean", "Fungusbearing Phony", "Strangler", "Woodland Headband", "Green Highnoon Hank", "Emerald Deepsea Bulb", "Poet's Tam", "Green and White Flair Scarf", "Blue and Green Flair Scarf", "Emerald Green Satin Tunic", "Green Olive Wreath", "Gladewalker Cape", "Paunchy Green Percher", "Emerald Talonclasp Pendant", "Cyan Delver's Lamp", "Canorous Spats", "Festival Items", "Electrician's Emblem", "Electrified Sash", "Whirlwind Emblem", "Whirlwind Armband", "Windbound Plumage", "Druidic Emblem", "Druidic Armband", "Naturalist's Adornments", "Zephyr Bolt", "Gust Slash", "Disorient", "Leaf Bolt", "Jungle Slash", "Envenom", "Aid", "Regeneration", "Reflect"};
        AllField.setText("[item="+genThing(allstuff)+"]");
        String[] blustuff = {"Olive Sea Snake", "Magpie", "Crested Newt", "Black Capped Budgie", "Blue Throated Budgie", "Mute Swan", "Juvenile Prairie Skink", "River Warden", "Moonbeam Sardines", "Sardines", "Clown Shrimp", "Flying Fish", "Glowslug", "Sea Fae", "Stubby Squid", "Green Corycat", "Blue Swimmer Crab", "Lagoon Guppy", "Blue Dragon Seaslug", "Crystal Jellyfish", "Wild Green Discus", "Snowflake Urchin", "Glow Star", "Frostbite Beetle", "Tundra Grub", "Blue Cricket", "Lunar Lacewing", "Wasteland Pauper", "Snowkissed Centipede", "Silt Sifter", "Zebra Caterpillar", "Water Strider", "Giant Darner", "Marsh Choker", "Glow Mushroom", "Blue Parrot Tulip", "Sour Spinach", "Stellaria Media", "Seaberry", "Spearmint", "Lume Daffodil", "Charged Duneberry", "Perfect Skipping Stone", "Skipping Stone", "Blue Quartz", "Labradorite", "Raw Lapis Lazuli", "Azurite", "Faded Blue Fabric", "Discarded Ribbon", "Snakeskin Cloth", "Apatite", "Celestine", "Blue Goo", "Blue Ooze", "Blue Sludge", "Bluefin Charger Fin", "Bluestreaked Shell", "Coal Carpenter", "Dwarf Truffle", "Blue Dragon Reef Snail", "Bramble Guardian", "River Muck", "Zalis", "Permafrost Impaler", "Venerable Shalebuck", "Bluemoon Aviar", "Snow Streak", "Poisonous Toridae", "Wartoad", "Octoflyer", "Maren Scout", "Construction Mith", "Frost Delver", "Blue Vein Pansy", "Gaseous Megashrimp", "Hippojay", "Nephrite Chameleon", "Snowsquall Floracat", "Leftover Residue", "Lesser Wisp", "Tourmaline Vulstal", "Frostbite Hummingbird", "Shimmering Xolo", "Roundhorn Melprin", "Hati", "Rivermouth Flatbill", "Bucktooth Digger", "Ice Sprite", "Water Sprite", "Polarfreeze Defender", "Wavebreak Snarler", "Ectoplasmine", "Jadecarved Decoy", "Slumbering Charlatan", "Fawn Fox Rat", "Mantarune", "Great Blue Waveskimmer", "Lightning Sprite", "Lightning Lancer", "Azure Highnoon Hank", "Cobalt Deepsea Bulb", "Laureate's Cap", "Blue Satin Tunic", "Blue Bandana", "Alchemist's Fez", "Umbral Wreath", "Blue Renaissance Shirt", "Blue Breeches", "Cobalt Shades", "Winter Wind", "Waverider Cape", "Yelling Wyrmpeck", "Pixie Procession", "Cloudy Feathered Wings", "Charged Might & Acuity Fragments", "Shock Bolt", "Thunder Slash", "Shock", "Frozen Might & Acuity Fragments", "Frigid Bolt", "Freezing Slash", "Congeal", "Aquatic Might & Acuity Fragments", "Hydro Bolt", "Wave Slash", "Drown", "Meditate", "Guard", "Ward", "Concentration", "Cleansing Elixir"};
        BluField.setText("[item="+genThing(blustuff)+"]");
        DDField.setText(genAlign());
        String[] expanded = {"A", "Abro", "Acor", "Aego", "Akio", "Aliqua", "Allo", "Andro", "Apothi", "Apres", "Apro", "Auto", "Autochoris", "Bi", "Borea", "Cease", "Cete", "Cetero", "Cupio", "Demi", "Desino", "Dura", "Ficto", "Fray", "Gay", "Grey", "Gyne", "Gyno", "Hete", "Hetero", "Homo", "Iamvano", "Icula", "Idem", "Kalos", "Lesbian", "Limno", "Lith", "Lithro", "Man", "Neuro", "Noman", "Novo", "Nowoman", "Pan", "Placio", "Platoni", "Poly", "Proqu", "Proquu", "Quoi", "Quoiro", "Recip", "Recipro", "Requeis", "San", "Singulu", "Specio", "Thym", "Volit", "Woman", "Wtf"};
        EAltField.setText(genThing(expanded)+"alterous");
        String[] expgender = {"Affectugender", "Agender", "Androgyne", "Autismgender", "Bigender", "Bordergender", "Caedoboy", "Caedogender", "Cassgender", "Cavusgender", "Cisgender", "Cloudgender", "Coruboy", "Corugender", "Corugirl", "DemiBoy", "Demifluid", "Demigender", "Demigirl", "Fogboy", "Fogfluid", "Foggender", "Foggirl", "Gender Vague", "Genderfluid", "Genderflux", "Genderqueer", "Greygender", "Illusoboy", "Illusogender", "Illusogirl", "Intergender", "Ludoboy", "Ludogender", "Ludogirl", "Maverique", "Narkissigender", "Nesciogender", "Neutrois", "NonBinary", "Pangender", "Pendogender", "Polygender", "Transgender", "Trigender", "Vagueboy", "Vaguefluid", "Vagueflux", "Vaguegirl", "Virgender", "Xumgender"};
        EGenField.setText(genThing(expgender));
        ESexField.setText(genThing(expanded)+"sexual");
        ERomField.setText(genThing(expanded)+"romantic");
        String[] flight = {"Earth", "Fire", "Wind", "Water", "Lightning", "Ice", "Plague", "Nature", "Light", "Shadow", "Arcane"};
        FlightField.setText(genThing(flight));
        String[] grestuff = {"Balsas Anole", "Zephyr Sparrow", "Brown Spot Toad", "Toad", "Ruby-Throated Hummingbird", "White-Eared Hummingbird", "Emerald Ratsnake", "Tree Gecko", "Newt", "Emerald Striker", "Reedhopper", "Steppes Pincher", "Everglade Shortfin", "Glade Swarmer", "Leaf Beetle", "Cricket", "Grasshopper", "Alder Spittlebug", "Rhododendron Leafhopper", "Black Swallowtail Caterpillar", "Waterbug", "Runic Pug Moth", "Glowbug", "Highgrass Priest", "Cliff Lion", "Light's Breath", "Clover", "Jungle Grass", "Sea Grass", "Sweet Grass", "Diseased Fungus", "Crisp-Leaf Amaranth", "Greenstripe Amaranth", "Spinach", "Green Shoots", "Greater Plantain", "Broadleaf Plantain", "Arctic Scrub", "Green Algae", "Notocactus", "Tundra Cactus", "Sour Green Apple", "Prickly Pear", "Peppermint", "Green Plantain", "Jungle Lilies", "Pinwheel Paddies", "Jungle Raincatch", "Minty Jadevine", "Ivy", "Sand Creeper", "Malachite Agate", "Jade", "Raw Jade", "Moth-Eaten Rug", "Pine Branch", "Bamboo Shoot", "Bamboo Cluster", "Emerald", "Green Goo", "Green Ooze", "Green Sludge", "Leafy Moth", "Luna Mith", "Tufted Leaf Beetle", "Dryad", "Wildwood Owl", "Greenroot Janustrap", "Opheodrys Serthis", "Fuiran", "Gale Wolf", "Radioactive Slime", "Warcat Protector", "Budwing Morpho", "Hippocampus", "Harvest Floracat", "Heartred Croaker", "Cloud Chaser", "Mistral Minion", "Ringlet Amphithere", "King Parda", "Tuxedo Floracat", "Peacock Firebird", "Wind Sprite", "Nature Sprite", "Spined Cobra", "Red-Footed Akirbeak", "Boolean", "Fungusbearing Phony", "Strangler", "Woodland Headband", "Green Highnoon Hank", "Emerald Deepsea Bulb", "Poet's Tam", "Green and White Flair Scarf", "Blue and Green Flair Scarf", "Emerald Green Satin Tunic", "Green Olive Wreath", "Gladewalker Cape", "Paunchy Green Percher", "Emerald Talonclasp Pendant", "Cyan Delver's Lamp", "Canorous Spats", "Festival Items", "Electrician's Emblem", "Electrified Sash", "Whirlwind Emblem", "Whirlwind Armband", "Windbound Plumage", "Druidic Emblem", "Druidic Armband", "Naturalist's Adornments", "Zephyr Bolt", "Gust Slash", "Disorient", "Leaf Bolt", "Jungle Slash", "Envenom", "Aid", "Regeneration", "Reflect"};
        GreField.setText("[item="+genThing(grestuff)+"]");
        String[] jobs = {"Accountant", "Actor", "Adviser", "Aerial Scout", "Alchemist", "Anarchist", "Apiarist", "Apothecary", "Aquarist", "Arborist", "Arcanist", "Archaelogist", "Archivist", "Archmage", "Arsonist", "Artist", "Astronmer", "Astronomer", "Aviary Keeper", "Baker", "Bandit", "Barber", "Bard", "Beast Master", "Beekeeper", "Bishop", "Blackmailer", "Blacksmith", "Bodyguard", "Borderwatching", "Botanist", "Bouncer", "Brewmaster", "Brewster", "Butcher", "Candlemaker", "Caravan Leader", "Carpenter", "Cartographer", "Cavelier", "Chariot Driver", "Cheesemaker", "Chef", "Chemist", "Cleric", "Coach", "Collector", "Composer", "Conjuerer", "Conman", "Consigliere", "Consort", "Cook", "Cooper", "Counselor", "Courier", "Courtier", "Dancer", "Daredevil", "Dark Illusionists", "Deepsea Diver", "Dentist", "Diplomat", "Disguiser", "Doctor", "Dragonologist", "Druid", "Drummer", "Dyer", "Educator", "Electrician", "Embroiderer", "Engineer", "Escort", "Espionage", "Exalter", "Excavator", "Executioner", "Exotic Dancer", "Explorer", "Fairy Chaser", "Familiar Caretaker", "Farmer", "Farrier", "Fashion Designer", "Festival Keeper", "Fisher", "Fletcher", "Florist", "Forager", "Forger", "Fortune-Teller", "Framer", "Fungiculturalist", "Gamekeeper", "Gardener", "Gatherer", "Genealogist", "Gladiator", "Glass Blower", "Godfather", "Gravedigger", "Guard", "Haberdasher", "Hairdresser", "Harvester", "Hatchling Sitter", "Healer", "Herbalist", "Herbologist", "Historian", "Hoarder", "Hobbyist", "Housekeeper", "Hunter", "Illusionist", "Imagineer", "Innkeeper", "Investigator", "Invoker", "Jailor", "Janitor", "Jester", "Jeweler", "Jinx", "Kennel Master", "Kennel Masters", "Kite-Maker", "Knickknack Maker", "Knight", "Lair Construction Crew", "Lawyer", "Leather Worker", "Librarian", "Lich", "Limo Driver", "Locksmith", "Logger", "Lookout", "Luthier", "Mafia", "Mafioso", "Mage", "Magi", "Magician", "Maid", "Manager", "Mason", "Master-At-Arms", "Matchmaker", "Mathematician", "Mayor", "Mechanic", "Mediator", "Medium", "Mentor", "Mercenary", "Merchant", "Messenger", "Metallurgist", "Microbiologist", "Miner", "Mineralogist", "Monk", "Muscian", "Musketeer", "Mycologist", "Mystic", "Nanny", "Necromancer", "Nest Sitter", "Night Watchman", "Ninja", "Novelist", "Nurse", "Occultist", "Optician", "Oracle", "Paladin", "Paper Maker", "Peacemaker", "Pedagogue", "Philosopher", "Pickpocket", "Pillager", "Piolot", "Pirate", "Playwright", "Poacher", "Poet", "Potion Master", "Potter", "Prankster", "Priest", "Proctor", "Professional Appraiser", "Professional Racer", "Professor", "Purifier", "Ranger", "Reaper", "Reporter", "Retributionist", "Ritualist", "Rogue", "Sage", "Saint", "Salsedragon", "Samurai", "Savager", "Savant", "Scavenger", "Scholar", "Scientist", "Scout", "Scribe", "Scribne", "Scryer", "Seafarer", "Seamstress", "Seer", "Serial Killer", "Shaman", "Shepherd", "Sheriff", "Ship Captain", "Shopkeeper", "Silk-Worm Keeper", "Singer", "Slayer", "Soap Maker", "Sorcerer", "Spell Weaver", "Spellcaster", "Spider Keeper", "Spinner", "Sprite", "Spy", "Stalker", "Storyteller", "Stripper", "Summoner", "Surgeon", "Survivalist", "Sylph", "Tailor", "Tanner", "Teacher", "Theif", "Tinker", "Tracker", "Trader", "Trainer", "Translator", "Transporter", "Trap Maker", "Trapper", "Trauma Surgeon", "Treasurer", "Tree-Keeper", "Trickster", "Undertaker", "Vampire", "Vampire Hunter", "Vault Guard", "Veteran", "Vigilante", "Viking", "Volcanologist", "Ward Crafter", "Warden", "Warlock", "Warrior", "Weaver", "Werewolf", "Wine Master", "Witch", "Witch Doctor", "Wizard", "Woodcarver", "Writer", "Zealot", "Almoner", "Atiliator", "Baliff", "Bottler", "Butler", "Carder", "Carters", "Castellan", "Chamberlain", "Chaplain", "Clerk", "Constable", "Cottar", "Ditcher", "Ewerer", "Falconer", "Fuller", "Glazier", "Gong Farmer", "Hayward", "Herald", "Keeper Of The Wardrobe", "Kinight", "Laird", "Marshal", "Master Mason", "Minstrel", "Porter", "Reeve", "Sapper", "Scullion", "Shearman", "Shoemaker", "Spinster", "Steward", "Squire", "Watchman", "Woodworker", "Tanners", "Soap Makers", "Cask Makers", "Cloth Makers", "Candle Makers (Chandlers)", "Gold And Silver Smiths", "Laundresses", "Bakers", "Grooms", "Pages", "Huntsmen", "Doctors", "Painters", "Plasterers", "And Painters", "Potters", "Brick And Tile Makers", "Glass Makers", "Shipwrights", "Sailors", "Butchers", "Fishmongers", "Farmers", "Herdsmen", "Millers", "The Clergy", "Parish Priests", "Members Of The Monastic Orders", "Innkeepers", "Roadmenders", "Woodwards (For The Forests). Slingers", "Lady-In-Waiting", "Chamber Maid", "Doctors", "Brewer", "Poulterer", "Fruiterer", "Slaughterer", "Dispenser", "Cupbearerer"};
        JobField.setText(genThing(jobs));
        String[] likes = {"Fruit Leather", "Candied Orange Peels", "Incense", "Candles", "Silkes", "Large Pillows", "Furs", "Carved Bones", "Succulent", "Warm Baths", "Chocolate", "Tapestries", "Wooden Carvings", "Leathers", "Feathers", "Gemstones", "Paintings", "Bath Salts", "Candied Nuts", "Hookah", "Tea", "Fossil Collecting", "Pottery", "Chinese Food", "Japanese Food", "Super Cold / Raining Outside And I'M Inside", "Nature", "Fantasy", "Science", "Art", "(Character)", "Food", "(Food)", "Hot Drinks", "Diving", "(Deity)", "Dresses", "Glitches", "Computers", "Viruses", "Pinapples", "Pens", "Fountain Pens", "Fountains", "Pine Trees", "Trees", "Hiking In The Mountains", "Creeks", "Dragons", "Mythology", "Rainy Days", "Sunny Days", "Swimming", "Writing", "Painting With Watercolor", "Animals", "Playing In Snow", "Camping", "The Smell Of Rain The Forest", "Lanterns", "Mason Jars", "Victorian Era Things", "Steampunk", "Traveling", "(Color)", "Dappled Sunlight", "Jellyfish", "Aquariums", "Zoos", "Museums", "Christmas Lights", "(Song)", "Hot Chocolate", "Playing In The Snow With Friends", "Finishing A Piece Of Writing Or Art", "Browsing National Geographic", "Video Games", "Sewing", "Snow", "Anime", "Anime Conventions", "Pets", "Pandas", "Books", "Cats", "Vintage Items", "Phoenixes", "Making Crafts", "Cuddling", "Music", "Long Walks", "Dogs", "Sweaters", "Summer", "Winter", "Spring", "Sweet Tea", "Smiling", "Laughing", "Jokes", "Long Hair", "Good Vibes", "Day Dreaming", "Reading", "Sleeping", "Blogging", "Photography", "Fuzzy Blankets", "Kissing", "Sex", "Hugs", "Hand Holding", "Money", "Clothes", "Football", "Basketball", "Baseball", "Kickball", "Dodge Ball", "Concerts", "Partying", "Drinking", "Weed", "Drugs", "Guys", "Girls", "Texting", "Dancing", "Shoes", "Fashion", "Acting", "Modeling", "Helping Others", "Kissing In The Rain", "Painting", "Drawing", "Horror Movies", "Romantic Movies", "Comedies", "Ice Cold Water", "Instant Tea", "Vivaldi", "Rap Music", "Bruegel & Vermeer", "Picasso", "Room Service", "Waiting", "Siena", "Mixed Vegetables", "Leonard Cohen’S Lyrics", "Ambulance Sirens", "Candles", "Telephone Solicitations", "Kites", "Junk Mail", "Apples", "Insurance", "All Things Apple", "Being Put On “Hold”", "Chocolate", "Colorized Movies", "Rainbows", "Strawberries", "Used Book Stores", "Crickets", "Good Manners", "“Sucks”", "Handmade Quilts", "Daily Oklahoman", "Mice", "Jewelry", "Rolypoly Bugs", "Lapel Buttons", "Reruns", "Quotations", "Know-It-All’S", "“Slasher” Films", "Boiled Okra", "Shakespeare", "The Simpsons", "Post-It Notes", "Whining", "Garden Tomatoes", "Cigarettes", "Comfortable Shoes", "New Shoes", "Gossip", "Elmer’S Glue", "Cartridge Pens", "Snoring", "Mystery", "Whistling", "Quiet", "Trivial Trivia", "Chinese Elms", "Golf", "Roses", "Elvis Presley", "Body Hair", "Body Odor", "Germs", "Liars", "Hypocrites", "Drama", "Studying", "Being Alone", "Crowded Rooms", "People", "Mushrooms", "Bugs", "Wet Socks", "Crying", "Being Touched", "Rain", "Thunder Storms", "The Cold", "The Heat", "Fall", "Water", "School", "Sweating", "(Movie)", "(Artist)", "(Actor/Actress)", "Smoking", "Cheaters", "Kids", "Sad Movies", "Annoying People", "Puking", "Being Sick", "Rough Textures", "Funerals", "Boats", "Airplanes"};
        L1Field.setText(genThing(likes));
        L2Field.setText(genThing(likes));
        L3Field.setText(genThing(likes));
        L4Field.setText(genThing(likes));
        NameField.setText(genName());
        String[] simple = {"A", "Hetero", "Homo", "Bi", "Pan"};
        OAltField.setText(genThing(simple)+"alterous");
        String[] simgender = {"Cisgender", "Agender", "Nonbinary", "Transgender"};
        OGenField.setText(genThing(simgender));
        ORomField.setText(genThing(simple)+"romantic");
        OSexField.setText(genThing(simple)+"sexual");
        String[] orastuff = {"Panther Anole", "Firebearer", "Singed Lemming", "Glass Minnows", "Brilliant Bobtail Squid", "Serpae Tetras", "Chromodori Swimmer", "Discus", "Fire Ant", "Ladybug", "Cindershroom", "Wasteland Pear", "Copper Ore", "Infused Crystal", "Eye Agate", "Amber-Trapped Mosquito", "Banded Sardonyx", "Mangled Textile", "Painted Turtle Shell", "Aged Tome", "Amber", "Orange Goo", "Orange Ooze", "Orange Sludge", "Autumn Dryad", "Orange Blotch Pansy", "Clown Charger", "Baku", "Clown Hippocampus", "Proto Manticore", "Ultramel Amphithere", "Golden Porpoise", "Conjoined Skink", "Fire Sprite", "Molten Marauder", "Mock Firebird", "Autumn Breeze", "Sunrise Hibiscus", "Runebead Necklace", "Searing Armband & Necklace", "Citrine Talonclasp Pendant", "Gold Satin Tunic", "Copper Glasses", "Copper Halfmoon Spectacles", "Hip Copper Frames", "Blazing Slash", "Sear", "Rally", "Health Potion", "Berserker"};
        OraField.setText("[item="+genThing(orastuff)+"]");
        String[] pinstuff = {"Darktide Jellyfish", "Mana Thief", "Maidens Blush", "Spathiphyllum", "Raspberry", "Bee Orchid", "Chalcedony Craylet", "Delta Orchid", "Emetic Russula", "Fallout Whisper", "Petalwing Matriarch", "Sakura Owlet", "Scarlet Mussels", "Southern Gull", "Small Block of Granite", "Rose Quartz", "Corundum Chameleon", "Mesacliff Harpy", "Jeweled Octoflyer", "Maren Wavesinger", "Juvenile Starsweeper", "Fluted Pukasloth", "Candycane Xolo", "Irradiated Astronomer", "Arcane Sprite", "Hibernal Starbear", "Pink Highnoon Hank", "Pink & Purple Flair Scarf", "Pink Satin Tunic", "Blushing Pink Rose", "Pink Daisy Cabbie", "Ethereal Entourage", "Archivist's Spellscroll", "Companion Comet", "Rune Slash", "Mana Bolt", "Enfeeble"};
        PinField.setText("[item="+genThing(pinstuff)+"]");
        String[] purstuff = {"Amethyst Striker", "Bog Canary", "Weird Purple Skink", "Julii Corycat", "Aether Hermit", "Snowflake Urchin", "Egghead Infiltrator", "Subterranean Clover", "Black Tulip", "Peace Lily", "Blackberry", "Star Moss", "Leechroot Mushroom", "Starfall Blossom", "Engineered Strawberry", "Dark Creeper", "Aether Cherries", "Chewy Tentacle", "Cicada", "Cliffside Milkweed", "Crowntail Wanderer", "Decorated Turtle Shell", "Haunted Stone Orb", "Magical Shards", "Dark-Tufted Sparrowmouse", "Nightsky Fuiran", "Shadow Serpent", "Zeeba", "Rainbow Sprite", "Abyss Striker", "Maned Cobra", "Anomalous Skink", "Arcane Sprite", "Ethereal Trickster", "Mist Slash", "Dark Bolt", "Shroud", "Dark Might Fragment", "Dark Acuity Fragment", "Obsidian Hybrid Fragment", "Tricktrouper Crown", "Companion Comet"};
        PurField.setText("[item="+genThing(purstuff)+"]");
        String[] redstuff = {"Fire Ant", "Harlequin Ladybug", "Earwig", "Red and Black Froghopper", "Lava Strider", "Wetland Vampire", "Ruby Tetras", "Red Emperor Tulip", "Blood Spath", "Winter's Delight", "Red Delicious Apple", "Strawberry", "Flameweed", "Coral Snake", "Rhodochrosite", "Bloodstone", "Jasper", "Red Linen Fabric Scrap", "Good Eater Award", "Ruby Ring", "Red Goo", "Red Ooze", "Red Sludge", "Iron Ore", "Tiny Feathers", "Sentinel Armor", "Sizzling Phosphorus", "Intricate Weaving", "Berserker's Belt", "Cerdae Sparkle", "Ornamental Sash", "Sakura Moss", "Simple Raptorik Sash", "Carmine Serthis", "Ancient Fungus", "Scarlet Flycatcher", "Crimson Reef Snail", "Cardinal Hippogriff", "Ruby Webwing", "Red-Breasted Hainu", "Bloodstone Beetle", "Nochnyr", "Molten Wartoad", "Magma Embear", "Firebreather Cape", "Corsair's Seaspray Kerchief", "Red Warrior Face Mask", "Infectionist's Emblem", "Infectionist's Armband", "Paunchy Red Percher", "Rose-Colored Shades", "Melodious Vest", "Nomad's Sandwastes Vest", "Cursed Talonclasp Pendant", "Rose Highnoon Hank", "Romantic Red Rose", "Little Red Riding Hood", "Ruby Deepsea Bulb", "Red Renaissance Shirt", "Red Breeches", "Seafarer's Shirt", "Red and Gold Flair Scarf", "Red Fedora", "Scarlet Satin Tunic", "Blood Red Wolf Cape", "Minor Health Potion", "Scratch", "Shred", "Eliminate"};
        RedField.setText("[item="+genThing(redstuff)+"]");
        String[] status = {"Alive", "Dead", "Sick", "Cancerous", "Undead", "Zombie", "Godly", "Ressurected", "Infirm", "Demigodly", "Blessed", "Cursed", "Healthy", "Fatigued", "Shadetouched", "Corrupted", "Happy", "Content", "Wanderlust", "Depressed"};
        StatusField.setText(genThing(status));
        String[] vice = {"Abuse", "Addictions", "Adultery", "Adversity", "Aggression", "Agitation", "Alcoholism", "Alienation", "Aloofness", "Ambition", "Anarchy", "Anger", "Angst", "Animosity", "Anxiety", "Apathy", "Approval-Seeking", "Arrogance", "Attachment", "Avarice", "Awkwardness", "Baseness", "Bigotry", "Blame", "Blasphemy", "Boastfulness", "Boredom", "Brutality", "Burnout", "Calculation", "Callousness", "Calumniation", "Capriciousness", "Celebrity", "Censoriousness", "Chaos", "Chauvinism", "Complacency", "Complaining", "Compromise", "Conceit", "Condescension", "Conflict", "Conformity", "Confusion", "Conniving", "Contempt", "Contradiction", "Control", "Corruption", "Cowardice", "Criticism", "Cruelty", "Cunning", "Cursing", "Cynicism", "Death", "Debasement", "Deceit", "Deception", "Definition", "Delusion", "Denial", "Dependency", "Depression", "Derision", "Desecration", "Desire For Fame", "Desolation", "Despair", "Destitution", "Detachment", "Deviance", "Disappointment", "Discord", "Disrespect", "Dissatisfaction", "Dogmatism", "Dominance", "Doubt", "Drudgery", "Dysfunctionality", "Eagerness For Power", "Eccentricity", "Effrontery", "Egoism", "Egotism", "Elitism", "Embarrassment", "Emptiness", "Enmity", "Enviousness", "Envy", "Escapism", "Evil", "Exaggeration", "Excessiveness", "Exclusion", "Expectations", "Exploitation", "Extravagance", "Extremism", "Failure", "Faithlessness", "Falseness", "Fame (Seeking", "After)", "Fantasy", "Fashion", "Fatalism", "Faults", "Fear", "Fight", "Fixations", "Folly", "Forgetfulness", "Frailty", "Fundamentalism", "Furtiveness", "Futility", "Gambling", "Garrulity", "Gaudiness", "Glamour", "Gloominess", "Gluttony", "Gossip", "Greed", "Grief", "Holding Grudges", "Grumpiness", "Guilt", "Hard-Heartedness", "Hate", "Hatred", "Haughtiness", "Hell", "Heresy", "High-Handedness", "Hoarding", "Hostility", "Humiliation", "Hurt", "Hyperbole", "Hypocrisy", "Hysteria", "Ignorance", "Illusion", "Imitation", "Impatience", "Imperfection", "Imperiousness", "Imposture", "Impudence", "Inattentiveness", "Indecency", "Indecision", "Indifference", "Indigence", "Individualism", "Ingratitude", "Inhibitions", "Insanity", "Insatiability", "Insecurity", "Insidiousness", "Insult", "Intolerance", "Intimidation", "Intransigence", "Irony", "Irrationality", "Irresponsibility", "Irritation", "Isolation", "Jealousy", "Judgmental", "Justification", "Know-It-All", "Laziness", "Lecherousness", "Lethargy", "Licentiousness", "Lies", "Loneliness", "Loss", "Lust", "Luxury", "Lying", "Machismo", "Madness", "Maliciousness", "Malignancy", "Manipulation", "Masochism", "Materialism", "Meanness", "Mediocrity", "Meekness", "Melancholy", "Mercilessness", "Misery", "Miserliness", "Mistakes", "Money (Focus On)", "Moodiness", "Naiveté", "Narcissism", "Narrow-Mindedness", "Nastiness", "Neediness", "Negativity", "Neurosis", "Nihilism", "Obedience (Without", "Question)", "Obsession", "Obstinacy", "Opportunism", "Oppression", "Ostentatiousness", "Over-Consumption", "Over-Identification", "Pacifism", "Pain", "Panic", "Passion", "Patronizing", "Pensiveness", "Penury", "Persuasion", "Perversion", "Pessimism", "Pettiness", "Pomposity", "Poverty", "Power", "Prejudice", "Presumption", "Pretense", "Pretentiousness", "Pride", "Privilege", "Problems", "Procrastination", "Prodigality", "Profit-As-Sole-Value", "Profligacy", "Promiscuity", "Promises Un-Kept", "Punishment", "Quarrelsomeness", "Racism", "Rage", "Rape", "Rapaciousness", "Rapacity", "Rashness", "Recklessness", "Regret", "Rejection", "Remorse", "Resentment", "Resignation", "Revenge", "Rudeness", "Righteousness", "Ridicule", "Righteousness", "Rigidity", "Risk-Aversion", "Romantic Fantasy", "Rudeness", "Rumor Spreading", "Ruthlessness", "Sacrifice", "Sadism", "Sadness", "Sarcasm", "Scandal Mongering", "Secrecy", "Seduction", "Self-Centeredness", "Self-Denial", "Self-Destructiveness", "Self-Doubt", "Self-Hatred", "Selfishness", "Self-Pity", "Self-Righteousness", "Sensationalism", "Separateness", "Separation", "Sexual Lust", "Shame", "Shamelessness", "Shyness", "Sin", "Skepticism", "Sloth", "Snobbery", "Sorrow", "Spendthriftness", "Spite", "Spoiling", "Stagnation", "Stinginess", "Stress", "Stubbornness", "Stupidity", "Suffering", "Superficiality", "Superiority", "Suspicion", "Taboos", "Temper Tantrums", "Terror", "Theft", "Timidity", "Torment", "Torture", "Tragedy", "Treason", "Tyranny", "Ugliness", "Unkindness", "Unreason", "Unruliness", "Unyielding", "Vanity", "Venality", "Verbosity", "Vices", "Vindictiveness", "Violence", "Vulnerability", "Wastrelness", "Weakness", "Worry", "Wrath", "Zealotry"}; 
        ViceField.setText(genThing(vice));
        String[] virtue = {"Ability", "Abundance", "Acceptance", "Accountability", "Accuracy", "Achievement", "Acknowledgement", "Acting On Convictions", "Activism", "Adaptability", "Adoration", "Adventure", "Advice", "Affection", "Aging Gracefully", "Allowing", "Altruism", "Amazement", "Ambition", "Anger At Injustice", "Anticipation", "Apology", "Appeasement", "Appreciation", "Appreciation Of Beauty", "Appreciation Of", "Excellence", "Approbation", "Appropriate Knowledge", "Appropriate Conduct", "Approval", "Art", "Assertiveness", "Assumptions", "Atonement", "Attention", "Attitude", "Austerity", "Authenticity", "Authority", "Autonomy", "Awareness", "Awe", "Balance", "Beauty", "Being True To Oneself", "Belief", "Benevolence", "Benignity", "Bliss", "Bravery", "Candor", "Capacity To Love", "Capacity To Be Loved", "Care", "Caring", "Caution", "Celebration", "Celibacy", "Certainty", "Chance", "Change", "Chaos", "Character", "Charity", "Charm", "Chastity", "Cheerfulness", "Chivalry", "Choice", "Citizenship", "Civility", "Clarity", "Class", "Cleanliness", "Coincidence", "Collaboration", "Commitment", "Communication", "Communion", "Community", "Companionship", "Compassion", "Completeness", "Composure", "Comprehension", "Compromise", "Concentration", "Confession", "Confidence", "Congruence", "Conscience", "Consciousness", "Consecration", "Conservatism", "Consideration", "Consistency", "Contemplation", "Contentment", "Contribution", "Control", "Conviction", "Cooperation", "Cooperativeness", "Correctness", "Courage", "Courteousness", "Courtesy", "Creativity", "Credibility", "Critical Thinking", "Culture", "Curiosity", "Death (Acceptance Of)", "Decency", "Dedication", "Deliberation", "Delight", "Dependability", "Desire", "Destiny", "Detachment", "Determination", "Devotion To Virtues", "Devotion To Others", "Dignity", "Diligence", "Diplomacy", "Discernment", "Discipline", "Discretion", "Disillusion", "Dissolution", "Diversity", "Dreams", "Dutifulness", "Eagerness", "Earnestness", "Ecstasy", "Education", "Efficiency", "Endurance", "Effort", "Elegance", "Elevation", "Eloquence", "Emotion", "Empathy", "Emptiness", "Encouragement", "Endurance", "Energy", "Enlightenment", "Enthusiasm", "Epiphany", "Equality", "Equanimity", "Esteem", "Etiquette", "Excellence", "Excitement", "Expressiveness", "Extravagance", "Failure (Allowing For)", "Fairness", "Faith", "Faithfulness", "Family", "Farsightedness", "Fearlessness", "Feeling", "Fidelity", "Finishing What’S Started", "Flexibility", "Flow", "Focus", "Forbearance", "Foresight", "Forgiveness", "Fortitude", "Frankness", "Freedom", "Friendliness", "Friendship", "Frugality", "Fulfillment", "Fun", "Gallantry", "Generosity", "Genius", "Gentleness", "Genuineness", "Glory", "Goals", "Godliness", "Good Speech", "Goodness", "Grace", "Grandeur", "Gratefulness", "Gratitude", "Gravitas", "Gravity", "Growth", "Happiness", "Harmlessness", "Harmony", "Healing", "Health", "Heaven On Earth", "Helpfulness", "Helping Others", "Holiness", "Honesty", "Honor", "Hope", "Hopefulness", "Hospitality", "Humanity", "Humility", "Humor", "Idealism", "Ideals", "Illumination", "Imagination", "Impartiality", "Imperfection (Allowing For)", "Inclusion", "Incorruptibility", "Independence", "Individuality", "Industriousness", "Ingenuity", "Initiative", "Inner Exploration", "Innocence", "Innovation", "Insight", "Inspiration", "Instinct", "Integrity", "Intelligence", "Interdependence", "Interest In The World", "Intimacy", "Intuition", "Inventiveness", "Investigation", "Irony", "Joy", "Joyfulness", "Judgment (Good)", "Justice", "Kind Speech", "Kindness", "Kinship", "Knowledge", "Laughter", "Leadership", "Learning", "Leisure", "Liberalism", "Liberty", "Listening", "Logic", "Love", "Love Of Learning", "Loving-Kindness", "Lovingness", "Loyalty", "Luck", "Luxuriating", "Majesty", "Management", "Manners", "Maturity", "Meaning", "Mellowness", "Mercy", "Mildness", "Mindfulness", "Mistakes (Allowing For)", "Moderation", "Modesty", "Morality", "Motherhood", "Motivation", "Niceness", "Nobility", "Non-Covetousness", "Non-Duality", "Non-Separateness", "Non-Violence", "Nostalgia", "Nurturance", "Nurturing", "Objectivity", "Open-Heartedness", "Open-Mindedness", "Openness", "Optimism", "Order", "Orderliness", "Organization", "Originality", "Overcoming Adversity", "Pacifism", "Paradise", "Passion", "Patience", "Patriotism", "Peace", "Peacefulness", "Penitence", "Pensiveness", "Perseverance", "Persistence", "Personality", "Perspective", "Persuasion", "Philanthropy", "Piety", "Pity", "Planning", "Play", "Playfulness", "Pleasure", "Pluralism", "Politeness", "Positive Bias", "Potency", "Potential", "Power (Right Use Of)", "Practice", "Practicality", "Pragmatism", "Praise", "Prayer", "Prayerfulness", "Precision", "Principles", "Privacy", "Privilege", "Potency", "Probity", "Problem-Solving", "Productivity", "Professionalism", "Profit", "Promises", "Propriety", "Prosperity", "Protection", "Protest", "Prudence", "Punctuality", "Purification", "Purity", "Purity Of Heart", "Purpose", "Purposeful Work", "Purposefulness", "Quality Evaluation", "Quality Improvement", "Quest", "Radiance", "Rapture", "Rationality", "Realism", "Reality", "Realization", "Reason", "Rebirth", "Receptivity", "Reciprocity", "Reconciliation", "Rectitude", "Redemption", "Refinement", "Reflection", "Relaxation", "Release", "Reliability", "Religiosity", "Remembering", "Remembrance", "Remorse", "Renunciation", "Repentance", "Reputation", "Research", "Resilience", "Resisting Temptations", "Resolution", "Respect", "Respectability", "Respectfulness", "Responsibility", "Restraint", "Reverence", "Right Action", "Right Concentration", "Right Effort", "Right Intention", "Right Livelihood", "Right Mindfulness", "Right Speech", "Right View (Buddha’S", "Noble Eightfold Path)", "Right Use Of Power", "Right Use Of Will", "Righteousness", "Rights (Respect For)", "Risk Taking", "Rituals", "Romance", "Roots", "Sacredness", "Sacrifice", "Sadness", "Salvation", "Sanity", "Satiety", "Satisfaction", "Secrecy (Proper Use)", "Security", "Seeing", "Self-Awareness", "Self-Centeredness", "Self-Confidence", "Self-Control", "Self-Discipline", "Self-Esteem", "Self-Examination", "Self-Expression", "Self-Improvement", "Self-Possession", "Self-Regulation", "Self-Reliance", "Self-Respect", "Self-Restraint", "Self-Righteousness", "Self-Trust", "Sense Of Purpose", "Sensibility", "Sensitivity", "Sensory Pleasure", "Sensuality", "Sentimentality", "Serendipity", "Serenity", "Service", "Sharing", "Shyness", "Silence", "Simplicity", "Sincerity", "Skepticism", "Skill", "Smartness", "Sobriety", "Social Intelligence", "Social Responsibility", "Solidarity", "Solitude", "Soul Evolution", "Soulfulness", "Spirit", "Spiritual Insight", "Spirituality", "Sportsmanship", "Steadfastness", "Stick-To-It-Iveness", "Straightforwardness", "Strength", "Stress (“Good”)", "Study", "Success", "Succor", "Suffering (With", "Understanding)", "Support Of Others", "Surrender", "Sweet-Tempered", "Sympathy", "Synergy", "Tact", "Tactfulness", "Talent", "Taste", "Teaching Others", "Team-Spirit", "Teamwork", "Temperance", "Tenacity", "Tenderness", "Thankfulness", "Thoroughness", "Thoughtfulness", "Thrift", "Time", "Tithing", "Tolerance", "Training", "Tranquility", "Transcendence", "Transcendental Wisdom", "Transformation", "Transition", "Trust", "Trustfulness", "Trustworthiness", "Truth", "Truthfulness", "Unconditional Love", "Understanding", "Unity", "Universality", "Unselfishness", "Valor", "Values", "Verbal Acuity", "Victory", "Vigor", "Virility", "Virtue", "Vision", "Vitality", "Vulnerability", "Wealth", "Wholesomeness", "Will (Proper Use Of)", "Wisdom", "Wonder", "Work", "Workmanship", "Worship", "Worth", "Youthfulness", "Zealousness", "Zest"}; 
        VirtueField.setText(genThing(virtue));
        String[] yelstuff = {"Sunset Sea Dragon", "Deepsea Cucumber", "Dumpling Squid", "Corycat", "Golden Cushionfish", "Luminous Shortfin", "Golden Reefprince", "Canopy Darter", "Albino Dasher", "Dark-bordered Beauty", "Reedcleft Sparkler", "Jungle Mantis", "Wild Mustard", "Ashfall Prickler", "Granny Smith Apple", "Daffodil", "Sour Strawberry", "Sacridite", "Fool's Gold", "Canopic Jar", "Amber-Trapped Fly", "Gold Ore", "Turtle Shell", "Ancestral Incense", "Chrysoberyl", "Yellow Goo", "Yellow Ooze", "Yellow Sludge", "Yellow-Throated Sparrowmouse", "Cockatrice", "Longneck Wanderer", "Sunspot Clouddancer", "Brilliant Psywurm", "Salve Kamaitachi", "Wetland Unicorn", "Coppercoil Creeper", "Cheerful Residue", "Dwarf Unicorn", "Sköll", "Light Sprite", "Sunbeam Soldier", "Golden Idol", "Grasslands Trunker", "Gilded Crown", "Gold Wolf Cape", "Autumnal Wreath", "Golden Deepsea Bulb", "Amber Delver's Lamp", "Brass Cornet", "Wooden Pipeflute", "Gold Satin Tunic", "Gold Renaissance Shirt", "Gold Breeches", "Festival Jewelry", "Illuminated Emblem", "Sunchaser Jewelry", "Sunguard Chest", "Flame Bolt", "Bright Bolt", "Blinding Slash", "Bolster", "Clobber", "Major Health Potion"};
        YelField.setText("[item="+genThing(yelstuff)+"]");
    }//GEN-LAST:event_RandomButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void MadeByButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MadeByButtonActionPerformed
        // TODO add your handling code here:
        String url = "http://flightrising.com/main.php?p=lair&tab=userpage&id=160158";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MadeByButtonActionPerformed

    private void RelatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelatFieldActionPerformed

    private void IMGnURLGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMGnURLGenerateButtonActionPerformed
        // TODO add your handling code here:
        IMGURLOutputField.setText("[url="+URLField.getText()+"][img]"+IMGField.getText()+"[/img][/url]");
    }//GEN-LAST:event_IMGnURLGenerateButtonActionPerformed

    private void DragonImagesGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DragonImagesGenerateButtonActionPerformed
        // TODO add your handling code here:
        /*public static String makeAvie(String a){
     String did1s = a;
    did1s = did1s.substring(0,(did1s.length()-2));
    did1s = String.valueOf(Integer.parseInt(did1s)+1); 
    return "[url=http://flightrising.com/main.php?dragon="+a+"][img]http://flightrising.com/rendern/portraits/"+did1s+"/"+a+"p.png[/img][/url]";
    }*/
        String DID = DIDIMGField.getText();
        String ADI = (Integer.parseInt(DID.substring(0,(DID.length()-2)))+1)+"";
        if(LinkButton.isSelected()) {AvatarField.setText("[url=http://flightrising.com/main.php?dragon="+DID+"][img]http://flightrising.com/rendern/portraits/"+ADI+"/"+DID+"p.png[/img][/url]");} 
        else { AvatarField.setText("[img]http://flightrising.com/rendern/portraits/"+ADI+"/"+DID+"p.png[/img]"); }
        if(LinkButton.isSelected()) {MiniField.setText("[url=http://flightrising.com/main.php?dragon="+DID+"][img]http://flightrising.com/rendern/avatars/"+ADI+"/"+DID+".png[/img][/url]");}
        else {MiniField.setText("[img]http://flightrising.com/rendern/avatars/"+ADI+"/"+DID+".png[/img]");}
        if(LinkButton.isSelected()) {NormalField.setText("[url=http://flightrising.com/main.php?dragon="+DID+"][img]http://flightrising.com/rendern/350/"+ADI+"/"+DID+"_350.png[/img][/url]");}
        else {NormalField.setText("[img]http://flightrising.com/rendern/350/"+ADI+"/"+DID+"_350.png[/img]");}
        
        
    }//GEN-LAST:event_DragonImagesGenerateButtonActionPerformed

    private void SkinPreviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkinPreviewButtonActionPerformed
        // TODO add your handling code here:
        String DID = DIDSkinField.getText(); String SID = SkinNumberField.getText();
        PreviewField.setText("http://flightrising.com/image_generators/skins_preview.php?i="+SID+"&d="+DID);
        PreviewWIMGField.setText("[img]http://flightrising.com/image_generators/skins_preview.php?i="+SID+"&d="+DID+"[/img]");
        
    }//GEN-LAST:event_SkinPreviewButtonActionPerformed

    private void OpenSkinPreviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenSkinPreviewButtonActionPerformed
        // TODO add your handling code here:
        String DID = DIDSkinField.getText(); String SID = SkinNumberField.getText();
        String url = "http://flightrising.com/image_generators/skins_preview.php?i="+SID+"&d="+DID;
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OpenSkinPreviewButtonActionPerformed

    private void TitleField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField2ActionPerformed

    private void TitleField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField3ActionPerformed

    private void TitleField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField5ActionPerformed

    private void TitleField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField6ActionPerformed

    private void TitleField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField7ActionPerformed

    private void TitleField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField8ActionPerformed

    private void TitleField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField9ActionPerformed

    private void TitleField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField10ActionPerformed

    private void TitleField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField11ActionPerformed

    private void TitleField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField12ActionPerformed

    private void TitleField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleField13ActionPerformed

    private void RPGRandomizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPGRandomizeButtonActionPerformed
        // TODO add your handling code here:
        int sp = Integer.parseInt(TotalSkillField.getText());
        String skills[][] = {{"Magic","0","10"}, {"Strength","0","10"}, {"Defense","0","10"}, {"Charisma","0","10"}, {"Health","0","10"}, {"Intelligence","0","10"}, {"Speed","0","10"}, {"Agility","0","10"}, {"Reflexes","0","10"}, {"Luck","0","10"}, {"Willpower","0","10"}, {"Stamina","0","10"}};
        int sum = 0;
        if (!(ExactField.isSelected())){
        do {
if(EnabledField1.isSelected()){skills[0][0] = TitleField1.getText(); skills[0][1] = (int)(Math.random()*10)+"";skills[0][2] = (10 - Integer.parseInt(skills[0][1]))+"";  }
if(EnabledField2.isSelected()){skills[1][0] = TitleField2.getText(); skills[1][1] = (int)(Math.random()*10)+"";skills[1][2] = (10 - Integer.parseInt(skills[1][1]))+"";  }
if(EnabledField3.isSelected()){skills[2][0] = TitleField3.getText(); skills[2][1] = (int)(Math.random()*10)+"";skills[2][2] = (10 - Integer.parseInt(skills[2][1]))+"";  }

if(EnabledField5.isSelected()){skills[3][0] = TitleField5.getText(); skills[3][1] = (int)(Math.random()*10)+""; skills[3][2] = (10 - Integer.parseInt(skills[3][1]))+"";  }
if(EnabledField6.isSelected()){skills[4][0] = TitleField6.getText(); skills[4][1] = (int)(Math.random()*10)+""; skills[4][2] = (10 - Integer.parseInt(skills[4][1]))+"";  }
if(EnabledField7.isSelected()){skills[5][0] = TitleField7.getText(); skills[5][1] = (int)(Math.random()*10)+""; skills[5][2] = (10 - Integer.parseInt(skills[5][1]))+"";  }
if(EnabledField8.isSelected()){skills[6][0] = TitleField8.getText(); skills[6][1] = (int)(Math.random()*10)+""; skills[6][2] = (10 - Integer.parseInt(skills[6][1]))+"";  }
if(EnabledField9.isSelected()){skills[7][0] = TitleField9.getText(); skills[7][1] = (int)(Math.random()*10)+""; skills[7][2] = (10 - Integer.parseInt(skills[7][1]))+"";  }
if(EnabledField10.isSelected()){skills[8][0] = TitleField10.getText(); skills[8][1] = (int)(Math.random()*10)+""; skills[8][2] = (10 - Integer.parseInt(skills[8][1]))+"";  }
if(EnabledField11.isSelected()){skills[9][0] = TitleField11.getText(); skills[9][1] = (int)(Math.random()*10)+""; skills[9][2] = (10 - Integer.parseInt(skills[9][1]))+"";  }
if(EnabledField12.isSelected()){skills[10][0] = TitleField12.getText(); skills[10][1] = (int)(Math.random()*10)+""; skills[10][2] = (10 - Integer.parseInt(skills[10][1]))+"";  }
if(EnabledField13.isSelected()){skills[11][0] = TitleField13.getText(); skills[11][1] = (int)(Math.random()*10)+""; skills[11][2] = (10 - Integer.parseInt(skills[11][1]))+"";  }
sum = Integer.parseInt(skills[0][1])+ Integer.parseInt(skills[1][1])+ Integer.parseInt(skills[2][1])+ Integer.parseInt(skills[3][1])+ Integer.parseInt(skills[3][1])+ Integer.parseInt(skills[4][1])+ Integer.parseInt(skills[5][1])+ Integer.parseInt(skills[6][1])+ Integer.parseInt(skills[7][1])+ Integer.parseInt(skills[8][1])+ Integer.parseInt(skills[9][1])+ Integer.parseInt(skills[10][1])+ Integer.parseInt(skills[11][1]);
        } while (sum > sp); }
        else {
             do {
if(EnabledField1.isSelected()){skills[0][0] = TitleField1.getText(); skills[0][1] = (int)(Math.random()*10)+"";skills[0][2] = (10 - Integer.parseInt(skills[0][1]))+"";  }
if(EnabledField2.isSelected()){skills[1][0] = TitleField2.getText(); skills[1][1] = (int)(Math.random()*10)+"";skills[1][2] = (10 - Integer.parseInt(skills[1][1]))+"";  }
if(EnabledField3.isSelected()){skills[2][0] = TitleField3.getText(); skills[2][1] = (int)(Math.random()*10)+"";skills[2][2] = (10 - Integer.parseInt(skills[2][1]))+"";  }

if(EnabledField5.isSelected()){skills[3][0] = TitleField5.getText(); skills[3][1] = (int)(Math.random()*10)+""; skills[3][2] = (10 - Integer.parseInt(skills[3][1]))+"";  }
if(EnabledField6.isSelected()){skills[4][0] = TitleField6.getText(); skills[4][1] = (int)(Math.random()*10)+""; skills[4][2] = (10 - Integer.parseInt(skills[4][1]))+"";  }
if(EnabledField7.isSelected()){skills[5][0] = TitleField7.getText(); skills[5][1] = (int)(Math.random()*10)+""; skills[5][2] = (10 - Integer.parseInt(skills[5][1]))+"";  }
if(EnabledField8.isSelected()){skills[6][0] = TitleField8.getText(); skills[6][1] = (int)(Math.random()*10)+""; skills[6][2] = (10 - Integer.parseInt(skills[6][1]))+"";  }
if(EnabledField9.isSelected()){skills[7][0] = TitleField9.getText(); skills[7][1] = (int)(Math.random()*10)+""; skills[7][2] = (10 - Integer.parseInt(skills[7][1]))+"";  }
if(EnabledField10.isSelected()){skills[8][0] = TitleField10.getText(); skills[8][1] = (int)(Math.random()*10)+""; skills[8][2] = (10 - Integer.parseInt(skills[8][1]))+"";  }
if(EnabledField11.isSelected()){skills[9][0] = TitleField11.getText(); skills[9][1] = (int)(Math.random()*10)+""; skills[9][2] = (10 - Integer.parseInt(skills[9][1]))+"";  }
if(EnabledField12.isSelected()){skills[10][0] = TitleField12.getText(); skills[10][1] = (int)(Math.random()*10)+""; skills[10][2] = (10 - Integer.parseInt(skills[10][1]))+"";  }
if(EnabledField13.isSelected()){skills[11][0] = TitleField13.getText(); skills[11][1] = (int)(Math.random()*10)+""; skills[11][2] = (10 - Integer.parseInt(skills[11][1]))+"";  }
sum = Integer.parseInt(skills[0][1])+ Integer.parseInt(skills[1][1])+ Integer.parseInt(skills[2][1])+ Integer.parseInt(skills[3][1])+ Integer.parseInt(skills[3][1])+ Integer.parseInt(skills[4][1])+ Integer.parseInt(skills[5][1])+ Integer.parseInt(skills[6][1])+ Integer.parseInt(skills[7][1])+ Integer.parseInt(skills[8][1])+ Integer.parseInt(skills[9][1])+ Integer.parseInt(skills[10][1])+ Integer.parseInt(skills[11][1]);
        } while (sum != sp);
        }
SpinnerField1.setValue(Integer.parseInt(skills[0][1]));
SpinnerField2.setValue(Integer.parseInt(skills[1][1]));
SpinnerField3.setValue(Integer.parseInt(skills[2][1]));

SpinnerField5.setValue(Integer.parseInt(skills[3][1]));
SpinnerField6.setValue(Integer.parseInt(skills[4][1]));
SpinnerField7.setValue(Integer.parseInt(skills[5][1]));
SpinnerField8.setValue(Integer.parseInt(skills[6][1]));
SpinnerField9.setValue(Integer.parseInt(skills[7][1]));
SpinnerField10.setValue(Integer.parseInt(skills[8][1]));
SpinnerField11.setValue(Integer.parseInt(skills[9][1]));
SpinnerField12.setValue(Integer.parseInt(skills[10][1]));
SpinnerField13.setValue(Integer.parseInt(skills[11][1]));

RPGOutputField.setText("SP: "+sp+", Sum: "+sum+"");
String[][] rancols = {{"Black","Grey"}, {"Orange","Yellow"}, {"Purple","Pink"}, {"Blue","Teal"}, {"Red","Orange"}, {"Green","GreenYellow"}};
int ranin = (int)(Math.random() * rancols.length);
ChCoField.setText(rancols[ranin][0]); UchCoField.setText(rancols[ranin][1]);
    }//GEN-LAST:event_RPGRandomizeButtonActionPerformed

    private void RPGGenerateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPGGenerateButtonActionPerformed
        // TODO add your handling code here:
        String[][] infos = {{"A","0"}, {"B","0"}, {"C","0"}, {"D","0"}, {"E","0"}, {"F","0"}, {"G","0"}, {"H","0"}, {"I","0"}, {"J","0"}, {"K","0"}, {"L","0"}};
        String[][] chara = {{"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}, {"",""}};
        String[] codes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String chco = ChCoField.getText(); String uchco = UchCoField.getText(); 
        String chch = ChChField.getText(); String uchch = UchChField.getText();
        
        infos[0][0] = TitleField1.getText(); infos[1][0] = TitleField2.getText(); infos[2][0] = TitleField3.getText(); infos[3][0] = TitleField5.getText(); infos[4][0] = TitleField6.getText(); infos[5][0] = TitleField7.getText(); infos[6][0] = TitleField8.getText(); infos[7][0] = TitleField9.getText(); infos[8][0] = TitleField10.getText(); infos[9][0] = TitleField11.getText(); infos[10][0] = TitleField12.getText(); infos[11][0] = TitleField13.getText(); 
        infos[0][1] = SpinnerField1.getValue()+""; infos[1][1] = SpinnerField2.getValue()+""; infos[2][1] = SpinnerField3.getValue()+""; infos[3][1] = SpinnerField5.getValue()+""; infos[4][1] = SpinnerField6.getValue()+""; infos[5][1] = SpinnerField7.getValue()+""; infos[6][1] = SpinnerField8.getValue()+""; infos[7][1] = SpinnerField9.getValue()+""; infos[8][1] = SpinnerField10.getValue()+""; infos[9][1] = SpinnerField11.getValue()+""; infos[10][1] = SpinnerField12.getValue()+""; infos[11][1] = SpinnerField13.getValue()+""; 
        
        for(int i=0;i<codes.length;i++){
            for(int ii=0;ii<Integer.parseInt(infos[i][1]);ii++){
                chara[i][0] += chch;
            }
            for(int ii=0;ii<10-Integer.parseInt(infos[i][1]);ii++){
                chara[i][1] += uchch;
            }
        }
        for(int i=0;i<infos.length;i++){
            codes[i] = "[b][Color="+chco+"]"+infos[i][0]+"[/b]\n" +
"[Color="+chco+"]"+chara[i][0]+"[color="+uchco+"]"+chara[i][1]+"[/color]\n";
        }
        String outp = "";
if(EnabledField1.isSelected()) { outp += codes[0]; }
if(EnabledField2.isSelected()) { outp += codes[1]; }
if(EnabledField3.isSelected()) { outp += codes[2]; }
if(EnabledField5.isSelected()) { outp += codes[3]; }
if(EnabledField6.isSelected()) { outp += codes[4]; }
if(EnabledField7.isSelected()) { outp += codes[5]; }
if(EnabledField8.isSelected()) { outp += codes[6]; }
if(EnabledField9.isSelected()) { outp += codes[7]; }
if(EnabledField10.isSelected()) { outp += codes[8]; }
if(EnabledField11.isSelected()) { outp += codes[9]; }
if(EnabledField12.isSelected()) { outp += codes[10]; }
if(EnabledField13.isSelected()) { outp += codes[11]; }
        RPGOutputField.setText(outp);
    }//GEN-LAST:event_RPGGenerateButtonActionPerformed

    private void FearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FearFieldActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(NewJFrame.MAXIMIZED_BOTH); 
    }//GEN-LAST:event_formWindowOpened

    private void ZCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZCalcButtonActionPerformed
        // TODO add your handling code here:
        Map<String, String> map = new HashMap<String, String>();
        map.put("Month","0");	map.put("January","01");	map.put("February","02");	map.put("March","03");	map.put("April","04");	map.put("May","05");	map.put("June","06");	map.put("July","07");	map.put("August","08");	map.put("September","09");	map.put("October","10");	map.put("November","11");	map.put("December","12");
        String day = ZDayField.getText(); if (day.length() < 2) { day = "0"+day; } 
        String biday = map.get(ZMonthField.getSelectedItem().toString())+day;
        String ele = "";
        int bday = Integer.parseInt(biday);
        if((bday>=120)&&(bday<=218)){WesternZodiacField.setText( "Aquarius");}
        else if((bday>=219)&&(bday<=320)){WesternZodiacField.setText( "Pisces");}
        else if((bday>=321)&&(bday<=419)){WesternZodiacField.setText( "Aries");}
        else if((bday>=420)&&(bday<=520)){WesternZodiacField.setText( "Taurus");}
        else if((bday>=521)&&(bday<=620)){WesternZodiacField.setText( "Gemini");}
        else if((bday>=621)&&(bday<=722)){WesternZodiacField.setText( "Cancer");}
        else if((bday>=723)&&(bday<=822)){WesternZodiacField.setText( "Leo");}
        else if((bday>=823)&&(bday<=922)){WesternZodiacField.setText( "Virgo");}
        else if((bday>=923)&&(bday<=1022)){WesternZodiacField.setText( "Libra");}
        else if((bday>=1023)&&(bday<=1121)){WesternZodiacField.setText( "Scorpio");}
        else if((bday>=1122)&&(bday<=1221)){WesternZodiacField.setText( "Sagittarius");}
        else WesternZodiacField.setText( "Capricorn");
        String wzod = WesternZodiacField.getText(); 
        if (wzod.equals("Leo")) { ZPlanetField.setText("Sun"); ele = "Fire";}
        else if (wzod.equals("Cancer")) { ZPlanetField.setText("Moon"); ele = "Water";}
        else if (wzod.equals("Gemini")) { ZPlanetField.setText("Mercury"); ele = "Air";}
        else if (wzod.equals("Aries")) { ZPlanetField.setText("Mars"); ele = "Fire"; }
        else if (wzod.equals("Libra") || wzod.equals("Taurus")) { ZPlanetField.setText("Venus"); if (wzod.equals("Libra")){ele = "Air";} else { ele = "Earth";}  }
        else if (wzod.equals("Sagittarius")) { ZPlanetField.setText("Jupiter"); ele = "Fire";}
        else if (wzod.equals("Capricorn")) { ZPlanetField.setText("Saturn"); ele = "Earth";}
        else if (wzod.equals("Aquarius")) {ZPlanetField.setText("Saturn or Uranus"); ele = "Air";}
        else if (wzod.equals("Pisces")) {ZPlanetField.setText("Jupiter or Neptune"); ele = "Water";}
        else if (wzod.equals("Scorpio")) {ZPlanetField.setText("Mars or Pluto"); ele = "Water";}
        else if (wzod.equals("Virgo")) {ZPlanetField.setText("Mercury or Ceres"); ele = "Earth";}
        
        
       String czod = ChineseZodiacField.getText();
        biday = ZYearField.getSelectedItem().toString() + biday; bday = Integer.parseInt(biday);
        if ((bday<=20110203)) { czod = "Tiger"; }
        else if ((bday>20110203)&&(bday<=20120122)) {czod = "Rabbit"; }
        else if ((bday>20120122)&&(bday<=20130209)) {czod = "Dragon"; }
        else if ((bday>20130209)&&(bday<=20140130)) {czod = "Snake"; }
        else if ((bday>20140130)&&(bday<=20150218)) {czod = "Horse"; }
        else if ((bday>20150218)&&(bday<=20160207)) {czod = "Goat"; }
        else if ((bday>20160207)&&(bday<=20170127)) {czod = "Monkey"; }
        else if ((bday>20170127)&&(bday<=20180215)) {czod = "Rooster"; }
        else if ((bday>20180215)&&(bday<=20190204)) {czod = "Dog"; }
        else if ((bday>20190204)&&(bday<=20200124)) {czod = "Pig"; }
        else if ((bday>20200124)&&(bday<=20210211)) {czod = "Rat"; }
        else if ((bday>20210211)&&(bday<=20220131)) {czod = "Ox"; }
        else if ((bday>20220131)&&(bday<=20230121)) {czod = "Tiger"; }
        else if ((bday>20230121)&&(bday<=20240209)) {czod = "Rabbit"; }
        else {czod = "Dragon"; }
        
        
       ChineseZodiacField.setText(czod);
        if (czod.equals("Rat")) { ele += " | Water"; }
        else if (czod.equals("Ox")) { ele += " | Earth"; }
        else if (czod.equals("Tiger")) { ele += " | Wood"; }
        else if (czod.equals("Rabbit")) { ele += " | Wood"; }
        else if (czod.equals("Dragon")) { ele += " | Earth"; }
        else if (czod.equals("Snake")) { ele += " | Fire"; }
        else if (czod.equals("Horse")) { ele += " | Fire"; }
        else if (czod.equals("Goat")) { ele += " | Earth"; }
        else if (czod.equals("Monkey")) { ele += " | Metal"; }
        else if (czod.equals("Rooster")) { ele += " | Metal"; }
        else if (czod.equals("Dog")) { ele += " | Earth"; }
        else if (czod.equals("Pig")) { ele += " | Water"; }
        
        ZElementField.setText(ele);
    }//GEN-LAST:event_ZCalcButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    public static String genThing(String[] mats) {
        int num = (int)(Math.random()*mats.length);
        return mats[num];
        }
    
    
    public static String genAlign(){
            String[] a = {"Neutral","Chaotic","Lawful"};
            String[] b = {"Good","Neutral","Evil"};
            int num = (int)(Math.random()*a.length);
            String ans = a[num]+" ";
            num = (int)(Math.random()*b.length);
            ans += b[num];
            return ans;
        }
    
    public static String genName() {
  String[] prefix = {"anti","auto","de","dis","down","extra","hyper","il","im","in","ir","inter","mega","mid","mis","non","over","out","post","pre","pro","re","semi","sub","sub","super","tele","trans","ultra","un","under","up"};
  String[] firCon = {"t", "n", "s", "r", "d", "f", "c", "b", "z"};
  String[] secCon = {"r", "h", "s","v"};
  String[] firVow = {"e", "a", "i", "o", "oo", "u"};
  String[] thiCon = {"t", "v", "w", "x", "ck", "g", "p", "ch", "sh","ph","rr",};
  String[] secVow = {"e", "i", "o","a","u"}; 
  String[] fouCon = {"r", "s", "y","de","x","ra","le",};
  String[] suffix = {"iode","able","ac","acity","ocity","ade","age","aholic","oholic","al","algia","an","ian","ance","ant","ar","ard","arian","arium","orium","ary","ation","ate","ative","cide","cracy","crat","cule","cy","cycle","dom","dox","ed","ee","ectomy","eer","emia","en","ence","ency","ent","er","ern","escence","ese","esque","ess","est","etic","ette","ful","fy","gam","gamy","gon","gonic","hood","ial","ian","iasis","iatric","ible","ic","ical","ile","ily","ine","ing","ion","ious","ish","ism","ist","ite","itis","ity","ive","ization","ize","less","let","like","ling","loger","logist","log","ly","ment","ness","oid","ology","oma","onym","opia","opsy","or","ory","osis","ostomy","otomy","ous","path","pathy","phile","phobia","phone","phyte","plegia","plegic","pnea","scopy","scope","scribe","script","sect","ship","sion","some","sophy","sophic","th","tion","tome","tomy","tude","trophy","tude","ty","ular","uous","ure","ward","ware","wise"};
  int numnum = (int)(Math.random() * 100000);  
  String result = " ";         
        //start with the prefix
        if(Math.random() < .5) {
            result += prefix[(int)(Math.random() * prefix.length)];
        }
        
        //then the first consonant
        if(Math.random() < .7) {
            result += firCon[(int)(Math.random() * firCon.length)];
        }
        
        //then the possible second consonant
        if(Math.random() < .4) {
            result += secCon[(int)(Math.random() * secCon.length)];
        }
        
        //then the first vowel
        if(Math.random() < .9) {
            result += firVow[(int)(Math.random() * firVow.length)];
        }
        
        //then the third consonant
        if(Math.random() < .8) {
            result += thiCon[(int)(Math.random() * thiCon.length)];
        }
        
        //then the second vowel
        if(Math.random() < .6) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the fourth consonant
        if(Math.random() < .5) {
            result += fouCon[(int)(Math.random() * fouCon.length)];
        }
        
        //possibly another vowel?
        if(Math.random() < .5) {
            result += secVow[(int)(Math.random() * secVow.length)];
        }
        
        //then the suffix
        if (Math.random() < .5) {
            result += suffix[(int)(Math.random() * suffix.length)];
        }
        
        //if it's short, then maybe repeat it. (Seg -> Segseg)
        if (Math.random() < .7 && (result.length() < 6)) {
        result += result.substring(1,result.length());
        }
        
        //lastly, capitalize the first letter.
        String temp1 = result.substring(1,2);
        String temp2 = result.substring(2,result.length());
        temp1 = temp1.toUpperCase();
        result = temp1 + temp2;
        
        //if it's too long, delete it. 
        if (result.length() > 9) {
             result = result.substring(0,8);
        }  
        return result;     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1Field;
    private javax.swing.JTextField A2Field;
    private javax.swing.JTextField A3Field;
    private javax.swing.JTextField A4Field;
    private javax.swing.JTextField AccentField;
    private javax.swing.JTextField AgeField;
    private javax.swing.JTextField AllField;
    private javax.swing.JTextField AllGField;
    private javax.swing.JTextField AvatarField;
    private javax.swing.JTextField BluField;
    private javax.swing.JTextField ChChField;
    private javax.swing.JTextField ChCoField;
    private javax.swing.JTextField ChineseZodiacField;
    private javax.swing.JTextField DDField;
    private javax.swing.JTextField DIDIMGField;
    private javax.swing.JTextField DIDSkinField;
    private javax.swing.JButton DragonImagesGenerateButton;
    private javax.swing.JTextField EAltField;
    private javax.swing.JTextField EGenField;
    private javax.swing.JTextField ERomField;
    private javax.swing.JTextField ESexField;
    private javax.swing.JRadioButton EnabledField1;
    private javax.swing.JRadioButton EnabledField10;
    private javax.swing.JRadioButton EnabledField11;
    private javax.swing.JRadioButton EnabledField12;
    private javax.swing.JRadioButton EnabledField13;
    private javax.swing.JRadioButton EnabledField2;
    private javax.swing.JRadioButton EnabledField3;
    private javax.swing.JRadioButton EnabledField5;
    private javax.swing.JRadioButton EnabledField6;
    private javax.swing.JRadioButton EnabledField7;
    private javax.swing.JRadioButton EnabledField8;
    private javax.swing.JRadioButton EnabledField9;
    private javax.swing.JTextField EnneaField;
    private javax.swing.JRadioButton ExactField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FRColorField;
    private javax.swing.JTextField FRFamsField;
    private javax.swing.JTextField FearField;
    private javax.swing.JTextField FlightField;
    private javax.swing.JTextField GreField;
    private javax.swing.JTextField HogwartsField;
    private javax.swing.JTextField IMGField;
    private javax.swing.JTextArea IMGURLOutputField;
    private javax.swing.JButton IMGnURLGenerateButton;
    private javax.swing.JTextField JobField;
    private javax.swing.JTextField L1Field;
    private javax.swing.JTextField L2Field;
    private javax.swing.JTextField L3Field;
    private javax.swing.JTextField L4Field;
    private javax.swing.JTextField LangField;
    private javax.swing.JRadioButton LinkButton;
    private javax.swing.JTextField MBTIField;
    private javax.swing.JButton MadeByButton;
    private javax.swing.JTextField MiniField;
    private javax.swing.JTextField NPC1Field;
    private javax.swing.JTextField NPC2Field;
    private javax.swing.JTextField NPC3Field;
    private javax.swing.JTextField NPC4Field;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NormalField;
    private javax.swing.JTextField OAltField;
    private javax.swing.JTextField OGenField;
    private javax.swing.JTextField ORomField;
    private javax.swing.JTextField OSexField;
    private javax.swing.JButton OpenSkinPreviewButton;
    private javax.swing.JTextField OraField;
    private javax.swing.JTextArea PP1Field;
    private javax.swing.JTextArea PP2Field;
    private javax.swing.JTextField PassField;
    private javax.swing.JTextField PetField;
    private javax.swing.JTextField PetField1;
    private javax.swing.JTextField PinField;
    private javax.swing.JTextField PreviewField;
    private javax.swing.JTextField PreviewWIMGField;
    private javax.swing.JTextField PrigField;
    private javax.swing.JTextField PurField;
    private javax.swing.JButton RPGGenerateButton;
    private javax.swing.JTextArea RPGOutputField;
    private javax.swing.JButton RPGRandomizeButton;
    private javax.swing.JButton RandomButton;
    private javax.swing.JTextField RedField;
    private javax.swing.JTextField RelatField;
    private javax.swing.JTextField SecgField;
    private javax.swing.JTextField SkinNumberField;
    private javax.swing.JButton SkinPreviewButton;
    private javax.swing.JTextField SolarField;
    private javax.swing.JSlider SpinnerField1;
    private javax.swing.JSlider SpinnerField10;
    private javax.swing.JSlider SpinnerField11;
    private javax.swing.JSlider SpinnerField12;
    private javax.swing.JSlider SpinnerField13;
    private javax.swing.JSlider SpinnerField2;
    private javax.swing.JSlider SpinnerField3;
    private javax.swing.JSlider SpinnerField5;
    private javax.swing.JSlider SpinnerField6;
    private javax.swing.JSlider SpinnerField7;
    private javax.swing.JSlider SpinnerField8;
    private javax.swing.JSlider SpinnerField9;
    private javax.swing.JTextField StatusField;
    private javax.swing.JTextField TarotField;
    private javax.swing.JTextField TertgField;
    private javax.swing.JTextField TitleField1;
    private javax.swing.JTextField TitleField10;
    private javax.swing.JTextField TitleField11;
    private javax.swing.JTextField TitleField12;
    private javax.swing.JTextField TitleField13;
    private javax.swing.JTextField TitleField2;
    private javax.swing.JTextField TitleField3;
    private javax.swing.JTextField TitleField5;
    private javax.swing.JTextField TitleField6;
    private javax.swing.JTextField TitleField7;
    private javax.swing.JTextField TitleField8;
    private javax.swing.JTextField TitleField9;
    private javax.swing.JTextField TotalSkillField;
    private javax.swing.JTextField URLField;
    private javax.swing.JTextField UchChField;
    private javax.swing.JTextField UchCoField;
    private javax.swing.JTextField VAdjField;
    private javax.swing.JTextField ViceField;
    private javax.swing.JTextField VirtueField;
    private javax.swing.JTextField WesternZodiacField;
    private javax.swing.JTextField YelField;
    private javax.swing.JButton ZCalcButton;
    private javax.swing.JTextField ZDayField;
    private javax.swing.JTextField ZElementField;
    private javax.swing.JComboBox<String> ZMonthField;
    private javax.swing.JTextField ZPlanetField;
    private javax.swing.JComboBox<String> ZYearField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
