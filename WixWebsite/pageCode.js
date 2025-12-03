import { parseScry, getRarityPercent, colorRangeToString } from 'public/genedb.js'
import wixLocation from 'wix-location';

var b = ["▏", "▎", "▍", "█"];
var crs = $w('#ddwingdings');

$w.onReady(function () {
    console.log("Loading page...")
    $w('#ddcolorrangefont').options[0].label = $w('#infont').value
    $w('#ddcolorrangefont').options[0].value = $w('#infont').value
    $w('#ddwingdings').collapse();
    $w('#dd2').collapse();
    $w('#dd3').collapse();
    $w('#incolorrangesymbolnorm').collapse();
    $w('#ddwebdings').expand();
    printURL()
    if (wixLocation.url.includes('?data=')){
        readURL(wixLocation.url);
    }
    console.log("Page loaded.")
});
var motherInp = $w('#input1');
var fatherInp = $w('#input6');
var motherDid = $w('#input2');
var fatherDid = $w('#input5');
var motherNam = $w('#input3');
var fatherNam = $w('#input4');

function makeImg(DID) {
    // 132765/13276414
    var sdid = DID.toString().substring(0, DID.length - 2);
    return (parseInt(sdid, 10) + 1) + "/" + DID;
}

function ifthenelse(statement, thenX, elseY = "") {
    if (statement) {
        return thenX;
    } else {
        return elseY;
    }
}
export function button1_click(event) {
    console.log("button1_click")
    if($w('#input1').value == ""){
        return;
    }
    if($w('#input6').value == ""){
        return;
    }

    $w('#image4').show()
    $w('#button5').hide()
    $w('#button6').collapse();
    if ($w('#input3').value === "") $w('#input3').value = "Left"
    if ($w('#input4').value === "") $w('#input4').value = "Right"

    var sig = "[right][size=1][color=grey][i]Made with [url=https://flightrising.com/main.php?p=lair&tab=userpage&id=160158]VM[/url]'s [url=https://volatilematter.wixsite.com/vm-generators/breeding-card-generator]breeding card tool[/url].[/i][/color][/size][/right]"
    sig = ifthenelse($w('#swsignature').checked, sig);

    var did1 = motherDid.value;
    var did2 = fatherDid.value;
    var dragonHead1 = "[url=https://www1.flightrising.com/dragon/" + did1 + "][img]https://www1.flightrising.com/rendern/portraits/" + makeImg(did1) + "p.png[/img][/url]";
    var dragonHead2 = "[url=https://www1.flightrising.com/dragon/" + did2 + "][img]https://www1.flightrising.com/rendern/portraits/" + makeImg(did2) + "p.png[/img][/url]";
    if ($w('#raddragonimage').selectedIndex == 1) {
        dragonHead1 = "[url=https://www1.flightrising.com/dragon/" + did1 + "][img]https://www1.flightrising.com/rendern/avatars/" + makeImg(did1) + ".png[/img][/url]";
        dragonHead2 = "[url=https://www1.flightrising.com/dragon/" + did2 + "][img]https://www1.flightrising.com/rendern/avatars/" + makeImg(did2) + ".png[/img][/url]";
    }

    var mom = parseScry(motherInp.value)
    console.log(mom)
    var dad = parseScry(fatherInp.value)
    console.log(dad)

    $w('#button6').link = "http://fr.fintastic.net/?id=" +
        mom.primary.color.order + "," + dad.primary.color.order + "," +
        mom.secondary.color.order + "," + dad.secondary.color.order + "," +
        mom.tertiary.color.order + "," + dad.tertiary.color.order +
        ",1,1," + motherNam.value + "," + fatherNam.value;
    $w('#button6').expand();

    var f = "[font=" + $w('#infont').value + "][size=" + $w('#infontsize').value + "]";
    var f2 = "[/size][/font]"
    var pc = "" + colorRangeToString(mom.primary.color, dad.primary.color, crs.value, $w('#ddcolorrangefont').value, $w('#incolorsperline').value);
    var sc = "" + colorRangeToString(mom.secondary.color, dad.secondary.color, crs.value, $w('#ddcolorrangefont').value, $w('#incolorsperline').value);
    var tc = "" + colorRangeToString(mom.tertiary.color, dad.tertiary.color, crs.value, $w('#ddcolorrangefont').value, $w('#incolorsperline').value);
    var mid = ifthenelse($w('#swidnum').checked, f + "[color=grey][i]#" + motherDid.value + "[/i][/color]" + f2);
    var fid = ifthenelse($w('#swidnum').checked, f + "[color=grey][i]#" + fatherDid.value + "[/i][/color]" + f2);
    var l = ifthenelse($w('#swtopbotlines').checked, "------");
    var spa = $w('#swforumwidth').checked;
    var br2 = f + mom.breed.name + " " +
        ifthenelse(mom.breed.name != dad.breed.name,
            ifthenelse($w('#swpercent').checked, getRarityPercent(mom.breed, dad.breed) + "%") +
            " | " + dad.breed.name + " " +
            ifthenelse($w('#swpercent').checked, getRarityPercent(dad.breed, mom.breed) + "%"),
            ifthenelse($w('#swpercent').checked, "100%")) +
        f2;

    var pg = f + mom.primary.gene.name + " " +
        ifthenelse(mom.primary.gene.name != dad.primary.gene.name,
            ifthenelse($w('#swpercent').checked, getRarityPercent(mom.primary.gene, dad.primary.gene) + "%") +
            " | " + dad.primary.gene.name + " " +
            ifthenelse($w('#swpercent').checked, getRarityPercent(dad.primary.gene, mom.primary.gene) + "%"),
            ifthenelse($w('#swpercent').checked, "100%")) +
        f2;
    var sg = f + mom.secondary.gene.name + " " +
        ifthenelse(mom.secondary.gene.name != dad.secondary.gene.name,
            ifthenelse($w('#swpercent').checked, getRarityPercent(mom.secondary.gene, dad.secondary.gene) + "%") +
            " | " + dad.secondary.gene.name + " " +
            ifthenelse($w('#swpercent').checked, getRarityPercent(dad.secondary.gene, mom.secondary.gene) + "%"),
            ifthenelse($w('#swpercent').checked, "100%")) +
        f2;
    var tg = f + mom.tertiary.gene.name + " " +
        ifthenelse(mom.tertiary.gene.name != dad.tertiary.gene.name,
            ifthenelse($w('#swpercent').checked, getRarityPercent(mom.tertiary.gene, dad.tertiary.gene) + "%") +
            " | " + dad.tertiary.gene.name + " " +
            ifthenelse($w('#swpercent').checked, getRarityPercent(dad.tertiary.gene, mom.tertiary.gene) + "%"),
            ifthenelse($w('#swpercent').checked, "100%")) +
        f2;

    //TEXTBOX 1
    $w('#textBox1').value = l + "\n[columns][center]-\n" + dragonHead1 + "\n\n-[nextcol]" +
        f + "[b]" + motherNam.value + "[/b]" + f2 +
        "\n" + mid + " [color=transparent]xxxxxxxxxxxxxxxxxxxxxxxx[/color]\n" +
        "[color=transparent].\n.[/color]\n" +
        "[right]" + pc + "\n" + sc + "\n" + tc + "\n" +
        "[/right][nextcol][right][size=2]" + f + "[b]" + fatherNam.value + "[/b]" + f2 + "\n" +
        ifthenelse(spa, " [color=transparent]xxxxxxxxxxxxxxxxxxxxxxx[/color]") + " " + fid + "\n" +
        "[left]" + br2 + "\n" + pg + "\n" + sg + "\n" + tg +
        "[/size][nextcol][center]-\n" + dragonHead2 + "\n" + "-[/columns]\n" + l + sig;

    //TEXTBOX 2
    $w('#textBox2').value = l +
        "[columns][center]" + f + "[b]" + motherNam.value + "[/b]" + f2 + "\n" + mid + "\n" +
        dragonHead1 + "[nextcol][center]" + br2 + "\n" +
        pg + "\n" + pc + "\n" +
        sg + "\n" + sc + "\n" +
        tg + "\n" + tc + "\n" +
        ifthenelse(spa, "[color=transparent]xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx[/color]") +
        "[nextcol][center]" + f + "[b]" + fatherNam.value + "[/b]" + f2 + "\n" + fid + "\n" +
        dragonHead2 + "[/columns]" + l + sig;

    //TEXTBOX 3
    $w('#textBox3').value = l + "[center]" + f +
        "[url=https://www1.flightrising.com/dragon/" + motherDid.value + "][b]" + motherNam.value + "[/b][/url]" +
        " x [url=https://www1.flightrising.com/dragon/" + fatherDid.value + "][b]" + fatherNam.value + "[/b][/url]\n" + f2 +
        mid + " x " + fid + "\n" + br2 + "\n" +
        pg + "\n" + pc + "\n" +
        sg + "\n" + sc + "\n" +
        tg + "\n" + tc + "\n" +
        "\n\n" + l + sig

    //Generate the URL
    createURL()

    $w('#image4').hide()
    $w('#button5').show()
}


