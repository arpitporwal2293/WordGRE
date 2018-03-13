import java.util.HashMap;
import java.util.Map;

public class Words {

	public static Map<String,String> uploadMapData(){
		Map<String,String> wordMap = new HashMap<>();
		
		/*//1th set
		wordMap.put("swathe", "a broad strip or area of something");
		wordMap.put("suburbia", "the suburbs");
		wordMap.put("domicile", "treat a specified country as a permanent home");
		wordMap.put("veritable", "give emphasis");
		wordMap.put("bonanza", "a situation which creates sudden increase in wealth");
		wordMap.put("necropolis", "a cementery, large one belonging to an ancient city");
		wordMap.put("defection", "the desertion of one's country in favour of the other one");
		wordMap.put("cementery", "a graveyard especially not in the church yard");
		wordMap.put("haven", "a safe place to refuge");
		wordMap.put("tantelize", "spur to action;tease someone over a thing that is unobtainable");
		wordMap.put("ephemeral", "lasting a very sort time");
		wordMap.put("posterity", "all future generations of people;all descendants");
		wordMap.put("peripheral", "situated on the edge");
		wordMap.put("conterminous", "having the same extent in space and time");
		wordMap.put("messianic", "passionate#fervent");
		wordMap.put("fervent", "passionate#messianic");
		wordMap.put("gaggle", "a disorderly group of people");
		wordMap.put("hush", "to make silent");
		wordMap.put("reverent", "show solemn respect");
		wordMap.put("alacrity", "eager to do something#solicitous");
		wordMap.put("prosaic", "dull & lacking imagination");
		wordMap.put("veracity", "truthful");
		wordMap.put("voracity", "full of hunger");
		wordMap.put("paucity", "lack of something");
		wordMap.put("maintain", "keep stable");
		wordMap.put("contrite", "remorseful");
		wordMap.put("laconic", "a person of few words");
		
		//2nd set
		wordMap.put("pugnacious", "aggressively argue about everything");
		wordMap.put("disparate", "two things that are different from each other");
		
		wordMap.put("egregious", "standing out in a bad way#infamous#notoriety");
		
		wordMap.put("innocuous", "harmless & don't produce any ill-effects");
		wordMap.put("candid", "straight forward and honest look at something");
		wordMap.put("erratic", "sudden and unpredictable");
		wordMap.put("bleak", "very depressing take on life");
		wordMap.put("profuse", "pour out in abundance");
		wordMap.put("extant", "opposite of extinct");
		
		wordMap.put("contentious", "likes to argue#contend");
		wordMap.put("enervate", "to sap the energy from");
		
		wordMap.put("auspicious", "favourable");
		wordMap.put("apocryphal", "a story of doubtful origin but widely circulated as being true");
		wordMap.put("expatiate", "speak or write in detail about");
		wordMap.put("complaint", "meeting in accordance with the rules and standards");
		wordMap.put("inure", "accustom someone to something unpleasant");
		
		wordMap.put("parlous", "uncertain;full of danger#precarious");
		
		wordMap.put("edify", "morally uplift");
		wordMap.put("mollify", "appease the anger of someone");
		wordMap.put("solicitous", "eager to do something#alacrity");
		wordMap.put("epithets", "adjective or phrase regarding the characteristic of a person");
		wordMap.put("sprawling", "sit,lie,fall with open arms;spread out over a large area");
		wordMap.put("picaresque", "relating to an episodic hero");
		wordMap.put("heterodox", "not conforming with the accepted or orthodox standards");
		wordMap.put("impotence", "unable to do anything");
		wordMap.put("usurp", "take(a position of power) illigally, or by force");
		
		//3rd set
		wordMap.put("tenuous", "very weak#slight");
		wordMap.put("pristine", "in the original condition,unspoilt");
		wordMap.put("obtuse", "annoyingly insensitive,slow to understand");
		wordMap.put("desolate", "make a place appear bleakly empty,unhappy");
		wordMap.put("moil", "to work hard");
		wordMap.put("belligerent", "hostile & aggressive");
		wordMap.put("corporeal", "relating to the body as opposed to the spirit");
		wordMap.put("laud", "praise highly");
		wordMap.put("procrastinate", "to put of doing something");
		wordMap.put("acquit", "free from criminal charges#vindicate#absolve#exonerate");
		wordMap.put("distraught", "very worried,upset");
		wordMap.put("debiliate", "make very weak,hinder,delay");
		wordMap.put("acute", "shrewd");
		wordMap.put("eschew", "avoid#abstain");
		wordMap.put("poignant", "emotionally touching;sadness or regret;bad smell");
		wordMap.put("trenchant", "vigorous or incisive in expression or style");
		wordMap.put("iconoclast", "a person who attacks cherished beliefs");
		wordMap.put("inveterate", "habitual;having a particular habit(long established);unlikely to change");
		wordMap.put("meretricious", "apparently attractive but not having any real value");
		wordMap.put("bicker", "argue about petty & trivial matters#squabble");
		wordMap.put("equivocate", "to speak in ambiguous way");
		wordMap.put("unequivocal", "state in such a way that there is no room for doubt");
		wordMap.put("ambivalent", "conflicting feelings towards something");
		wordMap.put("sedulous", "anything but idle;caring");
		
		//4th set
		wordMap.put("blinkered", "limited outlook or understanding");
		wordMap.put("unchecked", "something undesirable grown out of control");
		wordMap.put("checkered", "marked with disreputable happenings");
		wordMap.put("raft", "a large number of something");
		wordMap.put("involved", "complicated");
		wordMap.put("retiring", "shy;retract from a company");
		wordMap.put("expansive", "socialable;wide-ranging");
		wordMap.put("moment", "significant & important");
		wordMap.put("base", "lower-class;without any moral principles");
		wordMap.put("imbibe", "intake of knowledge or information");
		wordMap.put("inundate", "to flood;overwhelmed by to many things#deluge");
		wordMap.put("scintillating", "brilliant & lively");
		wordMap.put("benighted", "state of ignorance");
		wordMap.put("galvanize", "excite to action or spur on");
		wordMap.put("hedge", "to limit,avoid making a direct statement");
		wordMap.put("flush", "to turn red, to be in abundance,drive out of hiding");
		wordMap.put("fell", "evil");
		wordMap.put("arch", "deliberately teasing");
		wordMap.put("tender", "to offer it up");
		wordMap.put("intimate", "sugest something subtly");
		wordMap.put("wanting", "lacking");
		wordMap.put("becoming", "appropriate");
		wordMap.put("start", "to dart in a particular direction");
		wordMap.put("fleece", "to deceive");
		wordMap.put("telling", "revealing of another factor");
		wordMap.put("jingoism", "arouse patriotic emotions");
		wordMap.put("cupidity", "extreme greed for material wealth");
		wordMap.put("restive", "restless;unable to remain silent due to boredom");
		wordMap.put("augury", "an event telling what important events are to come");
		
		//5th set
		wordMap.put("polarity", "the state of having two opposite tendencies");
		wordMap.put("peddles", "try to sell something from going place to place");
		wordMap.put("epiphany", "a divine manifestation");
		wordMap.put("anodyne", "capable of relieving pain");
		wordMap.put("trope", "language usedd in a literal sense");
		wordMap.put("adroit", "clever or skilful");
		wordMap.put("subsume", "a part of,contain,include");
		wordMap.put("varnish", "to polish over");
		wordMap.put("canard", "a deliberately misleading fabrication");
		wordMap.put("enmity", "hostility");
		wordMap.put("meandor", "wander about aimlessly");
		wordMap.put("retrospective", "talking about the events of the past");
		wordMap.put("retroactive", "taking effect from a past date");
		wordMap.put("bucolic", "relating to countryside");
		wordMap.put("palpable", "feelings so intense as to seem tangible");
		wordMap.put("coax", "persuade someone to do something");
		wordMap.put("insinuate", "introduce oneself in a subtle manner");
		wordMap.put("grabbled", "make false by mutation of a story#embellish");
		wordMap.put("tempest", "full of emotion");
		wordMap.put("ignominy", "publically disgrace");
		wordMap.put("pithy", "full of meaning;terse & vigoursly expressive");
		wordMap.put("aphorism", "a pithy observation that contains the general truth");
		wordMap.put("terse", "abrupt");
		wordMap.put("shun", "to avoid;ignore");
		wordMap.put("labyrinth", "maze(complex)");
		wordMap.put("flamboyant", "tending to be attractive because of exuberance");
		wordMap.put("dissimilitude", "dissimilarity or diversity");
		wordMap.put("bouts", "short period of intense activity of a specific kind");
		
		//6th set
		wordMap.put("wax", "to increase");
		wordMap.put("check", "to limit");
		wordMap.put("qualify", "limit in respect to a statement");
		wordMap.put("miserly", "pinch every penny(bad way)");
		wordMap.put("frugal", "pinch every penny(good way)");
		wordMap.put("prevaricate", "speak in an evasive way");
		wordMap.put("variance", "cause to change");
		wordMap.put("histrionic", "overly theatrical");
		wordMap.put("demur", "show reluctance");
		wordMap.put("demure", "sky;modest");
		wordMap.put("beatufic", "one who radiates bliss");
		wordMap.put("perfunctory", "careless;bored;showing no interest");
		wordMap.put("preemptory", "bossy & domineering");
		wordMap.put("preemptively", "doing something before someone else does");
		wordMap.put("indigent", "having very little means;poor");
		wordMap.put("indigenious", "relating to an area");
		wordMap.put("indignant", "show anger over perceived injustice");
		wordMap.put("errant", "not following a circumscribed path;capable of being wrong");
		wordMap.put("arrant", "complete and utter(fool)");
		wordMap.put("errand", "small chore");
		wordMap.put("err!", "surprise;to make an error");
		wordMap.put("artful", "cunning;wily");
		wordMap.put("artless", "innocent;guileless");
		wordMap.put("artifice", "artful");
		wordMap.put("expurgate", "remove objectionable material(beeps in movies)#censor");
		wordMap.put("censure", "express strong disapproval of");
		wordMap.put("expunge", "remove any trace of");
		wordMap.put("ponderous", "walk around in a laboured fashion");
		wordMap.put("ponder", "to think over");
		wordMap.put("imponderable", "impossible to estimate#unfathomable");
		
		//7th set
		wordMap.put("kowtow", "obey other unquestionablly#subservient#obsequously#sycophant");
		wordMap.put("subservient", "obey other unquestionablly#subservient#obsequously#sycophant");
		wordMap.put("powwow", "informal discussion");
		wordMap.put("colloquy", "conversation");
		wordMap.put("junta", "aggressive takeover of a group");
		wordMap.put("imbroglio", "a confusing and embarrasing situation");
		wordMap.put("juggernaut", "a force that cannot be stopped");
		wordMap.put("schadenfreude", "cackling sardonically at the suffering of others");
		wordMap.put("cackling", "laughing out loud");
		wordMap.put("sardonically", "grimly mocking#cynically");
		wordMap.put("amok", "run about being frenzied");
		wordMap.put("frenzy", "widly excited");
		wordMap.put("ployglot", "know a lot of languages");
		wordMap.put("cosmoplitan", "familiar with different cultures");
		wordMap.put("aplomb", "showing confidence especially in demanding situation");
		wordMap.put("whit", "a very smart part or amount");
		wordMap.put("berate", "scold or criticize someone angrily");
		wordMap.put("embellish", "make something more attractive by adding details#grabbled");
		wordMap.put("feign", "pretend to be effect by a feeling");
		wordMap.put("bewilder", "confused;perplexed");
		wordMap.put("obsequious", "do everything to please others#servile");
		wordMap.put("servile", "willingness to serve others#obsequious");
		wordMap.put("denounce", "publically announce as evil");
		wordMap.put("churlish", "rude;surly");
		wordMap.put("inhibited", "not in good mental state");
		wordMap.put("martinet", "requiring complete obediance;a strong disciplinarian");
		wordMap.put("cantankorous", "angery;bad-tempered");
		wordMap.put("timorous", "lack of confidence");
		wordMap.put("precarious", "uncertain;full of danger not securely held in position");
		
		//8th set
		wordMap.put("staunch", "very loyal;commited");
		wordMap.put("venerated", "respect#revere");
		wordMap.put("candor", "frankness;open;honest");
		wordMap.put("monetary", "relating to money");
		wordMap.put("mendicant", "given to begging");
		wordMap.put("panacea", "capable of removing any pain");
		wordMap.put("albatross", "bird;a source of guilt");
		wordMap.put("facetious", "handling a serious solution with humour#flippant");
		wordMap.put("waffle", "speak or write in great lengths about trivial issues");
		wordMap.put("trivial", "not important");
		wordMap.put("dissemble", "conceal or disguise one's true feelings");
		wordMap.put("mince", "cut into short pieces");
		wordMap.put("overwrought", "a state of nervous excitement");
		wordMap.put("decry", "publicly denounce");
		wordMap.put("glut", "pour out in abundance");
		wordMap.put("belied", "to give a false impression");
		wordMap.put("assiduous", "showing great care or perseverance");
		wordMap.put("wholesome", "relating to good health etc");
		wordMap.put("sinecure", "one who doesnt work but gets a part of the share");
		wordMap.put("euphoria", "happy;excitement");
		wordMap.put("confound", "surprised and not according to exceptations");
		wordMap.put("elation", "happy;exhilaration");
		wordMap.put("fruition", "realization or fullfilment of a plan");
		wordMap.put("despondent", "in low spirit from loss of hope or courage");
		wordMap.put("maverick", "unorthodox;not following conventional rules etc;independent minded person");
		wordMap.put("adversary", "one's opponent in a fight,contest");
		
		//9th set
		wordMap.put("benefactor", "a person that provides support,help in form of money");
		wordMap.put("pariah", "outcast");
		wordMap.put("inculpate", "incriminate");
		wordMap.put("fudge", "adjust,manipulate");
		wordMap.put("nabob", "wealthy and influential person");
		wordMap.put("zeitgeist", "relating to the spirit of the times");
		wordMap.put("sangfroid", "calm expecially in trying situations");
		wordMap.put("parvenu", "a sudden acquire of wealth and therefore risen in class");
		wordMap.put("derogatory", "disrespectful");
		wordMap.put("flank", "to gaurd,hold down");
		wordMap.put("coy", "reluctant to give any sensitive information");
		wordMap.put("arriviste", "ruthless amibition");
		wordMap.put("ruthless", "showing no mercy or pity");
		wordMap.put("aflutter", "a state of nervous excitement");
		wordMap.put("ostentatious", "characterized by showy display");
		wordMap.put("chic", "fashionable");
		wordMap.put("melee", "a wild but confusing fight");
		wordMap.put("entrenched", "engrained,strongly held");
		wordMap.put("scornful", "ridicule");
		wordMap.put("derision", "ridicule");
		wordMap.put("contempt", "ridicule");
		wordMap.put("blithely", "in a happy or carefree manner");
		wordMap.put("snob", "a person who stay with rich people and looks down at the poor");
		wordMap.put("aravice", "greed for money");
		wordMap.put("castigate", "reprimand severly");
		wordMap.put("reprimand", "a formal expression of disapproval");
		wordMap.put("dissolution", "the action for formally ending a partnership,party etc");
		wordMap.put("emancipate", "set free from legal or political restrictions");
		
		//10th set
		wordMap.put("aesthetic", "related to the appriciation of beauty");
		wordMap.put("hackneyed", "hack,unoriginal");
		wordMap.put("trite", "repeated too often;unoriginal;obvious remark");
		wordMap.put("oracular", "hard to interpret#enigmatic");
		wordMap.put("vernacular", "related to the domestic dialect or language");
		wordMap.put("secular", "not effect by religious or spiritual matters");
		wordMap.put("disparage", "regard as being of little worth");
		wordMap.put("reclaim", "bring make;recover");
		wordMap.put("temperament", "related to the nature of a person or animal");
		wordMap.put("lassitude", "lack of energy");
		wordMap.put("mitigate", "to make better;less severe");
		wordMap.put("invigorate", "give energy to");
		wordMap.put("viscous", "a sticky or dense liquid");
		wordMap.put("paranormal", "that activities which cannnot be understood by science");
		wordMap.put("distortion", "give misleading impression");
		wordMap.put("infamous", "known in a bad way");
		wordMap.put("contingent", "dependent on;a group of people with similar attributes");
		wordMap.put("cogent", "clear;logical");
		wordMap.put("proscribed", "forbid expecially by law");
		wordMap.put("touted", "attempt to sell something directly");
		wordMap.put("admonish", "reprimand severly");
		wordMap.put("conformities", "excepting the used standards or rules");
		wordMap.put("anomalies", "something that deviates from what is standard");
		wordMap.put("congruent", "in perfect harmony");
		wordMap.put("pejorative", "reprimand severly");
		wordMap.put("daunting", "intimidating");
		wordMap.put("banal", "boring;repeated too often;obvious remark");
		wordMap.put("cosmetic", "only related to outer beauty");
		wordMap.put("surreal", "bizzare");
		wordMap.put("obfuscate", "make obscure;unclear");
		
		//11th set
		wordMap.put("callous", "showing insensitive disregards for others");
		wordMap.put("refute", "disaprove");
		wordMap.put("ameliorate", "to make better");
		wordMap.put("austere", "trait of great self-denial;severe or strict in manner");
		wordMap.put("epitomize", "give example of");
		wordMap.put("occlude", "to stop;close");
		wordMap.put("atypical", "not of a particular type");
		wordMap.put("desultary", "lack of planning");
		wordMap.put("impute", "something indesirable possessed by someone");
		wordMap.put("fastidious", "very concerned about accuracy#meticulous");
		wordMap.put("meticulous", "very concerned about accuracy#fastidious");
		wordMap.put("decorous", "good taste;polite");
		wordMap.put("digressive", "tending to depart from subject");
		wordMap.put("indefatigable", "persisting tirelessly");
		wordMap.put("scoop", "a piece of news published by a newspaper in advance its rivals");
		wordMap.put("forestall", "prevent or obstruct by taking advance action");
		wordMap.put("deprecate", "express disapproval of");
		wordMap.put("elite", "a selected group of superior");
		wordMap.put("ingenuity", "innocent;naive");
		wordMap.put("hegemony", "leadership or dominance,of a group over others");
		wordMap.put("proponent", "a person who advocates a theory");
		wordMap.put("coterier", "a small group of people with similar interest");
		wordMap.put("insidious", "proceeding subtly with a intent to cause harm#pernicious");
		wordMap.put("pernicious", "proceeding subtly with a intent to cause harm#insidious");
		wordMap.put("appease", "assuage or satisfy;pacifyor placate");
		wordMap.put("vitality", "full of energy");
		wordMap.put("mendacity", "intruthful");
		wordMap.put("remorse", "deep regret or guilt");
		wordMap.put("vigor", "physical strength & good health;full of energy");
		
		//12th set
		wordMap.put("persecution", "hostile or ill-treatment");
		wordMap.put("corroborate", "support to a theory or statement");
		wordMap.put("placate", "make less angry or hostile");
		wordMap.put("trumpets", "proclaim widely or loudly");
		wordMap.put("omit", "leave out or exclude");
		wordMap.put("articulate", "having the ability to speak fluently#eloquent");
		wordMap.put("bombastic", "high sounding but with little meaning#inflated");
		wordMap.put("gregarious", "socialable");
		wordMap.put("pompous", "self-important");
		wordMap.put("affable", "friendly");
		wordMap.put("amenable", "easily persuaded");
		wordMap.put("dearth", "lack of something");
		wordMap.put("countenance", "a persons face or facial expression");
		wordMap.put("surfiet", "an excessive amount of something");
		wordMap.put("spate", "a large no. of things coming in quick succession");
		wordMap.put("proclamation", "a public announcement dealing with an important matter");
		wordMap.put("noxious", "harmful,poisoness");
		wordMap.put("exacerbate", "make worse");
		wordMap.put("deleterious", "causing harm or damage");
		wordMap.put("evokes", "bring or recall to the conscious mind");
		wordMap.put("disenchants", "cause to be disappointed;free from illusions");
		wordMap.put("relegated", "lower in ranks");
		wordMap.put("abrogate", "repeal or do away with law");
		wordMap.put("annulled", "having no legal existance;declare invalid");
		wordMap.put("apotheosize", "idolize");
		wordMap.put("sycophant", "obsequiously#subservient");
		wordMap.put("pedant", "a person who is excessively concerned with minor details & rules;show academic learning");
		wordMap.put("eccentric", "slightly strange;not placed centrally");
		
		//13st set
		wordMap.put("opprobrium", "harsh criticism or censure; publicly disgrace");
		wordMap.put("accolade", "praise or admire(award)");
		wordMap.put("hyperbole", "exaggerated statements not to be taken literally");
		wordMap.put("inerrant", "incapable of being wrong");
		wordMap.put("centurion", "commandor of the century");
		wordMap.put("erudite", "learned;scholarship");
		wordMap.put("doctorine", "a belief taught by chruch or politicfal party or other group");
		wordMap.put("fallacy", "faulty reasoning");
		wordMap.put("magnate", "a wealthy & influential businessmen");
		wordMap.put("efficacy", "the ability to produce the intended result");
		wordMap.put("bellicose", "demonstrating aggression & willingness to fight");
		wordMap.put("chasten", "restrain;discipline;punish");
		wordMap.put("diatribe", "a forceful & bitter verbal attack against someone or something");
		
		wordMap.put("encomium", "a speech or writting that praises someone#eulogy");
		wordMap.put("eulogy", "a speech or writting that praises someone#encomium");
		
		wordMap.put("magnanimous", "generous or forgiving, to wards a rival or less powerful person");
		wordMap.put("imparious", "arrogant & domineering");
		wordMap.put("vindictive", "desire for revenge");
		wordMap.put("calumniate", "make false & defamatory statements about someone");
		
		wordMap.put("pillory", "ridicule#deride");
		wordMap.put("deride", "ridicule#pillory");
		
		wordMap.put("renege", "revoke;abandon");
		wordMap.put("dross", "rubbish;worthless");
		
		wordMap.put("dirge", "a mournful song#ament");
		wordMap.put("lament", "a mournful song#dirge");
		
		//14nd set
		wordMap.put("reconnoitre", "make a military observation of(a region)");
		wordMap.put("hoodwink", "deceive or trick");
		wordMap.put("lambaste", "criticize harshly");
		wordMap.put("vitiate", "spoil the efficacy of;destroy the loyal validity of");
		
		wordMap.put("surly", "bad-tempered & unfriendly#curmudgeon");
		wordMap.put("curmudgeon", "bad-tempered#surly");
		
		wordMap.put("exuberance", "full of energy,excitement#ebullience");
		
		wordMap.put("abstain", "restrain oneself from doing");
		wordMap.put("acquiescent", "ready to except something without protest");
		wordMap.put("concoct", "create or devise");
		wordMap.put("hindsight", "understand of a situtation or event only after it has happened");
		
		wordMap.put("brash", "self assertive in a rude,noisy way#obstentatious");
		wordMap.put("obstentatious", "tasteless#brash");
		
		wordMap.put("pauper", "a very poor person");
		wordMap.put("brusque", "abrupt in speech or manner;rude");
		wordMap.put("steadfast", "resolute;loyal");
		wordMap.put("unseemly", "not proper or appropriate");
		wordMap.put("polemic", "a strong verbal or written attack on someone");
		wordMap.put("skew", "suddenly change in direction or position;make biased");
		wordMap.put("enumerate", "mention(a no. of things) one by one");
		wordMap.put("pointed", "expressing criticism in a directed & unambiguous way");
		
		wordMap.put("abstract", "existing in thought and having no physical existence#vague");
		
		wordMap.put("cynic", "a person that believes that people are only motivated purely by self-interest rather than acting for honour");
		wordMap.put("amiable", "friendly");
		wordMap.put("protract", "prolong");
		wordMap.put("downcast", "feelng despondant");
		wordMap.put("forlorn", "pityfully sad;lonely;unlikely to succeed");
		wordMap.put("premeditate", "think out or plan beforehand");
		
		//15th set
		wordMap.put("whimscial", "acting in a capricious manner");
		wordMap.put("capricious", "given to sudden changes in mood");
		wordMap.put("quaint", "attractively unusual or old fashioned");
		wordMap.put("arbitrate", "groundless decision;reach a authoritative judgement or settlement");
		wordMap.put("myriad", "a countless or great number of people or things");
		wordMap.put("exalt", "think or speak very highly of(someone);raise to a higher rank");
		
		wordMap.put("notoriety", "being famous for something bad#infamous#egragious");
		
		wordMap.put("affront", "an action that causes offence(insult)");
		wordMap.put("endear", "cause to be loved or liked");
		wordMap.put("concede", "agree to something is true after first denying it;surrender;yield");
		wordMap.put("fortuitous", "happening by chance rather then intention");
		wordMap.put("propriety", "conformity to conventionally accepted standards");
		wordMap.put("detractors", "a person who disparages someone");
		wordMap.put("albeit", "though");
		wordMap.put("posthumous", "occuring,awarded or appearing after the death of the originator");
		wordMap.put("hapless", "unfortunate");
		wordMap.put("penned", "write or compose");
		wordMap.put("congenial", "pleased or liked as having some quality as oneself");
		wordMap.put("obscure", "known by only a few;make unclear;uncertain");
		wordMap.put("prolific", "intellectually productive");
		wordMap.put("heretic", "a person believing in or practising religious heresy;unorthodox opinion in every field");
		wordMap.put("heresy", "unorthodox");
		wordMap.put("incendiary", "tending to stir up conflict;very exciting#inflammatory");
		wordMap.put("smitten", "be strongly attracted to someone");
		wordMap.put("disenfranchise", "deprive(someone) the right to vote");
		wordMap.put("tactless", "lack of skill");
		wordMap.put("parsimonious", "very unwilling to spend money or an other resource#frugal#miserly");
		wordMap.put("garrulous", "excessively talkative,expecially on trivial matters");
		
		//16th set
		wordMap.put("tantamount", "equivalent in seriousness;virtually the same as");
		wordMap.put("dabbler", "immerse;take part in an activity in a casual way");
		wordMap.put("fledging", "a person or organization what are immature or inexperienced");
		wordMap.put("consummate", "to make complete;showing great skill & flair");
		wordMap.put("prosody", "the patterns of stress and intonation in a language");
		wordMap.put("solitary", "existing alone;single");
		wordMap.put("repudiate", "rejection of a proposal or idea;denial of truth");
		wordMap.put("caricature", "a picture in which certain characteristics are exaggerated");
		wordMap.put("profligate", "recklessly extravagent or wasteful in the use of resource#prodigal");
		wordMap.put("comprehensive", "including with all elements or aspects of something");
		wordMap.put("pragmatic", "dealing with things sensibly;practical approach");
		wordMap.put("emulate", "match or surpass a person or achievement typically by imitation");
		wordMap.put("benign", "gentle and kind;not harmful in effect");
		wordMap.put("prolixity", "containing to many words");
		wordMap.put("prescient", "have knowledge of event before it takes place");
		wordMap.put("litigate", "resort to legal action to settle a matter");
		wordMap.put("virulent", "extremely severe or harmful in its effects");
		wordMap.put("inimical", "hostile");
		wordMap.put("exacting", "making great demands on one's skill");
		wordMap.put("discern", "recognize;find out");
		wordMap.put("malfeasance", "wrongdoing");
		wordMap.put("scrupulous", "principled;careful;avoid wrong doing");
		wordMap.put("aboveboard", "legitimate;honest;open");
		wordMap.put("tarnished", "make or become less valuable or respected");
		wordMap.put("restorative", "having the ability to restore health");
		wordMap.put("soporific", "tending to induce sleep;drowsiness");
		wordMap.put("detrimental", "tending to cause harm");
		wordMap.put("genial", "friendly & cheerful");
		wordMap.put("decrepit", "worn out or ruined because of age or neglect");
		wordMap.put("contrive", "to pull off a plan or scheme,usually through skill or trickery");
		
		//17th set
		wordMap.put("carouse", "enjoy with others in a noisy way#revelry");
		wordMap.put("merriment", "gaiety and fun");
		wordMap.put("revelry", "enjoy with others in a noisy way#carouse");
		wordMap.put("wallow", "indulge in an unrestrained way");
		wordMap.put("indulgent", "allow oneself to enjoy the pleasure of");
		wordMap.put("singular", "remarkable");
		wordMap.put("languish", "lack vitality;forced to remain in an unpleasent situation");
		wordMap.put("ardent", "very enthusiastic or passionate");
		wordMap.put("conjecture", "an opinion or conclusion formed on the basis of incomplete info");
		wordMap.put("untoward", "unexcepted & inappropriate");
		wordMap.put("parochial", "narrowly restricted in scope or outlook");
		wordMap.put("prodigal", "rashly or wastefully extravagent#profligate");
		wordMap.put("venality", "susceptible to bribes or corruption");
		wordMap.put("impertinent", "being disrespectable;improperly forward or bold");
		wordMap.put("commensurate", "to be in proportion in degree & amount");
		wordMap.put("harangue", "a long pompous speech");
		wordMap.put("acrimony", "bitterness");
		wordMap.put("betray", "reveal something unintentionally");
		wordMap.put("demeanor", "outword behaviour or bearing");
		wordMap.put("meek", "quiet,gentle,submissive#timid-shy");
		wordMap.put("disdain", "unworthy of one's consideration");
		wordMap.put("afield", "at a distance");
		wordMap.put("veteran", "a person with long experience in a particular field");
		wordMap.put("dissemination", "spread(something) widely");
		wordMap.put("guan", "to gather from");
		wordMap.put("cornucopia", "abundance");
		wordMap.put("purge", "to remove usually by force");
		wordMap.put("subvert", "to go against;undermine");
		wordMap.put("intractable", "thorny;naughty");
		
		//18th set
		wordMap.put("empirical", "can be tested,measurable");
		wordMap.put("reticent", "quiet;disciplined to talk;not revealing one's thought");
		wordMap.put("loquacious", "chatty;talkative");
		wordMap.put("taciturn", "uncommunicative;withdrawn");
		wordMap.put("transient", "lasting a very short time#ephemeral");
		wordMap.put("salutary", "healthy,promoting a good effect");
		wordMap.put("shirk", "avoid or neglect");
		wordMap.put("protean", "tending or able to change frequently or easily#versatile");
		wordMap.put("bland", "showing no strong emotion#benign");
		wordMap.put("adjudicate", "make a formal judgement on a disputed matter");
		wordMap.put("delineate", "describe or portray (something) precisely;describe in detail");
		wordMap.put("sporadic", "occurring at irregular intervals or only in a few places;scattered or isolated;not constant");
		wordMap.put("inadvertently", "unintentionally");
		wordMap.put("haphazard", "great carelessness;dependant on chance;randomly");
		wordMap.put("remiss", "negligent;not performing duties");
		wordMap.put("stringent", "harsh");
		wordMap.put("doting", "take care of someone in a motherly manner");
		wordMap.put("imminent", "about to happen");
		wordMap.put("begrudge", "hold them back");
		wordMap.put("jarring", "clashing;shocking");
		wordMap.put("jubilant", "happy cause of success");
		wordMap.put("tenacious", "not giving up easily");
		wordMap.put("aspersions", "an attack on the reputation or integrity of someone or something");
		wordMap.put("serenity", "peace");
		wordMap.put("capitulation", "surrender or give up");
		wordMap.put("perusal", "work over or read something thoroughly");
		wordMap.put("ramification", "a complex or unwelcome consequence of an action or event");
		wordMap.put("despensation", "distribute or supply something;exempt in doing something");
		wordMap.put("incumbent", "necessary for (someone) as a duty or responsibility");*/
		
		
		//19th set
		wordMap.put("contort", "twist or bend out of the normal shape");
		wordMap.put("subterfuge", "trickery");
		wordMap.put("anachronistic", "belonging to a period other than that being portrayed");
		wordMap.put("monolithic", "large & unwarying");
		wordMap.put("insolvent", "run out of money;broke");
		wordMap.put("pageantry", "showy display");
		wordMap.put("exact", "precise");
		wordMap.put("insouciance", "lack of concern; indifference");
		wordMap.put("agnostic", "a person who believes that nothing is known or can be known of the existence or nature of God");
		wordMap.put("aver", "state to be the case");
		
		//new words
		//gre app common words 1
		wordMap.put("mercurial", "prone to unexpected and unpredictable changes in mood#capricious");
		wordMap.put("aberration", "a deviation from what is normal or expected");
		wordMap.put("undermine", "to weaken");
		wordMap.put("disinterested", "unbiased;neutral");
		wordMap.put("amalgam", "a mixture of multiple things");
		wordMap.put("upbraid", "to scold");
		wordMap.put("chastise", "reprimand severly");
		wordMap.put("amorphous", "shapeless");
		
		//common words 2
		wordMap.put("apathetic", "lack of interest");
		wordMap.put("didactic", "instructive");
		wordMap.put("impudent", "improperly forward or bold");
		wordMap.put("querulous", "habitually complaining");
		wordMap.put("rustic", "simple;characteristics of rural life");
		wordMap.put("vociferous", "offensively loud;vehement outcry");
		wordMap.put("chortle", "to chuckle;laugh merrily;often in a breathy way");
		wordMap.put("predilection", "a strong liking");
		wordMap.put("gainsay", "deny or contradict;speak against or oppose");
		wordMap.put("inexorable", "impossible to stop or prevent");
		wordMap.put("germane", "relevant and appropriate");
		wordMap.put("frivolous", "not serious in content or attitude or behaviour");
		wordMap.put("preclude", "keep from happening or arising;make impossible");
		wordMap.put("gall", "feeling of deep and bitter anger and ill-will;being rude");
		wordMap.put("dogmatic", "highly opinionated,not accepting that one's own belief may not be correct");
		wordMap.put("superfluous", "more than is needed, desired or required");
		wordMap.put("mawkish", "overly sentimental to the point that it is disgusting");
		wordMap.put("deferential", "showing respect");
		wordMap.put("recondite", "difficult to penetrate;incomprehensible to one of ordinary knowledge");
		wordMap.put("platitude", "a trite or obvious remark");
		wordMap.put("incisive", "having the ability to recognize or draw fine distinctions");
		wordMap.put("torpor", "lack of vigor or energy");
		wordMap.put("culminate", "reach the highest or most decisive point");
		wordMap.put("diffident", "lack of confidence");
		wordMap.put("gossamer", "characterized by unusual lightness and delicacy");
		wordMap.put("culpability", "a state of guilt");
		wordMap.put("conspicuous", "without any attempts at concealment;completely obvious");
		wordMap.put("perfidy", "deliberate betrayal;breach of trust");
		wordMap.put("cryptic", "mysterious or vague;usually intentionally");
		wordMap.put("volubility", "the quality of talking or writing easily and continuously");
		wordMap.put("audacious", "willing to be bold in social situations or to take risks");
		wordMap.put("engender", "give rise to");
		wordMap.put("dictatorial", "characteristics of absolute ruler");
		
		//common words 3
		wordMap.put("incongruous", "lacking in harmony");
		wordMap.put("circumvent", "cleverly find a way out of one's duties");
		wordMap.put("supplant", "take the place or move into the position of");
		wordMap.put("juxtapose", "place side by side for contrast");
		wordMap.put("haughty", "showing arrogance#disdain");
		wordMap.put("languid", "not inclined towards physical effort;slow and relaxed");
		wordMap.put("avaricious", "excessively greedy");
		wordMap.put("frustrate", "hinder or prevent(the effort,plan) of");
		wordMap.put("refractory", "stubbornly resistant to authority or control");
		wordMap.put("spurious", "plausible but false#specious");
		wordMap.put("elucidate", "make clearer and easier to understand");
		wordMap.put("apathy", "an absence of emotion or enthusiasm");
		wordMap.put("guileless", "free from deceit");
		wordMap.put("quotidian", "found in the ordinary course of events");
		wordMap.put("rudimentary", "being in the earliest stages of development;involing basic facts");
		wordMap.put("negligible", "insignificant");
		wordMap.put("precocious", "characteristic of early development or maturity");
		wordMap.put("panache", "distinctive and showy elegance");
		wordMap.put("eminent", "standing above others in quality or position");
		wordMap.put("eclectic", "comprised of a variety of styles");
		wordMap.put("immutable", "not able to be changed");
		wordMap.put("derive", "reason by deduction;established by deduction;come from");
		wordMap.put("treacherous", "dangerously unstable and unpredictable");
		wordMap.put("travesty", "an absurd presentation of something;a mockery");
		wordMap.put("vilify", "spread negative information about");
		wordMap.put("ascetic", "practicing self-denial(eg:gandhi)");
		wordMap.put("vehement", "extreme intensity of emotions or convictions");
		wordMap.put("itinerant", "travelling from place to place to work");
		wordMap.put("denote", "be a sign or indication of");
		
		//common words 4
		wordMap.put("acerbic", "harsh in tone");
		wordMap.put("idiosyncrasy", "a behavioral attribute that is distinctive and peculiar to an individual");
		wordMap.put("espouse", "to adopt or support an idea or cause");
		wordMap.put("petulant", "easily irritated or annoyed");
		wordMap.put("copious", "in abundant supply");
		wordMap.put("provincial", "limited prespective;not fashional or sophisticated");
		wordMap.put("largess", "extreme generosity and giving;gift");
		wordMap.put("burgeon", "grow and flourish");
		wordMap.put("implacable", "incapable of making less angry or hostile");
		wordMap.put("unscrupulous", "without principles");
		wordMap.put("admonitory", "serving to warn;expressing reproof or reproach especially as a correcting");
		wordMap.put("pundit", "someone who has been admitted to membership in a scholarly field");
		wordMap.put("decorum", "propriety in manners and conduct");
		wordMap.put("underscore", "give extra weight to(a communication)");
		wordMap.put("ignoble", "dishonorable");
		wordMap.put("intransigent", "unwilling to change one's beliefs or course of action");
		wordMap.put("abstruse", "difficult to understand;incomprehensible");
		wordMap.put("forthcoming", "at ease in talking to others;available when required or as promised");
		wordMap.put("reconcile", "make(one thing) compatible with others");
		wordMap.put("adamant", "refusing to change one's mind");
		wordMap.put("blatant", "completely obvious#conspicuous");
		wordMap.put("incorrigible", "impervious to correction by punishment");
		wordMap.put("discrete", "constituting a separate entity or part");
		wordMap.put("denigrate", "attack reputation of;charge falsely or with malicious intent");
		wordMap.put("opaque", "not clearly understood or expressed");
		wordMap.put("implausible", "describing a statement that is not believable");
		wordMap.put("aberrant", "markedly different from an accepted norm");
		wordMap.put("bumbling", "lacking physical movement skills,expecially with the hands");
		wordMap.put("indifference", "the trait of seeming not to care");
		wordMap.put("ingratiate", "gain favor with somebody by deliberate efforts");
		wordMap.put("temperance", "trait of avoiding excesses");
		wordMap.put("myopic", "lacking foresight or imagination");
		wordMap.put("construe", "interpreted in a particular way");
		wordMap.put("expound", "add details or explanation;clarify the meaning;state in depth");
		wordMap.put("eradicate", "to completely destroy");
		wordMap.put("tortuous", "not straightforward");
		
		
		//questions words
		wordMap.put("tinged", "a slight but appreciable amount");
		wordMap.put("futile", "producing no result or effect");
		wordMap.put("promulgate", "state or announce");
		wordMap.put("enact", "order by virtue of superior authority; decree");
		wordMap.put("inchoate", "only partly in existence; imperfectly formed");
		wordMap.put("sartorial", "relating to tailoring, clothes, or style of dress");
		wordMap.put("salvation", "saving someone or something from harm");
		wordMap.put("strictures", "severe criticism");
		wordMap.put("discount", "bar from attention or consideration");
		wordMap.put("crestfallen", "brought low in spirit");
		wordMap.put("tax", "limit;make a charge against or accuse");
		wordMap.put("tarnish", "make dirty or spotty");
		wordMap.put("ominous", "threatening or foreshadowing evil or tragic developments");
		wordMap.put("robust", "sturdy and strong in form");
		wordMap.put("pervasive", "spreading or spread throughout");
		wordMap.put("curative", "tending to cure or restore to health");
		wordMap.put("refurbished", "make brighter and prettier");
		wordMap.put("celerity", "a rate that is rapid");
		wordMap.put("fecklessness", "worthlessness due to being feeble and ineffectual");
		wordMap.put("semblance", "an outward or token appearance or form that is deliberately misleading");
		wordMap.put("deliberation", "planning something carefully and intentionally");
		wordMap.put("uncanny", "operation of supernatural influences");
		wordMap.put("peripatetic", "a person who walks from place to place");
		wordMap.put("penurious", "excessively unwilling to spend;miserly;frugal");
		wordMap.put("vestige", "a trace of something that no longer exists");
		
		//common words 5
		wordMap.put("arcane", "requiring secret or mysterious knowledge");
		wordMap.put("percipitous", "done with very great haste");
		wordMap.put("pedestrian", "lacking imagination");
		wordMap.put("tractable", "readily reacting to suggestions and influences;easily managed");
		wordMap.put("brazen", "unrestrained by convention or propriety");
		wordMap.put("dilettante", "an amateur who engages in an activity without serious intentions and who pretends to have knowledge");
		wordMap.put("irrevocable", "incapable of being retracted or revoked");
		wordMap.put("sanction", "legal penalty for a forbidden action");
		wordMap.put("ravenous", "extremely hungry");
		wordMap.put("rescind", "cancel officially");
		wordMap.put("foment", "try to stir up public opinion");
		wordMap.put("munificent", "very generous");
		wordMap.put("circumscribe", "restrict or confine");
		wordMap.put("antithetical", "sharply contrasted in character or purpose");
		wordMap.put("lionize", "assign great social importance to");
		wordMap.put("gauche", "lacking social polish");
		wordMap.put("tempered", "moderated in effect");
		wordMap.put("prodigious", "so great in size or force or extent as to elicit awe");
		wordMap.put("awe", "respect mixed with fear or wonder");
		wordMap.put("winsome", "charming in a childlike or naive way");
		wordMap.put("inscrutable", "not easily understood;unfathomable");
		wordMap.put("insolent", "rude and arrogant");
		wordMap.put("ostracize", "exclude from a community or group");
		wordMap.put("vacillate", "ambivalent;undecided about something");
		wordMap.put("constituent", "an abstract part of something");
		wordMap.put("resurgent", "rising again as to new life and vigor");
		wordMap.put("propitious", "presenting favorable circumstance;likely to result in success");
		wordMap.put("intrepid", "fearless");
		
		
		//common words 6
		wordMap.put("specious", "plausible but false;deceptively pleasing#spurious");
		wordMap.put("jovial", "showing high-spirited merriment");
		wordMap.put("imprudent", "not wise");
		wordMap.put("truncate", "reduce the length of something");
		wordMap.put("impartial", "unbiased");
		wordMap.put("economical", "avoiding wasteful,efficient");
		wordMap.put("esoteric", "understandable by only an enlightened inner circle");
		wordMap.put("elicit", "call forth(emotions,feelings and responses)");
		wordMap.put("rebuke", "severely criticize#censure");
		wordMap.put("nuance", "a subtle difference in meaning or opinion");
		wordMap.put("posit", "assume as fact");
		wordMap.put("nonplussed", "unsure how to act or respond");
		wordMap.put("flux", "a state of uncertainty about what should be done(usually following important event)");
		wordMap.put("opulence", "wealth as evidenced by sumptuous living");
		wordMap.put("reproach", "express criticism");
		wordMap.put("duress", "compulsory force or threat");
		wordMap.put("mundane", "relating to the ordinary world;repetitive and boring");
		wordMap.put("dispassionate", "unaffected by strong emotion or prejudice");
		wordMap.put("askance", "with a look of suspicion or disapproval");
		wordMap.put("furtive", "marked by quiet and caution and secrecy;taking pains to avoid being observed");
		wordMap.put("arduous", "demanding considerable mental effort and skill;testing power of endurance");
		wordMap.put("misconstrue", "interpret in the wrong way");
		wordMap.put("harried", "troubled persistently especially with petty annoyances");
		wordMap.put("maladroit", "clumsy");
		wordMap.put("indecorous", "not keeping with accepted standards of what is right");
		wordMap.put("dilatory", "wasting time");
		wordMap.put("sullen", "showing a brooding ill humor");
		wordMap.put("brooding", "engaged in or showing deep thought about something that makes one sad, angry, or worried");
		wordMap.put("bolster", "support or strengthen");
		wordMap.put("craven", "pathetically cowardly");
		
		//basic words 1
		wordMap.put("stipend", "a regular allowance(of money)");
		wordMap.put("zenith", "the highest point#culminate#pinnacle#acme");
		wordMap.put("macabre", "suggesting the horror of death and decay#gruesome");
		wordMap.put("affluent", "wealthy");
		wordMap.put("thrifty", "spending money wisely");
		wordMap.put("telltale", "revealing");
		wordMap.put("demean", "to insult;to cause someone to lose dignity or respect");
		wordMap.put("summit", "a meeting of high-level leaders");
		wordMap.put("pine", "to yearn for");
		wordMap.put("mesmerize", "to spellbind");
		wordMap.put("peruse", "to read very carefully");
		wordMap.put("diabolical", "to be extremely wicked like the devil");
		wordMap.put("reprobate", "a person without morals who is disapproved of");
		wordMap.put("acme", "the highest point of achievement#zenith#pinnacle#culminate");
		wordMap.put("thoroughgoing", "very thorough;complete");
		wordMap.put("tirade", "an angry speech");
		wordMap.put("affable", "likeable;easy to talk to");
		wordMap.put("inflammatory", "extremely controversial#incendiary");
		wordMap.put("underwrite", "to support financially");
		wordMap.put("dog", "to pursue relentlessly#hound");
		wordMap.put("pinnacle", "highest point#zenith#acme#culminate#apex#heyday");
		wordMap.put("embroiled", "involved in argument#contention");
		wordMap.put("unnerve", "to make nervous or upset");
		wordMap.put("spendthrift", "one who spends money extravagantly");
		wordMap.put("slapdash", "carelessly and hastily put together");
		wordMap.put("indict", "to formally charge or accuse of wrongdoing");
		wordMap.put("screed", "an abusive rant(often tedious)");
		wordMap.put("dupe", "easily tricked or swindled");
		wordMap.put("hound", "to pursue relentlessly#dog");
		wordMap.put("serendipity", "the instance in which an accidental,fortunate discovery is made");
		
		//basic words 2
		wordMap.put("immaterial", "not relevant");
		wordMap.put("misanthrope", "a hater of mankind");
		wordMap.put("desecrate", "to willfully violate or destroy a sacred place");
		wordMap.put("cardinal", "of primary importance;funcdamental");
		wordMap.put("cadaverous", "emaciated;gaunt");
		wordMap.put("badger", "to pester");
		wordMap.put("ferret", "to search for something persistently");
		wordMap.put("exhort", "to strongly urge on;encourage");
		wordMap.put("replete", "completely stocked or furnished with something");
		wordMap.put("vicarious", "felt or undergone as if one were taking part in the experience or feelings of another");
		wordMap.put("heyday", "pinnacle#acme#culminate#zenith#apex");
		wordMap.put("hodgepodge", "a confusing mixture or jumble");
		wordMap.put("chauvinist", "a person who believes in the superiority of their group");
		wordMap.put("extenuating", "making less guilty or more forgivable");
		wordMap.put("unconscionable", "unreasonable;unscrupulous;excessive");
		wordMap.put("stem", "to hold back or limit the flow or growth of something");
		wordMap.put("sanctimonious", "make a show of being pious");
		wordMap.put("apex", "pinnacle#acme#culminate#zenith#heyday");
		wordMap.put("pittance", "a small amount(of money)");
		wordMap.put("sanguine", "cheerful;optimistic");
		wordMap.put("catalyst", "something that speeds up an event");
		wordMap.put("virago", "an ill-tempered or violent woman");
		wordMap.put("animosity", "intense hostility");
		
		//basic words 3
		wordMap.put("archaic", "so old as to appear to belong to a different period");
		wordMap.put("jocular", "characterized by jokes and good humor");
		wordMap.put("flounder", "behave awkwardly;have difficulties");
		wordMap.put("thwart", "hinder or prevent(the efforts,plans)#impede");
		wordMap.put("entice", "get someone to do something through(often false) promises");
		wordMap.put("elusive", "difficult to capture or remember");
		wordMap.put("plodding", "slow and laborious");
		wordMap.put("obdurate", "unable to be persuaded or moved emotionally;stubborn;unyielding");
		wordMap.put("incessant", "uninterrupted in time and indefinitely long");
		wordMap.put("fete", "to celebrate a person");
		wordMap.put("patronize", "treat condescendingly");
		wordMap.put("ascendancy", "the state that exists when one person or group has power over another");
		wordMap.put("appreciable", "large enough to be noticed");
		wordMap.put("moot", "open to argument or debate;undecidable");
		wordMap.put("impermeable", "does not allow fluids to pass through");
		wordMap.put("inclement", "showing no mercy;unpleasant,stormy");
		wordMap.put("advocate", "pleed for a cause#proponant");
		wordMap.put("avid", "marked by active interest and enthusiasm");
		wordMap.put("discriminate", "recognize or perceive the difference");
		wordMap.put("disheartened", "made less hopeful or enthusiastic");
		wordMap.put("boon", "very close and convivial;a desirable state");
		wordMap.put("deter", "try to prevent,show opposition to;turn away from by persuasion");
		wordMap.put("malleable", "easily influenced");
		wordMap.put("ornate", "marked by elaborate rhetoric and elaborated with decorative details");
		wordMap.put("transitory", "lasting a very short time");
		wordMap.put("snide", "expressive of contempt;deragotory or mocking in an indirect way");
		wordMap.put("endemic", "native;originating where it is found");
		wordMap.put("autonomously", "acting independently;self-governing");
		wordMap.put("guffaw", "laugh boisterously");
		wordMap.put("morose", "ill-tempered and not inclined to talk;gloomy");
		wordMap.put("muted", "softenend;subdued");
		wordMap.put("apprehension", "fearful expectation");
		wordMap.put("raffish", "marked by a carefree or disreputableness");
		wordMap.put("degrade", "reduce in worth or character,usually verbally");
		wordMap.put("quandary", "state of perplexity especially as requiring a choice between equally unfavourable options");
		wordMap.put("impede", "be a hindrance or obstacle to#thwart");
		wordMap.put("respite", "a pause from doing something(as work)");
		wordMap.put("resolve", "reach a conclusion after a discussion");
		wordMap.put("malady", "a disease or sickness");
		wordMap.put("stolid", "having or revealing little emotion or sensibility;not easily aroused or excited");
		
		
/*		wordMap.put("", "");
		wordMap.put("", "");
		wordMap.put("", "");
		wordMap.put("", "");
		wordMap.put("", "");
		wordMap.put("", "");
		wordMap.put("", "");*/
		
		return wordMap;
	}
	
}
