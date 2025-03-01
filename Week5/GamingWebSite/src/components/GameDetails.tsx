import { GridItem,Image, Stack } from "@chakra-ui/react";
import axios from "axios";
import React from "react";
import { useEffect, useState } from "react"
// import { ListFormat } from "typescript";


const GameDetails = () => {

  const [gameid, setId] = useState(Number);
  const [details,setDetails] = useState(Object);
  useEffect(() => {   
    setId(Number(window.location.pathname.split('/')[2]));
    fetchData(gameid)
  }, [gameid]);

  const fetchData  = async(gameid: number) => {
    const result = await axios.get(`https://api.rawg.io/api/games/${gameid}?key=8a48d53ca9c84722a12f731e4912a94e`)
    setDetails(result.data)
  }
  console.log(details)
  return (
      <GridItem w='100%' p={6}>
        <Image src={details.background_image} alt='Segun Adebayo' w='100%' h={'500px'} objectFit='cover' objectPosition={'0px 15%'}   borderRadius={4} />
        <Stack direction='row'>
        </Stack>
      </GridItem>
  )
}


export default GameDetails