function printURL() {
    // Get the current URL
    const currentUrl = wixLocation.url;

    // Parse the URL to extract information
    const urlParts = currentUrl.split('/');

    // Extract the site domain and page name
    const siteDomain = urlParts[2];
    const pageName = urlParts[3];

    // Print the information to the console
    console.log("Raw URL:", currentUrl);
    console.log("Site Domain:", siteDomain);
    console.log("Current Page:", pageName);
}

function createURL() {
    const currentUrl = wixLocation.url;
    const urlParts = currentUrl.split('/');
    const domain = urlParts[2];
    const pageName = urlParts[3];

    const encodedData = `ID1=${$w('#input2').value.replace(/\s+/g, '')}
&ID2=${$w('#input5').value.replace(/\s+/g, '')}
&Name1=${$w('#input3').value.replace(/\s+/g, '')}
&Name2=${$w('#input4').value.replace(/\s+/g, '')}
&Link1=${$w('#input1').value.replace(/\s+/g, '')}
&Link2=${$w('#input6').value.replace(/\s+/g, '')}`;

    //$w('#input7').value = encodeURIComponent(`${domain}/${pageName}?data=${encodedData}`);
    $w('#input7').value = (`${domain}/${pageName}/breeding-card-generator/?data=${encodedData}`);
    console.log($w('#input7').value)
    return $w('#input7').value;
}

