import { Card, CardBody, CardFooter, GridItem, SimpleGrid } from '@chakra-ui/react'
import { Button, ButtonGroup, Divider, Heading, Image, Stack, Text } from '@chakra-ui/react'
import { useEffect, useState } from 'react'
import axios from 'axios'
const GameCard = () => {

    const [response, getData] = useState([])

    useEffect(() => {
        const fetchData = async() => {
            const result = await axios.get('https://api.rawg.io/api/games?key=8a48d53ca9c84722a12f731e4912a94e')
            getData(result.data.results)
        }
        fetchData()
    },[])
    console.log(response)
  return (
    <SimpleGrid w='100%' minChildWidth='260px'  p={6} gap={6} >
        {response.map((item:any,key) => (
            <GridItem w='100%' key={key} >
                <Card maxW='sm' boxShadow={'4px 4px 15px rgb(0,0,0,0.15)'} >
                    <CardBody>
                        <Image src={item.background_image} alt='Segun Adebayo' />
                        <Stack mt='6' spacing='3'>
                        <Heading size='md'>{item.name}</Heading>
                        <Text>
                            This sofa is perfect for modern tropical spaces, baroque inspired
                            spaces, earthy toned spaces and for people who love a chic design with a
                            sprinkle of vintage design.
                        </Text>
                        <Text color='blue.600' fontSize='2xl'>
                            $450
                        </Text>
                        </Stack>
                    </CardBody>
                    <Divider />
                    <CardFooter>
                        <ButtonGroup spacing='2'>
                        <Button variant='solid' colorScheme='green' >
                            Buy now
                        </Button>
                        <Button variant='ghost' colorScheme='orange'>
                            Add to cart
                        </Button>
                        </ButtonGroup>
                    </CardFooter>
                </Card>
            </GridItem>
        ))}
        
    </SimpleGrid>


  )
}

export default GameCard