function readURL(encodedURL) {
    console.log(encodedURL)
    // Extract the encoded data from the URL
    const encodedData = encodedURL.split('?data=')[1];
    console.log(encodedData)

    // Decode the URL-encoded data
    const decodedData = decodeURIComponent(encodedData);
    console.log(decodedData)

    // Split the decoded data into key-value pairs
    const pairs = decodedData.split('&');
    console.log(pairs)

    // Create an object to store the decoded values
    const decodedValues = {};

    // Iterate over the pairs and populate the object
    pairs.forEach(pair => {
        const [key, value] = pair.split('=');
        decodedValues[key] = value;
    });

    console.log(decodedValues)

    // Populate the input fields
  $w('#input1').value = decodedValues.Link1;
  $w('#input2').value = decodedValues.ID1;
  $w('#input3').value = decodedValues.Name1;
  $w('#input4').value = decodedValues.Name2;
  $w('#input5').value = decodedValues.ID2;
  $w('#input6').value = decodedValues.Link2;

    return decodedValues;
}

export function button7_click(event) {
    // This function was added from the Properties & Events panel. To learn more, visit http://wix.to/UcBnC-4
    // Add your code for this event here: 
    console.log("clickbut7");
    motherInp.value = "https://www1.flightrising.com/dgen/preview/dragon?age=1&body=59&bodygene=68&breed=19&element=2&eyetype=1&gender=0&tert=59&tertgene=63&winggene=66&wings=161&auth=01f924f27b48716486fd0a4d00a8bbf5b81f5dd8&dummyext=prev.png"
    //motherInp.value = "https://www1.flightrising.com/dgen/preview/dragon?age=1&body=2&bodygene=82&breed=15&element=6&eyetype=15&gender=1&tert=2&tertgene=10&winggene=82&wings=2&auth=cac2deaa85abaaf5b36868bc4ffdd94ca0c73611&dummyext=prev.png"
    motherDid.value = "90486920"
    motherNam.value = "Default 1"
    fatherInp.value = "https://www1.flightrising.com/dgen/preview/dragon?age=1&body=127&bodygene=68&breed=19&element=7&eyetype=2&gender=1&tert=117&tertgene=78&winggene=60&wings=14&auth=59e7c31f911217373f7b321e235b6aa08a18393c&dummyext=prev.png"
    //fatherInp.value = "https://www1.flightrising.com/dgen/preview/dragon?age=1&body=90&bodygene=82&breed=15&element=6&eyetype=15&gender=0&tert=142&tertgene=10&winggene=82&wings=170&auth=625f8f417f2b7bae2a8b00fff17d517302818e67&dummyext=prev.png"
    fatherDid.value = "88352704"
    fatherNam.value = "Default 2"
}

export function ddcolorrangefont_change(event) {
    // This function was added from the Properties & Events panel. To learn more, visit http://wix.to/UcBnC-4
    // Add your code for this event here: 
    console.log($w('#ddcolorrangefont').value)
    var s = $w('#ddcolorrangefont').value;
    if (s == "Wingdings") {
        $w('#ddwebdings').collapse();
        $w('#dd2').collapse();
        $w('#dd3').collapse();
        $w('#incolorrangesymbolnorm').collapse();

        $w('#ddwingdings').expand();
        crs = $w('#ddwingdings');
    } else if (s == "Webdings") {
        $w('#ddwingdings').collapse();
        $w('#dd2').collapse();
        $w('#dd3').collapse();
        $w('#incolorrangesymbolnorm').collapse();
        crs = $w('#ddwebdings');
    } else if (s == "Wingdings 2") {
        $w('#ddwingdings').collapse();
        $w('#ddwebdings').collapse();
        $w('#dd3').collapse();
        $w('#incolorrangesymbolnorm').collapse();
        crs = $w('#dd2');
    } else if (s == "Wingdings 3") {
        $w('#ddwingdings').collapse();
        $w('#ddwebdings').collapse();
        $w('#dd2').collapse();
        $w('#incolorrangesymbolnorm').collapse();
        crs = $w('#dd3');
    } else {
        $w('#ddwingdings').collapse();
        $w('#ddwebdings').collapse();
        $w('#dd2').collapse();
        $w('#dd3').collapse();
        crs = $w('#incolorrangesymbolnorm');
    }
    console.log(crs);
    crs.expand();
}

/**
*	Adds an event handler that runs when an input element's value
 is changed.
	[Read more](https://www.wix.com/corvid/reference/$w.ValueMixin.html#onChange)
*	 @param {$w.Event} event
*/
export function infont_change(event) {
    // This function was added from the Properties & Events panel. To learn more, visit http://wix.to/UcBnC-4
    // Add your code for this event here: 
    $w('#ddcolorrangefont').options[0].label = $w('#infont').value
    $w('#ddcolorrangefont').options[0].value = $w('#infont').value
}

$w('#input8').onDblClick((event) => {
    readURL($w('#input8').value)
})
